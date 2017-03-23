/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alexandre.depembroke
 */
public class MySql {
    private List<String> messages = new ArrayList<>();
    Connection connexion = null;
    Statement statement = null;
    ResultSet result = null;
    
    public MySql(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java";
            String user = "root";
            String password = "root";
            
            connexion = (Connection) DriverManager.getConnection(url, user, password);
            statement = connexion.createStatement();
        }catch(Exception e){
            System.out.println("Erreur lors du chargement : le driver n'a pas été trouvé dans le classpath ! <br/>" + e.getMessage() );
        }
    }
    
    public List<String>  selectInfoBdd() throws SQLException{
        result = statement.executeQuery( "SELECT id, pseudo, score, heroType  FROM score;" );
        

        while( result.next() ) {
            int idUser = result.getInt("id");
            String pseudoUser = result.getString("pseudo");
            String scoreUser = result.getString("score");
            String heroTypeUser = result.getString("heroType");

            //Retour des données
            messages.add("\nDonnées retournées par la requete :\n id " + idUser + ",\n pseudo : " + pseudoUser + ",\n score : " + scoreUser + ",\n type de heros : " + heroTypeUser);
        }
        return messages;                
    }
    
    public void saveBdd(String pseudo, int score, String heroType) throws SQLException{
        int statut = statement.executeUpdate( "INSERT INTO score (pseudo, score, heroType) VALUES (' "+pseudo+" '  , " + score +  ",' " + heroType+" ' );" ); 
    }
    
}
