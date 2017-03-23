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
            text.setText("Vous réussissez à passer l'obstacle, mais vous sentez qu'un peu de repos vous fera le plus grand bien. Votre prochain déplacement en sera peut-être affecté.");
            continueBtn.setVisible(true);
            passObstacleBtn.setVisible(false);
            turnAroundBtn.setVisible(false);
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
