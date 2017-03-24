/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;



import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author Loic.FOREST
 */
public class JPanelCombat extends javax.swing.JPanel implements Event{
    
    private Combatant ennemie;
    ImageIcon ennImgIcon;
    private boolean soin = true;
    private boolean end = false;
    JFrameMain fenetre;
    
    
    /**
     * Creates new form JPanelCombat
     */
    public JPanelCombat(JFrameMain fen){
        this.fenetre = fen;
        this.ennemie = Random.ennemie();
        
        initComponents();
        
        ennemiNom.setText(this.ennemie.getNom());
        pvEnnemi.setMaximum(this.ennemie.PVmax);
        pvEnnemi.setValue(this.ennemie.PV);
        pvHeros.setMaximum(this.fenetre.heros.PVmax);
        pvHeros.setValue(this.fenetre.heros.PV);
        pvHeroLabel.setText(this.fenetre.heros.getPV()+"/"+this.fenetre.heros.PVmax);
        herosNom.setText(this.fenetre.heros.nom);
        ennImgIcon = this.ennemie.avatar;
        herosImage.setIcon(this.fenetre.heros.avatar);
        ennemiImage.setIcon(ennImgIcon);
        
        SwingUtilities.updateComponentTreeUI(this.fenetre);
        
        
    }
    
    public JPanelCombat(JFrameMain fen, Combatant ennemi){
        this.fenetre = fen;
        this.ennemie = ennemi;
        
        initComponents();
        
        ennemiNom.setText(this.ennemie.getNom());
        pvEnnemi.setMaximum(this.ennemie.PVmax);
        pvEnnemi.setValue(this.ennemie.PV);
        pvHeros.setMaximum(this.fenetre.heros.PVmax);
        pvHeros.setValue(this.fenetre.heros.PV);
        pvHeroLabel.setText(this.fenetre.heros.getPV()+"/"+this.fenetre.heros.PVmax);
        
        ennImgIcon = this.ennemie.avatar;
        herosImage.setIcon(this.fenetre.heros.avatar);
        ennemiImage.setIcon(ennImgIcon);
        
        SwingUtilities.updateComponentTreeUI(this.fenetre);
        
        
    }
    
    public JPanelCombat(Heros hero){
        
        System.out.println();
        this.fenetre = new JFrameMain();
        this.fenetre.heros = hero;
        this.ennemie = Random.ennemie();
        
        
        this.fenetre.setSize(600, 600);
        this.fenetre.setVisible(true);
        
        initComponents();
        
        ennemiNom.setText(this.ennemie.getNom());
        pvEnnemi.setMaximum(this.ennemie.PVmax);
        pvEnnemi.setValue(this.ennemie.PV);
        pvHeros.setMaximum(this.fenetre.heros.PVmax);
        pvHeros.setValue(this.fenetre.heros.PV);
        pvHeroLabel.setText(this.fenetre.heros.getPV()+"/"+this.fenetre.heros.PVmax);
        
        fenetre.setContentPane(this);
        
        SwingUtilities.updateComponentTreeUI(this.fenetre);
        
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        soinBtn = new java.awt.Button();
        attBtn = new java.awt.Button();
        fuirBtn = new java.awt.Button();
        caBtn = new java.awt.Button();
        cpBtn = new java.awt.Button();
        feinteBtn = new java.awt.Button();
        message = new java.awt.Label();
        pvHeros = new javax.swing.JProgressBar();
        pvEnnemi = new javax.swing.JProgressBar();
        herosNom = new java.awt.Label();
        ennemiNom = new java.awt.Label();
        messagePv = new java.awt.Label();
        continuBtn = new java.awt.Button();
        pvHeroLabel = new javax.swing.JLabel();
        herosImage = new javax.swing.JLabel();
        ennemiImage = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setOpaque(false);

        soinBtn.setLabel("Se soigner");
        soinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soinBtnActionPerformed(evt);
            }
        });

        attBtn.setLabel("Attaque");
        attBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attBtnActionPerformed(evt);
            }
        });

        fuirBtn.setLabel("Fuir");
        fuirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuirBtnActionPerformed(evt);
            }
        });

        caBtn.setLabel("Contre Attaque");
        caBtn.setVisible(false);
        caBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caBtnActionPerformed(evt);
            }
        });

        cpBtn.setLabel("Coup Puissant");
        cpBtn.setVisible(false);
        cpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpBtnActionPerformed(evt);
            }
        });

        feinteBtn.setLabel("Feinte");
        feinteBtn.setVisible(false);
        feinteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feinteBtnActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        message.setText("Que voulez-vous faire ?");

        pvHeros.setToolTipText("");

        herosNom.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        herosNom.setText("Vos PV");

        ennemiNom.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ennemiNom.setText("Les PV de l'ennemi");

        continuBtn.setLabel("Fin du combat");
        continuBtn.setVisible(false);
        continuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuBtnActionPerformed(evt);
            }
        });

        herosImage.setBackground(new java.awt.Color(102, 255, 0));
        herosImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        herosImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp3/dwarf.png"))); // NOI18N

        ennemiImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ennemiImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tp3/zombie.png"))); // NOI18N
        ennemiImage.setAlignmentX(0.5F);
        ennemiImage.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(herosImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(herosNom, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)
                                        .addComponent(pvHeroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(pvHeros, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pvEnnemi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ennemiNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ennemiImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(attBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feinteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(fuirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(continuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messagePv, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pvEnnemi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ennemiNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(herosImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ennemiImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(herosNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pvHeroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pvHeros, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messagePv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feinteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(attBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soinBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setjPanel1() {

        this.herosImage = herosImage;
    }

    public void setSoinBtn(java.awt.Button soinBtn) {
        this.soinBtn = soinBtn;
    }

    public java.awt.Button getSoinBtn() {
        return soinBtn;
    }
    
    public JProgressBar getPvEnnemi() {
        return pvEnnemi;
    }

    public JProgressBar getPvHeros() {
        return pvHeros;
    }

    public void setPvEnnemi(JProgressBar pvEnnemi) {
        this.pvEnnemi = pvEnnemi;
    }

    public void setPvHeros(JProgressBar pvHeros) {
        this.pvHeros = pvHeros;
    }

    private void attBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attBtnActionPerformed
        this.cpBtn.setVisible(true);
        this.caBtn.setVisible(true);
        this.feinteBtn.setVisible(true);
        this.attBtn.setVisible(false);
        this.soinBtn.setVisible(false);
        this.fuirBtn.setVisible(false);
        SwingUtilities.updateComponentTreeUI(this.fenetre);
    }//GEN-LAST:event_attBtnActionPerformed

    private void soinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soinBtnActionPerformed
        
        soinBtn.setEnabled(false);
        double s = this.fenetre.heros.seSoigner();
        
        Runnable runner = new Runnable()
            {
                public void run() {
                    for (int i = 1; i <= s; i++) {
                        pvHeros.setValue(pvHeros.getValue()+1);
                        pvHeroLabel.setText(pvHeros.getValue()+"/"+fenetre.heros.PVmax);
                        try {
                            Thread.sleep(100);
                        } catch(InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                }
            };
            Thread t = new Thread(runner, "Code Executer");
            t.start();  
        
        this.messagePv.setText("Vous récupérez "+(int)s+" pv.");
    }//GEN-LAST:event_soinBtnActionPerformed

    private void cpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpBtnActionPerformed
   
        int t = Random.typeAttaque();
        int dmg = 0;
        switch(t) {
            case 1 :
                int hdmg = this.fenetre.heros.force*(Random.dice(3))/3;
                dmg = this.ennemie.force*(Random.dice(3))/3;
                ennemie.setMoinsPV(hdmg);
                this.fenetre.heros.setMoinsPV(dmg);
                this.message.setText("L'ennemi et vous portez un coup puissant. Vous vous blessez tous les deux.");
                this.messagePv.setText("Il perd "+hdmg+" pv. Vous perdez "+dmg+" pv.");
                this.majPvDmg(hdmg,0);
                this.majPvDmg(dmg,1);
            break;
            case 2 : 
                dmg = ((this.ennemie.force+this.fenetre.heros.force)/2)*(Random.dice(3))/3;
                this.fenetre.heros.setMoinsPV(dmg);
                this.message.setText("Vous tentez un coup puissant mais l'ennemi arrive à vous contrez ! Il vous touche !");
                this.messagePv.setText("Vous perdez "+dmg+" pv.");
                this.majPvDmg(dmg,1);
            break;
            case 3 :
                dmg = this.fenetre.heros.force*(Random.dice(3))/3;
                ennemie.setMoinsPV(dmg);
                this.message.setText("L'ennemi tente maladroitement une attaque, vous le punissez ! Vous le touchez !");
                this.messagePv.setText("Il perd "+dmg+" pv.");
                this.majPvDmg(dmg,0);
            break;
        }
        this.cpBtn.setVisible(false);
        this.caBtn.setVisible(false);
        this.feinteBtn.setVisible(false);
        this.attBtn.setVisible(true);
        this.soinBtn.setVisible(true);
        this.fuirBtn.setVisible(true);
        this.testCombat();
        
        
    }//GEN-LAST:event_cpBtnActionPerformed

    private void fuirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuirBtnActionPerformed
        boolean b = Random.fuite(ennemie);
        if (b) {
            this.message.setText("Vous prenez la fuite ...");
            this.cpBtn.setVisible(false);
            this.caBtn.setVisible(false);
            this.feinteBtn.setVisible(false);
            this.attBtn.setVisible(false);
            this.soinBtn.setVisible(false);
            this.fuirBtn.setVisible(false);
            this.continuBtn.setVisible(true);
            SwingUtilities.updateComponentTreeUI(this.fenetre);
        }
        else {
            this.message.setText("Fuite impossible ... L'ennemi vous rattrape et vous blesse.");
            this.majPvDmg(this.ennemie.force, 1);
            this.messagePv.setText("Vous perdez "+this.ennemie.getForce()+" pv.");
            testCombat();
            
        }
    }//GEN-LAST:event_fuirBtnActionPerformed

    private void caBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caBtnActionPerformed
        int t = Random.typeAttaque();
        int dmg;
        switch(t) {
            case 1 :
                            
                            dmg = ((this.ennemie.force+this.fenetre.heros.force)/2)*(Random.dice(3))/3;
                            
                            ennemie.setMoinsPV(dmg);
                            this.message.setText("L'ennemi porte un coup puissant mais vous contre-attaquez magistralement ! Vous le touchez !\n");
                            this.messagePv.setText("Il perd "+dmg+" pv.");
                            this.majPvDmg(dmg,0);
            break;

            case 2 : this.message.setText("Votre ennemi et vous-même attendez patiemment le coup de l'autre ...\n");
              this.messagePv.setText("");
            break;

            case 3 : 
                            
                            dmg = (this.fenetre.heros.PV/(Random.dice(3)+1))+5;
                            this.fenetre.heros.setMoinsPV(dmg);
                            
                            this.message.setText("L'ennemi semble vouloir porter un coup violent, vous tentez une parade mais il vous porte un coup bas au dernier moment ! Il vous touche !\n");
                            this.messagePv.setText("Vous perdez "+dmg+" pv.");
                            this.majPvDmg(dmg,1);
            break;
        }
        this.cpBtn.setVisible(false);
        this.caBtn.setVisible(false);
        this.feinteBtn.setVisible(false);
        this.attBtn.setVisible(true);
        this.soinBtn.setVisible(true);
        this.fuirBtn.setVisible(true);
        
        this.testCombat();
       
        
    }//GEN-LAST:event_caBtnActionPerformed

    private void feinteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feinteBtnActionPerformed
        
        int t = Random.typeAttaque();
        int dmg = 0;
        switch(t) {
        case 1 : 
                        dmg = this.ennemie.force*(Random.dice(3))/3;
                        this.fenetre.heros.setMoinsPV(dmg);
                        
                        this.message.setText("L'ennemi porte un coup puissant, votre feinte est inutile ! Il vous touche !\n");
                        this.messagePv.setText("Vous perdez "+dmg+" pv.");
                        
                        this.majPvDmg(dmg,1);
        break;
        case 2 : 
                        
                        dmg = (this.ennemie.PV/(Random.dice(3)+1))+5; 
                        ennemie.setMoinsPV(dmg);
                        this.message.setText("Vous simulez une attaque, l'ennemi manque sa parade et vous lui portez un coup ! Vous le touchez !\n");
                        this.messagePv.setText("Il perd "+dmg+" pv.");
                        this.majPvDmg(dmg,0);
        break;
        case 3 : 
                        int rand = Random.dice(2)-1;
                        if (rand == 1){
                            
                            dmg = (this.ennemie.PV/(Random.dice(3)+1))+5;
                            ennemie.setMoinsPV(dmg);
                            
                            this.message.setText("Apres un échange de coups spectaculaire, vous réussissez à blesser l'ennemi !\n");
                            this.messagePv.setText("Il perd "+dmg+" pv.");
                            this.majPvDmg(dmg,0);
                        } else {
                            
                            dmg = (this.fenetre.heros.PV/(Random.dice(3)+1))+5;
                            this.fenetre.heros.setMoinsPV(dmg);
                            this.message.setText("Apres un échange de coups spectaculaire, vous vous faites toucher par l'ennemi !\n");
                            this.messagePv.setText("Vous perdez "+dmg+" pv.");
                            this.majPvDmg(dmg,1);
                        }
        break;
      }
        this.cpBtn.setVisible(false);
        this.caBtn.setVisible(false);
        this.feinteBtn.setVisible(false);
        this.attBtn.setVisible(true);
        this.soinBtn.setVisible(true);
        this.fuirBtn.setVisible(true);
        
        this.testCombat();
        
    }//GEN-LAST:event_feinteBtnActionPerformed

    private void continuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuBtnActionPerformed
        
        if(this.fenetre.heros.getPV() <= 0) {
            this.fenetre.setContentPane(new JPanelLose(this.fenetre));
        } else if (this.fenetre.Case >= Tp3.NBCASES){
            try {
                this.fenetre.setContentPane(new JPanelWin(this.fenetre));
            } catch (SQLException ex) {
                Logger.getLogger(JPanelCombat.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            this.fenetre.setContentPane(new JPanelMainMenu(this.fenetre));
        }
        
    }//GEN-LAST:event_continuBtnActionPerformed
    
    public void majPvDmg(int dmg, int target){
        
        if (target == 0) {

                Runnable runner = new Runnable()
            {
                public void run() {
                    for (int i = 1; i <= dmg; i++) {
                        System.out.println(pvEnnemi.getValue());
                        pvEnnemi.setValue(pvEnnemi.getValue()-1);
                        try {
                            Thread.sleep(100);
                        } catch(InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                        
                    }
                }
            };
            Thread t = new Thread(runner, "Code Executer");
            t.start();  
        }  else if (target == 1){
            
            int max = this.fenetre.heros.PVmax;
           Runnable runner = new Runnable()
            {
                public void run() {
                    for (int i = 1; i <= dmg; i++) {
                        pvHeros.setValue(pvHeros.getValue()-1);
                        pvHeroLabel.setText(pvHeros.getValue()+"/"+max);
                        try {
                            Thread.sleep(100);
                        } catch(InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                }
            };
            Thread t = new Thread(runner, "Code Executer");
            t.start();   
        }
    }
    
    private void testCombat() {
        if (this.fenetre.heros.getPV() <= 0) {
            this.ennemie.tableauDeChasse.add(this.fenetre.heros);
            this.messagePv.setText(this.messagePv.getText()+" Vous êtes mort !");
            this.cpBtn.setVisible(false);
            this.caBtn.setVisible(false);
            this.feinteBtn.setVisible(false);
            this.attBtn.setVisible(false);
            this.soinBtn.setVisible(false);
            this.fuirBtn.setVisible(false);
            this.continuBtn.setVisible(true);
            
            //A FAIRE UNE FOIS LE MENU FINI
            //this.fenetre.setContentPane(//mainmenu);
        }
        else if (this.ennemie.getPV() <= 0) {
            this.fenetre.heros.tableauDeChasse.add(this.ennemie);
            this.fenetre.heros.score += this.ennemie.force;
            this.fenetre.heros.force += Random.dice(2);
            this.messagePv.setText(this.messagePv.getText()+" Vous avez tué votre ennemi !");
            this.cpBtn.setVisible(false);
            this.caBtn.setVisible(false);
            this.feinteBtn.setVisible(false);
            this.attBtn.setVisible(false);
            this.soinBtn.setVisible(false);
            this.fuirBtn.setVisible(false);
            this.continuBtn.setVisible(true);
            //A FAIRE UNE FOIS LE MENU FINI
            //this.fenetre.setContentPane(//mainmenu);
        }
        
        SwingUtilities.updateComponentTreeUI(this.fenetre);
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button attBtn;
    private java.awt.Button caBtn;
    private java.awt.Button continuBtn;
    private java.awt.Button cpBtn;
    private javax.swing.JLabel ennemiImage;
    private java.awt.Label ennemiNom;
    private java.awt.Button feinteBtn;
    private java.awt.Button fuirBtn;
    private javax.swing.JLabel herosImage;
    private java.awt.Label herosNom;
    private java.awt.Label message;
    private java.awt.Label messagePv;
    private javax.swing.JProgressBar pvEnnemi;
    private javax.swing.JLabel pvHeroLabel;
    private javax.swing.JProgressBar pvHeros;
    private java.awt.Button soinBtn;
    // End of variables declaration//GEN-END:variables

    
}
