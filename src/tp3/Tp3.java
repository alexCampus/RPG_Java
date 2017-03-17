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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Initialisation scanner
        Scanner sc;
        sc = new Scanner(System.in);
        
         char reponse = ' ';
         int choix;
         
        
        do{
            Heros m = new Humain();
            Taverne n = new Taverne(m);
             n.eventTaverne();
             System.out.println(m.getPV());
            System.out.println(m.getForce());
            System.out.println(m.getSpeed());
            System.out.println("Bienvenue, allez vous reussir a sauver la Princesse....");
            System.out.println(" \n____________________\n\n 1 Commencer la partie,\n\n 2 Quitter \n____________________\n");
            choix = sc.nextInt();
            sc.nextLine();
            
            switch(choix)
            {
                case 1:
                    System.out.println("Lets go to the adventure!!!!");
                    reponse = 'O';
                    break;
                    
                case 2:
                    System.out.println("Au revoir");
                    reponse = 'O';
                    break;
                
                default:
                    reponse = 'N';
                    break;
            }
            
        }while(reponse != 'O');
        
        
        
        
    }
    
}
