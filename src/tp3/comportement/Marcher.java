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
public class Marcher implements Deplacement{
    
    public void deplacer() {
        System.out.println("Je me déplace en marchant.");
    }
    
    public void deplacerAvec(int nbPas) {
        System.out.println("Je me déplace en marchant.Et je fais " + nbPas + " pas");
    }
    
}
