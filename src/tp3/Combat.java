/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author Loic.FOREST
 */
public class Combat {
    private Ennemies ennemie;
    private Heros heros;
    
    public Combat(Heros heros) {
        this.heros= heros;
        this.ennemie = Random.ennemie();
        
    }
    
    public void debutDuCombat(){
        System.out.print("Vous vous faites attaquer !");
        
    }
    
    public void choix() {
        System.out.print("");
    }
}
