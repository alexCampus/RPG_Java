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
public class Centaure extends Ennemies{
    
    
    public Centaure(){
       super("centaure", 3);
       this.PV = 120;
       this.force = 25;
    }
    
    public Centaure(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
