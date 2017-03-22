package swing;

import javax.swing.*;

/**
 * Created by AlpenYeti on 21/03/2017.
 */
public class Window extends JFrame {

    JPanel p = new JPanel();
    JButton click = new JButton("Click Me !");
    JButton noClick = new JButton("No, click me !");
    JTextField text = new JTextField("Wow",5);
    JTextArea area = new JTextArea("This one \n works on several \n lines",5,20);
    JLabel label = new JLabel("<html><p>Title of all this. It might be a bit longer than expected, but I still love it a lot. <br/> What if it was way longer than that ? Would it fit the window, still ?" +
            "I think not !</p></html>");
    String choices[] = {"Bite","Poil","Couille","Chatte"};
    JComboBox cb = new JComboBox(choices);

    public Window() {
        super("RPG_JAVA");
        setSize(600, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(p);
        p.add(label);
        p.add(click);
        p.add(noClick);
        p.add(text);
        p.add(area);
        p.add(cb);

        setVisible(true);
    }
}