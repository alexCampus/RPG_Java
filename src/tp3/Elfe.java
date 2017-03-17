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
        this.PV = 100;
        this.force = 0;
        this.speed = 2;
        this.power = new PowerMagie();
        this.deplacement = new Courir();
        this.psoin = 33;
        
    }
    
    public Elfe(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
