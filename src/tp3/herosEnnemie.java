/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import javax.swing.ImageIcon;

/**
 *
 * @author Loic.FOREST
 */
public class herosEnnemie extends Ennemies{
    
    public herosEnnemie(String nom, int p, int force) {
        super(nom, p);
        this.avatar = new ImageIcon(this.getClass().getResource("Heros.png"));
        this.PV = 100;
        this.PVmax = this.PV;
        this.force = force;
    }
    
}
