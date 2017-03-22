/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;


/**
 *
 * @author alexandre.depembroke
 */
public class PanelTaverne extends JFrame{

    JFrameMain fenetre;
    private Button continuBtn = new java.awt.Button();
    
    
    public PanelTaverne(String taverneText, String linkImg, JFrameMain fenetre) throws MalformedURLException{
       
        super();
         this.fenetre = fenetre;
        fenetre.setContentPane(buildContentPane(taverneText,linkImg));
    }
    
    private JPanel buildContentPane(String taverneText, String linkImg) throws MalformedURLException
    {
       JPanel panel = new JPanel();
       panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       
       JTextPane text = new JTextPane();
       Font font = new Font("Serif", Font.ITALIC, 25);
       text.setFont(font);
       text.setOpaque(false);
       text.setFocusable(false);
       text.setText(taverneText);
       panel.add(text);
       
      
        JLabel  img = new JLabel();
        img.setIcon(new ImageIcon(new URL(linkImg)));
        panel.add(img);
        
        continuBtn.setActionCommand("");
        continuBtn.setLabel("Continuer");
        continuBtn.setVisible(true);
        panel.add(continuBtn);
        
        continuBtn.addActionListener(this::continuBtnActionPerformed);
       
        return panel;
    }
    
    private void continuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuBtnActionPerformed
         if(this.fenetre.heros.getPV() <= 0) {
            this.fenetre.setContentPane(new JPanelLose(this.fenetre));
        }
         this.fenetre.setContentPane(new JPanelMainMenu(this.fenetre));
        
    }//GEN-LAST:event_continuBtnActionPerformed
  
}
