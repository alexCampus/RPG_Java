package swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AlpenYeti on 21/03/2017.
 */
public class Morpion extends JFrame{

    JPanel p = new JPanel();
    XOButton buttons[] = new XOButton[9];

    public static void main(String[] args) {
        new Morpion();
    }

    public Morpion(){
        super("Morpion");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        p.setLayout(new GridLayout(3,3));
        for(int i = 0;i<9;i++){
            buttons[i] = new XOButton();
            p.add(buttons[i]);
        }
        add(p);

        setVisible(true);
    }
}
