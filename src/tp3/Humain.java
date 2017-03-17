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
public class Humain extends Heros{
    
    public Humain(){
       this.PV = 100;
<<<<<<< HEAD:src/tp3/Humain.java
       this.force = 20;
       this.speed = 10;
=======

       this.force = 20;
       this.speed = 10;
       this.psoin = 33;

>>>>>>> origin/develop:src/tp3/Humain.java
    
    }
    
    public Humain(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
    
    
}
