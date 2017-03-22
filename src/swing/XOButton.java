package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by AlpenYeti on 21/03/2017.
 */
public class XOButton extends JButton implements ActionListener {
    ImageIcon X,O;
    byte value = 0;
    /*
    * 0 : rien
    * 1 : X
    * 2 : O
    */

    public XOButton(){
        X = new ImageIcon(this.getClass().getResource("X.png"));
        O = new ImageIcon(this.getClass().getResource("O.png"));
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        value ++;
        value %= 3;
        switch (value){
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(X);
                break;
            case 2:
                setIcon(O);
                break;
        }
    }
}
