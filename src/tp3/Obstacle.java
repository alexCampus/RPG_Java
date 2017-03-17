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

    private boolean isBloquant;
    private  int level;
    
    public Obstacle(boolean isBloquant, int level){
        this.isBloquant = isBloquant; 
        this.level = level;
    }
    
    //ACCESSEUR
    
    public boolean getIsBloquant(){
        return isBloquant;
    }
    
    public int getLevel(){
        return level;
    }
    
}
