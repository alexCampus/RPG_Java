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
public class Elfe extends Heros{
    
    public Elfe(String nom){
        this.PV = 100;
        this.force = 10;
        this.speed = 3;
        this.power = new PowerMagie();
        this.deplacement = new Courir();
        this.psoin = 25;
        this.nom = nom;
        this.avatar = new ImageIcon(this.getClass().getResource("elf.png"));
        
    }
    
    public Elfe(Power esprit, Soin soin, Deplacement dep) {
        super(esprit, soin, dep);
  }
}
