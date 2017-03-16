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
public class PremierSoin implements Soin{
    
    public void soigne(){
        System.out.println("Je sais donner des soins");
    }
    
    public void soigneAvec(int force){
        System.out.println("Je donne des soins de " + force + " points de vie");
    }
    
}
