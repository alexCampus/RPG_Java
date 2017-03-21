/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import tp3.comportement.*;

/**
 *
 * @author alexandre.depembroke
 */
public class Ennemies extends Combatant{
    
    
    private int poursuite;
    
    public Ennemies(String nom, int p){
        this.nom = nom;
        this.poursuite = 0;
    }
   
    public Ennemies(Power power, Soin soin, Deplacement dep){
        this.deplacement = dep;
        this.power = power;
        this.soin = soin;
      
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getPoursuite(){
        return this.poursuite;
    }
}
