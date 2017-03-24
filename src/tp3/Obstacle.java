/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author alexandre.depembroke
 */
public class Obstacle {

    String name;
    String imgUrl;
    int level;

    public Obstacle(){    }

    public void eventObstacle() {
        int random = Random.dice(5);
        switch(random) {
            case 1:
                name = "un pont écroulé";
                level = 5;
                imgUrl = "http://imgur.com/eoba5O8.png";
                break;

            case 2:
                name = "un pont en très mauvais état";
                level = 3;
                imgUrl = "http://imgur.com/jtkeatF.png";
                break;

            case 3:
                name = "un tronc en travers de la route";
                level = 1;
                imgUrl = "https://media.giphy.com/media/14tR7xWjt35KJW/giphy.gif";
                break;

            case 4:
                name = "une rivière";
                level = 2;
                imgUrl = "https://media.giphy.com/media/2csuIJj6TmuKA/giphy.gif";
                break;

            case 5:
                name = "un éboulement";
                level = 4;
                imgUrl="https://media.giphy.com/media/3orifeU2nD28a5c1OM/giphy.gif";
        }
    }
}