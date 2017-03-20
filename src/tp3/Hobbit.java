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
public class Hobbit extends Heros{
    
    public Hobbit(){
        this.PV = 100;
        this.force = 20;
        this.speed = 10;
        this.psoin = 50;

    }
    
    public Hobbit(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
