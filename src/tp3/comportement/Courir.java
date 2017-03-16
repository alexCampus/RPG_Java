/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.comportement;

/**
 *
 * @author alexandre.depembroke
 */
public class Courir implements Deplacement{
        
    public void deplacer() {
        System.out.println("Je me déplace en courant.");
    }
    
    public void deplacerAvec(int nbPas) {
        System.out.println("Je me déplace en courant. Et je fais " + nbPas + " pas");
    }
    
}
