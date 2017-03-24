/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import javax.swing.ImageIcon;

/**
 *
 * @author alexandre.depembroke
 */
public class Nain extends Heros {

    public Nain(String nom) {
        this.PV = 100;
        this.force = 30;
        this.speed = 1;
        this.psoin = 33;
        this.nom = nom;
        this.avatar = new ImageIcon(this.getClass().getResource("dwarf.png"));
    }
}