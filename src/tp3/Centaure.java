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
public class Centaure extends Ennemies{
    
    
    public Centaure(){
       super("Centaure", 3);
       this.PV = 100;
       this.PVmax = this.PV;
       this.force = 20;
       this.avatar = new ImageIcon(this.getClass().getResource("centaure.png"));
    }
    
    public Centaure(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
