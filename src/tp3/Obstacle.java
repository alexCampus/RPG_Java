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
public class Obstacle {

    String name;
    ImageIcon imgUrl;
    int level;

    public Obstacle(){    }

    public void eventObstacle() {
        int random = Random.dice(5);
        switch(random) {
            case 1:
                name = "un pont écroulé";
                level = 5;
                imgUrl = new ImageIcon(this.getClass().getResource("tronc.gif"));
                break;
                

            case 2:
                name = "un pont en très mauvais état";
                level = 3;
                imgUrl = new ImageIcon(this.getClass().getResource("tronc.gif"));
                break;

            case 3:
                name = "un tronc en travers de la route";
                level = 1;
                imgUrl = new ImageIcon(this.getClass().getResource("tronc.gif"));
                break;

            case 4:
                name = "une rivière";
                level = 2;
                imgUrl = new ImageIcon(this.getClass().getResource("tronc.gif"));
                break;

            case 5:
                name = "un éboulement";
                level = 4;
                imgUrl=new ImageIcon(this.getClass().getResource("tronc.gif"));
        }
    }
}