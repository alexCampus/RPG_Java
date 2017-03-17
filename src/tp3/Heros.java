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
public class Heros extends Combatant{
    
    
   public Heros(){
   }
   
    public Heros(Power power, Soin soin, Deplacement dep){
        this.deplacement = dep;
        this.power = power;
        this.soin = soin;
       /* this.PV = PV;
        this.force = force;
        this.speed = speed;*/
    }
    
   
    
}
