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
       
    }
    
    public Centaure(Power esprit, Soin soin, Deplacement dep, int PV, int force, int speed) {
        super(esprit, soin, dep, PV, force, speed);
  }
}
