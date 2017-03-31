/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Loic.FOREST
 */
public class JPanelMainMenu extends javax.swing.JPanel implements Event{

    JFrameMain fenetre;
    int deplacement;
    Event ev;
    /**
     * Creates new form JPanelMainMenu
     */
    public JPanelMainMenu(JFrameMain fenetre) {

        initComponents();
        this.fenetre = fenetre;

        this.fenetre.setSize(800, 600);
        this.fenetre.tour++;
        this.tourLabel.setText("TOUR "+this.fenetre.tour);


        caseLabel.setText("Case "+this.fenetre.Case);
        SwingUtilities.updateComponentTreeUI(this.fenetre);
        dice.setText("Lancez les dés !");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tourLabel = new java.awt.Label();
        eventLabel = new java.awt.Label();
        caseLabel = new javax.swing.JLabel();
        deplacementLabel = new java.awt.Label();
        dice = new java.awt.Label();
        lancer = new java.awt.Button();
        continuBtn = new java.awt.Button();
        event = new java.awt.Label();

        setBackground(new java.awt.Color(51, 51, 51));

        tourLabel.setAlignment(java.awt.Label.CENTER);
        tourLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tourLabel.setForeground(new java.awt.Color(255, 255, 255));
        tourLabel.setName(""); // NOI18N
        tourLabel.setText("TOUR ...");

        eventLabel.setAlignment(java.awt.Label.CENTER);
        eventLabel.setForeground(new java.awt.Color(255, 255, 255));
        eventLabel.setName(""); // NOI18N

        caseLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        caseLabel.setForeground(new java.awt.Color(255, 255, 255));
        caseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caseLabel.setText("Case ...");

        deplacementLabel.setAlignment(java.awt.Label.CENTER);
        deplacementLabel.setForeground(new java.awt.Color(255, 255, 255));
        deplacementLabel.setName(""); // NOI18N
        deplacementLabel.setText("Vous avancez de ... case(s).");

        dice.setAlignment(java.awt.Label.CENTER);
        dice.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        dice.setForeground(new java.awt.Color(255, 255, 255));
        dice.setPreferredSize(new java.awt.Dimension(100, 100));
        dice.setText("1");

        lancer.setLabel("Lancer");
        lancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancerActionPerformed(evt);
            }
        });

        continuBtn.setLabel("Continuer");
        continuBtn.setVisible(false);
        continuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    continuBtnActionPerformed(evt);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(JPanelMainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        event.setAlignment(java.awt.Label.CENTER);
        event.setForeground(new java.awt.Color(255, 255, 255));
        event.setName(""); // NOI18N
        event.setText("Evenement :");
        event.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(eventLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tourLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(caseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(deplacementLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lancer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dice, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGap(4, 4, 4)
                .addComponent(deplacementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(eventLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(continuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancerActionPerformed
        this.lancer.setEnabled(false);
        Runnable runner = new Runnable()
            {
                public void run() {
                    int d1 = 0;
                    int d2 = 0;
                    int d3 = 0;
                    for (int i = 0; i <= 100; i++) {
                        if (i <= 50 ) {
                            d1 = Random.dice(6)-1;
                        }
                        if (i <= 75) {
                            d2 = Random.dice(6)-1;
                        }
                        d3 = Random.dice(6)-1;
                        if (fenetre.heros.speed == 1) {
                            dice.setText("1 + "+Integer.toString(d1));
                        }
                        else if (fenetre.heros.speed == 2) {
                            dice.setText("1 + "+Integer.toString(d1)+" + "+Integer.toString(d2));
                        } else {
                            dice.setText("1 + "+Integer.toString(d1)+" + "+Integer.toString(d2)+" + "+Integer.toString(d3));
                        }

                        try {
                            Thread.sleep(30);
                        } catch(InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }



                    if (fenetre.heros.speed == 1) {
                       deplacement =  d1 + 1;
                       deplacementLabel.setText("Vous avancez de "+deplacement+" case(s).");
                    }
                    else if (fenetre.heros.speed == 2) {
                         deplacement =  d1+d2+1;
                         deplacementLabel.setText("Vous avancez de "+deplacement+" case(s).");
                    } else {
                        deplacement = d1+d2+d3+1;
                        deplacementLabel.setText("Vous avancez de "+deplacement+" case(s).");
                    }

                    fenetre.Case = fenetre.Case + deplacement;
                    caseLabel.setText("Case "+fenetre.Case);
                    continuBtn.setVisible(true);
                    event.setVisible(true);
                    try {
                        newEvent();
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(JPanelMainMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }


            };
            Thread t = new Thread(runner, "Code Executé");

            t.start();


    }//GEN-LAST:event_lancerActionPerformed

    private void continuBtnActionPerformed(java.awt.event.ActionEvent evt) throws MalformedURLException {//GEN-FIRST:event_continuBtnActionPerformed

            if (this.ev instanceof javax.swing.JPanel) {
                this.fenetre.setContentPane((javax.swing.JPanel) this.ev);
                SwingUtilities.updateComponentTreeUI(this.fenetre);
            } else {
                Taverne taverne = new Taverne(this.fenetre.heros, this.fenetre);
            }


    }//GEN-LAST:event_continuBtnActionPerformed

    private void newEvent() throws MalformedURLException{
        if(this.fenetre.Case >= Tp3.NBCASES) {
            herosEnnemie hero = new herosEnnemie("Heros Légendaire", 10, 30);
            this.eventLabel.setText("Un héros vous barre la route ...");
            this.ev =new JPanelCombat(this.fenetre, hero);
        } else {

        int event = Random.event();

            switch(event) {
                case 0:
                    this.eventLabel.setText("Un nouvel ennemi vous attaque !");
                    this.ev = new JPanelCombat(this.fenetre);
                    break;
                case 1:
                    this.eventLabel.setText("Vous faites face à une taverne !");
                    this.ev = null;
                    break;
                case 2:
                    this.eventLabel.setText("Un obstacle vous barre la route !");
//                    Obstacle o = new Obstacle();
                    this.ev = new JPanelObstacle(this.fenetre);
                    break;
                case 3:
                    this.eventLabel.setText("Il ne passe rien... Pour le moment ...");
                    this.ev = new JPanelMainMenu(this.fenetre);
                    break;
            }
        }


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caseLabel;
    private java.awt.Button continuBtn;
    private java.awt.Label deplacementLabel;
    private java.awt.Label dice;
    private java.awt.Label event;
    private java.awt.Label eventLabel;
    private java.awt.Button lancer;
    private java.awt.Label tourLabel;
    // End of variables declaration//GEN-END:variables
}
