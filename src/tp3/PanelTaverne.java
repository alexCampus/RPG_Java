/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author alexandre.depembroke
 */
public class PanelTaverne extends JFrame{

    JFrameMain fenetre;
    Taverne taverne; 
    private Button continuBtn = new java.awt.Button();
    private Button exitBtn = new java.awt.Button();
    boolean a = false;
    
    public PanelTaverne(JFrameMain fenetre, Taverne taverne) throws MalformedURLException{
        super();
        this.fenetre = fenetre;
        this.taverne = taverne;
        fenetre.setContentPane(accueilTaverne());
    }
    
    public PanelTaverne(String taverneText, String linkImg, JFrameMain fenetre, boolean a) throws MalformedURLException{
       
        super();
        
         this.fenetre = fenetre;
        fenetre.setContentPane(buildContentPane(taverneText,linkImg,a));
    }
    
    private JPanel buildContentPane(String taverneText, String linkImg, boolean a) throws MalformedURLException
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
        
        
        if(a == true){
            continuBtn.addActionListener(this::combatBtnActionPerformed);
        }else
        {
            continuBtn.addActionListener(this::continuBtnActionPerformed);
        }
        
       
        return panel;
    }
    
   


    private JPanel accueilTaverne() throws MalformedURLException {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
       
        JTextPane text = new JTextPane();
        Font font = new Font("Serif", Font.ITALIC, 25);
        text.setFont(font);
        text.setOpaque(false);
        text.setFocusable(false);
        text.setText("Bienvenue dans la Taverne, voulez vous entrer?");
        panel.add(text);


         JLabel  img = new JLabel();
         img.setIcon(new ImageIcon(new URL("http://vignette1.wikia.nocookie.net/thetheriansaga/images/b/b7/Pic_taverne-1-.gif/revision/latest?cb=20121205032207&path-prefix=fr")));
         img.setSize(250, 250);
         panel.add(img);

         continuBtn.setActionCommand("");
         continuBtn.setLabel("Continuer");
         continuBtn.setVisible(true);
         panel.add(continuBtn);
         
        exitBtn.setActionCommand("");
        exitBtn.setLabel("Quitter");
        exitBtn.setVisible(true);
        panel.add(exitBtn);

         exitBtn.addActionListener(this::continuBtnActionPerformed);
         continuBtn.addActionListener(this::taverneBtnActionPerformed);
         return panel;
    }
    
    
    
    
     private void continuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuBtnActionPerformed
         if(this.fenetre.heros.getPV() <= 0) {
            this.fenetre.setContentPane(new JPanelLose(this.fenetre));
        }
         this.fenetre.setContentPane(new JPanelMainMenu(this.fenetre));
        
    }//GEN-LAST:event_continuBtnActionPerformed
     
     private void combatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuBtnActionPerformed
         if(this.fenetre.heros.getPV() <= 0) {
            this.fenetre.setContentPane(new JPanelLose(this.fenetre));
        }
         this.fenetre.setContentPane(new JPanelCombat(this.fenetre));
        
    }//GEN-LAST:event_continuBtnActionPerformed
    
    private void taverneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuBtnActionPerformed
         if(this.fenetre.heros.getPV() <= 0) {
            this.fenetre.setContentPane(new JPanelLose(this.fenetre));
        }

        try {
            this.taverne.eventTaverne(this.fenetre);
        } catch (MalformedURLException ex) {
            Logger.getLogger(PanelTaverne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_continuBtnActionPerformed
  
}
