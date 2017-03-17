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
        this.force = 10;
        this.speed = 20;
        this.power = new PowerMagie();
        this.deplacement = new Courir();
        
    }
    
    public Elfe(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
