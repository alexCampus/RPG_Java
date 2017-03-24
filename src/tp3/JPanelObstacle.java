package tp3;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 */
public class JPanelObstacle extends JPanel implements Event {
    private JFrameMain fenetre;
    private JButton passObstacleBtn = new JButton("J'essaie de le franchir !");
    private JButton turnAroundBtn = new JButton("Je préfère faire demi-tour");
    private JButton continueBtn = new JButton("Continue");
    private JPanel panel1;

    JPanelObstacle(JFrameMain fen) throws MalformedURLException {

        Obstacle obstacle = new Obstacle();
        obstacle.eventObstacle();

        JLabel  img = new JLabel();
        img.setIcon(new ImageIcon(new URL(obstacle.imgUrl)));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JTextPane text = new JTextPane();
        Font font = new Font("Serif", Font.PLAIN, 25);
        text.setFont(font);
        text.setOpaque(false);
        text.setFocusable(false);
        text.setText("Vous vous retrouvez face à "+ obstacle.name);
        panel.add(text);

        this.fenetre = fen;
        this.setLayout(new BorderLayout());
        this.add(text,BorderLayout.NORTH);
        this.add(img,BorderLayout.CENTER);
        img.setHorizontalAlignment(JLabel.CENTER);

        JPanel subPanel = new JPanel();

        subPanel.add(passObstacleBtn);
        subPanel.add(turnAroundBtn);
        subPanel.add(continueBtn);
        continueBtn.setVisible(false);
        this.add(subPanel,BorderLayout.SOUTH);

        passObstacleBtn.addActionListener(e -> {

            int bonus = 7 * (fen.heros.speed - obstacle.level + 3);
            int dice = Random.dice(30);

            if(dice == 30) //REUSSITE CRITIQUE
            {
                int gain = Random.dice(10) + 5;
                text.setText("Wow ! Vous passez l'obstacle avec une facilité proche du surnaturel ! Cette réussite, bien que passagère," +
                        "vous permet de vous reposer et de regagner "+ gain + " pv. Vous continuez votre route.");
                fen.heros.setPlusPV(gain);
                continueBtn.setVisible(true);
                passObstacleBtn.setVisible(false);
                turnAroundBtn.setVisible(false);
            } else if (dice == 1) //ECHEC CRITIQUE
            {
                int perte = Random.dice(10) + (obstacle.level*obstacle.level);
                text.setText("Vous avez sous estimé l'obstacle et vous retrouvez empêtré pendant de longues heures. " +
                        "Vous finissez par vous sortir de ce pétrin et commencez à faire demi-tour, en boitillant. " +
                        "Les douleurs un peu partout dans votre corps vous font réfléchir à vos actes... Vous avez perdu " + perte + " pv." +
                        "Vous avez mal  à la cheville, vous avancerez donc ralenti.");
                fen.heros.setMoinsPV(perte);
                fen.heros.setMoinsSpeed(1);
                fen.Case -= Random.dice(10);
                continueBtn.setVisible(true);
                passObstacleBtn.setVisible(false);
                turnAroundBtn.setVisible(false);
            } else {
                if (dice + bonus > 30) {
                    if ((30 - bonus)/2 > dice) {
                        text.setText("Vous réussissez à passer l'obstacle, mais vous sentez qu'un peu de repos vous fera le plus grand bien. Votre prochain déplacement en sera peut-être affecté.");
                        this.fenetre.heros.obstacle++;
                        continueBtn.setVisible(true);
                        passObstacleBtn.setVisible(false);
                        turnAroundBtn.setVisible(false);
                    } else {
                        text.setText("L'obstacle ne vous oppose aucune résistance et vous continuez votre route.");
                        this.fenetre.heros.obstacle++;
                        continueBtn.setVisible(true);
                        passObstacleBtn.setVisible(false);
                        turnAroundBtn.setVisible(false);
                    }
                } else {
                    int malus = Random.dice(10) + (obstacle.level*obstacle.level);
                    text.setText("Vous avez sous estimé l'obstacle et vous retrouvez empêtré pendant de longues heures. " +
                            "Vous finissez par vous sortir de ce pétrin et commencez à faire demi-tour. " +
                            "Les douleurs un peu partout dans votre corps vous font réfléchir à vos actes... Vous avez perdu " + malus + " pv.");
                    fen.heros.setMoinsPV(malus);
                    fen.Case -= Random.dice(10);
                    continueBtn.setVisible(true);
                    passObstacleBtn.setVisible(false);
                    turnAroundBtn.setVisible(false);
                }
            }
        });

        turnAroundBtn.addActionListener(e -> {
            text.setText("L'obstacle vous semble vraiment infranchissable, vous décidez donc de faire demi-tour.");
            continueBtn.setVisible(true);
            passObstacleBtn.setVisible(false);
            turnAroundBtn.setVisible(false);
        });

        continueBtn.addActionListener(e -> fenetre.setContentPane( new JPanelMainMenu(fenetre)));
    }
}
