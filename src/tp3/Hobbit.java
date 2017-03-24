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
public class Hobbit extends Heros{
    
    public Hobbit(String nom){
        this.PV = 100;
        this.force = 20;
        this.speed = 2;
        this.psoin = 50;
        this.nom = nom;
        this.avatar = new ImageIcon(this.getClass().getResource("hobbit.png"));
    }
}
