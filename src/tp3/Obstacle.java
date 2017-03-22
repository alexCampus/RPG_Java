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

    public void eventObstacle(){
        System.out.println("Un obstacle encombre votre route.");
        if(this.getIsBloquant()){ //   CHECK obstacle.isBloquant()
            System.out.println("L'obstacle semble vraiment infranchissable, vous décidez donc de faire demi-tour.");
            Tp3.Case -= (int)Math.round((Tp3.deplacement)*0.70);
        } else {
            System.out.println("Vous pensez pouvoir le franchir.\n" +
                    "1 - J'essaie de le franchir !\n" +
                    "2 - Non, je préfère faire demi-tour et trouver un autre chemin");
            Tp3.choix = Tp3.sc.nextLine();
            switch(Tp3.choix){
                case "1":
                    //QUI PEUT PASSER L'OBSTACLE, DANS QUELLES CONDITIONS
                    System.out.println("Vous réussissez à passer l'obstacle, mais vous sentez qu'un peu de repos vous fera le plus grand bien.\n" +
                            "Votre prochain déplacement en sera peut-être affecté.");
                    break;
                case "2":
                    System.out.println("L'obstacle vous semble vraiment infranchissable, vous décidez donc de faire demi-tour.");
                    break;
            }
        }
    }
}
