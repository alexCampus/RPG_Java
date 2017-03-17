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
public class Ogre extends Ennemies{
    
     public Ogre(){
       super("ogre", 2);
       this.PV = 100;
       this.force = 15;
    }
    
    public Ogre(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
