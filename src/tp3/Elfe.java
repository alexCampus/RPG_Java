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
public class Elfe extends Heros{
    
    public Elfe(){
        this.power = new PowerMagie();
        this.deplacement = new Courir();
        
    }
    
    public Elfe(Power esprit, Soin soin, Deplacement dep, int PV, int force, int speed) {
        super(esprit, soin, dep, PV, force, speed);
  }
}
