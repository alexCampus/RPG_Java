/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import tp3.comportement.*;


/**
 *
 * @author alexandre.depembroke
 */
abstract class Combatant {
    protected String nom;
    protected Power power = new PowerArme();
    protected Soin soin = new PremierSoin();
    protected Deplacement deplacement = new Marcher();
    protected int score;
    protected int psoin;
    protected int PV;
    protected int PVmax = 100; 
    protected int force;
    protected int speed;
    protected ArrayList<Combatant> tableauDeChasse = new ArrayList<>();
    protected ImageIcon avatar;
    public int tour;
    public int Case;
    public int PVwon;
    public int PVlost;
    public int taverne;
    public int obstacle;
    protected int poursuite;
    
    public Combatant(){}
    
    public Combatant(Power power, Soin soin, Deplacement deplacement){
        this.power = power;
        this.soin = soin;
        this.deplacement = deplacement;

    }
    
    public void seDeplacer(int nbPas){
        deplacement.deplacerAvec(nbPas);
    }
    
    public double seSoigner(){
        double soi = (double) Math.round((this.PVmax-this.PV)*(this.psoin)/100);
        this.setPlusPV(soi);
        return soi;
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
    
     public void setPlusPV(double nbPV){
         int a = (int) (PV +nbPV);
         PVwon += (int) nbPV;
         if(a < PVmax)
         {
             PV += (int) nbPV;
             
         }
         else{
             PV = PVmax;
         }
        
    }
    
    public void setMoinsPV(int nbPV){
        PVlost += nbPV;
        int a = PV - nbPV;
        if(a > 0){
            PV  -= nbPV;
        }
        else{
            PV = 0;
        }
    }
    
    public void setPlusForce(int nbForce){
        force += nbForce;
    }
    
    public void setMoinsForce(int nbForce){
        force -= nbForce;
    }
    
    public void setPlusSpeed(int nbSpeed){
        if (speed < 3) {
            speed += nbSpeed;
        }
        
    }
    
    public void setMoinsSpeed(int nbSpeed){
        if (speed > 1) {
            speed -= nbSpeed;
        }   
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public int getPoursuite(){
        return this.poursuite;
    }
    
}
