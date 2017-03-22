package tp3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class JPanelObstacle extends JPanel implements Event {
    private boolean isBloquant;
    private  int level;
    private JFrameMain fenetre;

    JLabel text = new JLabel("Vous tombez face à un obstacle.");
    JButton passObstacleBtn = new JButton("J'essaie de le franchir !");
    JButton turnAroundBtn = new JButton("Je préfère faire demi-tour");
    JButton continueBtn = new JButton("Continue");

    public JPanelObstacle(JFrameMain fen){
        this.fenetre = fen;
        this.isBloquant = Random.boolObsctacle();
        this.level = Random.dice(2);
        this.add(text);
        this.add(passObstacleBtn);
        this.add(turnAroundBtn);
        this.add(continueBtn);
        continueBtn.setVisible(false);
        passObstacleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("Vous réussissez à passer l'obstacle, mais vous sentez qu'un peu de repos vous fera le plus grand bien. Votre prochain déplacement en sera peut-être affecté.");
                continueBtn.setVisible(true);
                passObstacleBtn.setVisible(false);
                turnAroundBtn.setVisible(false);
            }
        });
        turnAroundBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("L'obstacle vous semble vraiment infranchissable, vous décidez donc de faire demi-tour.");
                continueBtn.setVisible(true);
                passObstacleBtn.setVisible(false);
                turnAroundBtn.setVisible(false);
            }
        });
        continueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fenetre.setContentPane( new JPanelMainMenu(fenetre));
            }
        });
    }
//
//    public boolean getIsBloquant(){
//        return isBloquant;
//    }
//
//    public int getLevel(){
//        return level;
//    }

    //public void eventObstacle(){
//        if(this.getIsBloquant()){ //   CHECK obstacle.isBloquant()
//            System.out.println();
//            Tp3.Case -= (int)Math.round((Tp3.deplacement)*0.70);
//        }
//      }

}
