/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import javax.swing.ImageIcon;
import tp3.comportement.*;

/**
 *
 * @author alexandre.depembroke
 */
public class Ogre extends Ennemies{
    
     public Ogre(){
       super("Ogre", 2);
       this.PV = 200;
       this.PVmax = this.PV;
       this.force = 30;
       this.avatar = new ImageIcon(this.getClass().getResource("ogre.png"));
    }
    
    public Ogre(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
