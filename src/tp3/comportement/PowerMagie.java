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
public class PowerMagie implements Power {
    
    public void combat() {
        System.out.println("Je sais faire de la magie");
    }
    
    public void combatAvec(String arme, int force) {
        System.out.println("Je combats avec " + arme + " qui a une force de " + force);
    }
    
}
