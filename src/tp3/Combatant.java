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
    
    protected int psoin;
    protected int PV;
    protected int PVmax; 
    protected int force;
    protected int speed;
    
    public Combatant(){}
    
    public Combatant(Power power, Soin soin, Deplacement deplacement){
        this.power = power;
        this.soin = soin;
        this.deplacement = deplacement;
        this.PVmax = 100;
       /* this.PV = PV;
        this.force = force;
        this.speed = speed;*/

    }
    
    public void seDeplacer(int nbPas){
        deplacement.deplacerAvec(nbPas);
    }
    
    public void seSoigner(){
        soin.soigneAvec((this.PVmax-this.PV)*(this.psoin/10));
    }
    
    public void combattre(String arme, int force){
        power.combatAvec(arme, force);
    }
    
    public int getPV(){
        return PV;
    }
    
    public int getForce(){
        return force;
    }
    
    public int getSpeed(){
        return speed;
    }
    
     public void setPlusPV(int nbPV){
        PV += nbPV;
    }
    
    public void setMoinsPV(int nbPV){
        PV  -= nbPV;
    }
    
    public void setPlusForce(int nbForce){
        force += nbForce;
    }
    
    public void setMoinsForce(int nbForce){
        force -= nbForce;
    }
    
    public void setPlusSpeed(int nbSpeed){
        speed += nbSpeed;
    }
    
    public void setMoinsSpeed(int nbSpeed){
        speed -= nbSpeed;
    }
    
}
