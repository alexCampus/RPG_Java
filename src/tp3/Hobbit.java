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
public class Hobbit extends Heros{
    
    public Hobbit(String nom){
        this.PV = 100;
        this.force = 20;
        this.speed = 1;
        this.psoin = 66;
        this.nom = nom;
        this.avatar = new ImageIcon(this.getClass().getResource("hobbit.png"));


    }
    
    public Hobbit(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
