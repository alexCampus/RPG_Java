/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;
import java.util.Scanner;
import tp3.comportement.*;
/**
 *
 * @author alexandre.depembroke
 */
public class Tp3 {

        static Scanner sc = new Scanner(System.in);

        static int nbTours = 0;
        static boolean exitMain = false;
        static String choix;
        static int deplacement;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Initialisation scanner
        
        do{
            System.out.println("Bienvenue, allez vous reussir a sauver la Princesse....");

            System.out.println(
                    "\n____________________\n\n " +
                    "1 Commencer la partie \n\n " +
                    "2 Quitter                  " +
                    "\n____________________   \n");
            choix = sc.nextLine();
            
            switch(choix)
            {
                case "1":
                    System.out.println(
                            "Bienvenue dans une histoire dont VOUS serez le héros !\n" +
                            "Dans ce jeu, vous allez progresser sur un plateau constitué\n" +
                                    "de 100 cases.\n" +
                                    "Au hasard, des chemins, vous rencontrerez des événements\n" +
                                    "et essaierez d'y survivre.");
                    tour();
                    break;
                    
                case "2":
                    System.out.println("Au revoir");
                    exitMain = false;
                    break;
                
                default:
                    System.out.println("\u001B[41mL'option " + choix + " n'est pas valide.\u001B[m");
            }
            
        }while(!exitMain);
        
    }

    private static void tour(){
        System.out.println(
                "\n" +
                "Quelle race de héros voulez vous incarner ?\n\n" +
                "1 - Je veux être fort ! Je serai assez lent, mais je briserai tous ceux qui se mettront sur ma route !\n" +
                "2 - Je veux être rapide et agile. La force ne sera pas mon point fort, mais personne ne me rattrapera !\n" +
                "3 - Peu m'importe la force ou la rapidité, je veux pouvoir me soigner. Personne ne pourra me vaincre !\n" +
                "4 - Je ne sais pas trop chisir, je préfererai être polyvalent et parer à toutes les situations !\n");
        String choiceRace = sc.nextLine();
        switch (choiceRace){
            case "1" :
                System.out.println("Vous serez donc un nain !");
                break;
            case "2" :
                System.out.println("Vous serez donc un elfe !");
                break;
            case "3" :
                System.out.println("Vous serez donc un hobbit !");
                break;
            case "4" :
                System.out.println("Vous serez donc un humain !");
                break;
        }

        while (nbTours < 100) {
            nbTours += 1;
            System.out.println("Tour \u001B[32m" + nbTours + "\u001B[m");
            System.out.println("Vous avez avancé de " + deplacement + " cases.");
            sc.nextLine();
        }
        System.out.println("Bravo ! Vous avez réussi à terminer cette histoire ! à bientôt pour de nouvelles aventures");
        exitMain = true;
    }
}
