/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Loic.FOREST
 */
public class Random {
    
    
    //Retourne un ennemie aléatoire
    public static Ennemies ennemie(){
        Ennemies ennemie = null;
        
        
        int i = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        
        if ( i > 9) {
            ennemie = new Ogre();
        } else if (i > 6) {
            ennemie = new Centaure();
        } else {
            ennemie = new Zombie();
        }
        
        return ennemie;
    }
    
    public static int typeAttaque() {
        int i = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        
        return i;
    }
}
