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
public class Zombie extends Ennemies{
    
    public Zombie(){
       super("Zombie", 1);
       this.PV = 40;
       this.PVmax = this.PV;
       this.force = 10;
       this.avatar = new ImageIcon(this.getClass().getResource("zombie.png"));
    }
    
    public Zombie(Power esprit, Soin soin, Deplacement dep) {
       super(esprit, soin, dep);
  }
}
