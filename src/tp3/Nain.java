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
public class Nain extends Heros{
    
    public Nain(){
        this.PV = 100;
        this.force = 30;
        this.speed = 15;
        this.psoin = 10;

    }
    
    public Nain(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
    
    
    
}
