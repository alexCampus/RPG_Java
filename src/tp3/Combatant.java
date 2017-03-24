/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author alexandre.depembroke
 */
abstract class Combatant {
    protected String nom;
    int score;
    int psoin;
    protected int PV;
    int PVmax = 100;
    protected int force;
    int speed;
    ArrayList<Combatant> tableauDeChasse = new ArrayList<>();
    protected ImageIcon avatar;
    int tour;
    int Case;
    int PVwon;
    int PVlost;
    int taverne;
    int obstacle;
    int poursuite;
    
    public Combatant(){}

    
    double seSoigner(){
        double soi = (double) Math.round((this.PVmax-this.PV)*(this.psoin)/100);
        this.setPlusPV(soi);
        return soi;
    }
    
    public int getPV(){
        return PV;
    }
    
    public int getForce(){
        return force;
    }
    
    int getSpeed(){
        return speed;
    }
    
     void setPlusPV(double nbPV){
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
    
    void setMoinsPV(int nbPV){
        PVlost += nbPV;
        int a = PV - nbPV;
        if(a > 0){
            PV  -= nbPV;
        }
        else{
            PV = 0;
        }
    }
    
    void setPlusForce(int nbForce){
        force += nbForce;
    }
    
    void setMoinsForce(int nbForce){
        force -= nbForce;
    }
    
    void setPlusSpeed(int nbSpeed){
        if (speed < 3) {
            speed += nbSpeed;
        }
        
    }
    
    void setMoinsSpeed(int nbSpeed){
        if (speed > 1) {
            speed -= nbSpeed;
        }   
    }
    
    String getNom(){
        return this.nom;
    }
    
    int getPoursuite(){
        return this.poursuite;
    }
    
}
