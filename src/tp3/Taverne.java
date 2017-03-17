/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author alexandre.depembroke
 */
public class Taverne {
    
    private int nb;
    private Heros monHero;
    
    public Taverne(Heros monHero){
        this.monHero = monHero;
        nb = (int)(Math.random() *5);
       
    }
    
    public void eventTaverne(){
        switch(nb){
            case 1:                
                int nbPV = (int)(Math.random() * 20);
                System.out.println("Vous venez de retrouver un de vos vieux amis, après avoir passé une bonne soirée en sa présence.\nCela vous a permis de regagner " + nbPV + " points de vie.");                
                monHero.setPlusPV(nbPV); 
                break;
                
            case 2:
                System.out.println("Je suis le choix " + nb);
                break;
                
            case 3:
                System.out.println("Je suis le choix " + nb);
                break;
            
            case 4:
                System.out.println("Je suis le choix " + nb);
                break;
                
            default:
                System.out.println("Vous avez profité d'une bonne nuit de repos au sein de la taverne.\n Bonne continuation pour votre aventure");
                break;
        }
    }
    
}
