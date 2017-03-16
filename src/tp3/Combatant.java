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
abstract class Combatant {
    
    protected Power power = new PowerArme();
    protected Soin soin = new PremierSoin();
    protected Deplacement deplacement = new Marcher();
    
    protected int PV = 100; 
    
    public Combatant(){}
    
    public Combatant(Power power, Soin soin, Deplacement deplacement){
        this.power = power;
        this.soin = soin;
        this.deplacement = deplacement;
    }
    
    public void seDeplacer(int nbPas){
        deplacement.deplacerAvec(nbPas);
    }
    
    public void seSoigner(int force){
        soin.soigneAvec(force);
    }
    
    public void combattre(String arme, int force){
        power.combatAvec(arme, force);
    }
    
    public int getPV(){
        return PV;
    }
    
    
}
