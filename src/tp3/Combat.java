/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author Loic.FOREST
 */
public class Combat {
    private Ennemies ennemie;
    private Heros heros;
    private boolean soin = true;
    private boolean end = false;
    JFrame fenetre = new JFrame();
    JPanelCombat combat = new JPanelCombat(fenetre, this);
    
    public Combat(Heros heros, JFrame fenetre) {
        this.heros= heros;
        this.ennemie = Random.ennemie();
        this.fenetre = fenetre;
        this.combat = new JPanelCombat(fenetre, this);
        
    }
    
    public Combat(Heros heros) {
        this.heros= heros;
        this.ennemie = Random.ennemie();
        
        
    }
    
    public void debutDuCombat(){
        this.fenetre.setSize(600, 600);
        this.fenetre.setVisible(true);
        fenetre.setContentPane(combat);
        System.out.print("Vous vous faites attaquer par un "+ennemie.getNom()+" !");
        
        
        JProgressBar pvEnn = this.combat.getPvEnnemi();
        pvEnn.setMaximum(this.ennemie.PVmax);
        pvEnn.setValue(this.ennemie.PV);
        this.combat.setPvEnnemi(pvEnn);
        
        JProgressBar pvHer = this.combat.getPvHeros();
        pvHer.setMaximum(this.heros.PVmax);
        pvHer.setValue(this.heros.PV);
        this.combat.setPvHeros(pvHer);
        
        SwingUtilities.updateComponentTreeUI(this.fenetre);
        
        
        this.choix();
    }
    
    public void choix() {
        
        do {
                      
            Scanner sc = new Scanner(System.in);
            System.out.print("Il vous reste "+heros.getPV()+" PV.\n"
                    + "Que souhaitez-vous faire ?\n"
                    + "<1> Attaquer\n"
                    + canSoigne()
                    + "<3> Fuir\n");
            String ch = sc.nextLine();
            switch(ch) {
                case "1" :
                    this.menuAttaque();
                    break;
                case "2" :
                    if (soin) {
                        this.soin();
                    }
                    else {
                        System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                        heros.setMoinsPV(this.ennemie.force);
                        System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");

                    }
                    break;
                case "3" :
                    this.fuir();
                    break;
                default :
                    System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                    heros.setMoinsPV(this.ennemie.force);
                    System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
                    this.majPvDmg(this.ennemie.getForce(),1);
                break;
            }
            if(this.heros.getPV() <= 0) {
                this.end();
            } else if(this.ennemie.getPV() <= 0) {
                System.out.print("Vous avez tué le "+ennemie.getNom()+" !\n");
                this.end();
            } else if ("1".equals(ch)){
                System.out.print("Vous vous remettez en position ...");
            }
        }
        while(!this.end);
    }

    public void menuAttaque() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quel type d'attaque voulez-vous executer ?\n"
                + "<1> Coup puissant\n"
                + "<2> Contre-Attaque\n"
                + "<3> Feinte\n");
        
        int t = sc.nextInt();
        sc.nextLine();
        attaque(t);
    }
    
    

    public void soin() {
        
        java.awt.Button test = new java.awt.Button();
        test = this.combat.getSoinBtn();
        test.setEnabled(false);
        this.combat.setSoinBtn(test);
        
        double s = this.heros.seSoigner();
        for (int i = 0; i <= s; i++) {
               
                    JProgressBar pvHer = this.combat.getPvHeros();
                    pvHer.setValue(pvHer.getValue()+1);
                    SwingUtilities.updateComponentTreeUI(this.fenetre);
                    try {
                        Thread.sleep(100);
                    } catch(InterruptedException e) {
                       System.out.println(e.getMessage());
                    }
             
            }
        System.out.print("Vous récupérez "+(int)s+" pv.");
    }

    public void fuir() {
        boolean b = Random.fuite(ennemie);
        if (b) {
            System.out.print("Vous prenez la fuite ...");
            this.end();
        }
        else {
            System.out.print("Fuite impossible ... L'ennemi vous rattrape et vous blesse.");
            heros.setMoinsPV(this.ennemie.force);
            System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
            if(heros.getPV() > 0) {
            } else {
                this.end();
            }
            
        }
    }

    public void attaque(int t) {
        int attEnnemie = Random.typeAttaque();
        int dmg;
        switch (attEnnemie) {
            case 1 :
                switch (t) {
                    case 1 : System.out.print("L'ennemi et vous portez un coup puissant. Vous vous blessez tous les deux.\n");
                        int hdmg = this.heros.force*(Random.dice(6))/4;
                        dmg = this.ennemie.force*(Random.dice(6))/4;
                        ennemie.setMoinsPV(hdmg);
                        heros.setMoinsPV(dmg);
                        System.out.print("Il perd "+hdmg+" pv.");
                        this.majPvDmg(hdmg,0);
                        System.out.print("Vous perdez "+dmg+" pv.");
                        this.majPvDmg(dmg,1);
                    break;
                    
                    case 2 :
                        int rand = Random.dice(2)-1;
                        System.out.print("L'ennemi porte un coup puissant mais vous contre-attaquez magistralement ! Vous le touchez !\n");
                        if (rand == 1){
                            dmg = this.ennemie.force+10;
                        } else {
                            dmg = 10;
                        }
                        ennemie.setMoinsPV(dmg);
                        System.out.print("Il perd "+dmg+" pv.");
                        this.majPvDmg(dmg,0);
                    break;
                    
                    case 3 : System.out.print("L'ennemi porte un coup puissant, votre feinte est inutile ! Il vous touche !\n");
                        dmg = this.ennemie.force*(Random.dice(6))/4;
                        heros.setMoinsPV(dmg);
                        System.out.print("Vous perdez "+dmg+" pv.");
                        this.majPvDmg(dmg,1);
                    break;
                    
                    default :
                        System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                        heros.setMoinsPV(this.ennemie.force);
                        System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
                        this.majPvDmg(this.ennemie.getForce(),1);
                    break;
                }
            break;
            case 2 :
                switch (t) {
                    case 1 : System.out.print("Vous tentez un coup puissant mais l'ennemi arrive à vous contrez ! Il vous touche !\n");
                        int rand = Random.dice(2)-1;
                        if (rand == 1){
                            dmg = this.heros.force+10;
                        } else {
                            dmg = 10;
                        }
                        heros.setMoinsPV(dmg);
                        System.out.print("Vous perdez "+dmg+" pv.");
                        this.majPvDmg(dmg,1);
                    break;
                    
                    case 2 : System.out.print("Votre ennemi et vous-même attendez patiemment le coup de l'autre ...\n");
                    break;
                    
                    case 3 : System.out.print("Vous simulez une attaque, l'ennemi manque sa parade et vous lui portez un coup ! Vous le touchez !\n");
                        dmg = Random.dice(11)+9;
                        dmg = dmg * this.ennemie.getPV()/this.heros.getPV()+5;
                        ennemie.setMoinsPV(dmg);
                        System.out.print("Il perd "+dmg+" pv.");
                        this.majPvDmg(dmg,0);
                    break;
                    
                    default :
                        System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                        heros.setMoinsPV(this.ennemie.force);
                        System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
                        this.majPvDmg(this.ennemie.getForce(),1);
                    break;
                }
            break;
            case 3 :
                switch (t) {
                    case 1 : System.out.print("L'ennemi tente maladroitement une attaque, vous le punissez ! Vous le touchez !\n");
                        dmg = this.heros.force*(Random.dice(6))/4;
                        ennemie.setMoinsPV(dmg);
                        System.out.print("Il perd "+dmg+" pv.");
                        this.majPvDmg(dmg,0);
                    break;
                    
                    case 2 : System.out.print("L'ennemi semble vouloir porter un coup violent, vous tentez une parade mais il vous porte un coup bas au dernier moment ! Il vous touche !\n");
                        dmg = Random.dice(11)+9;
                        dmg = dmg * this.heros.getPV()/this.ennemie.getPV();
                        heros.setMoinsPV(dmg);
                        System.out.print("Vous perdez "+dmg+" pv.");
                        this.majPvDmg(dmg,1);
                    break;
                    
                    case 3 : System.out.print("Apres un échange de coups spectaculaire... \n");
                        int rand = Random.dice(2)-1;
                        dmg = Random.dice(11)+9;
                        if (rand == 1){
                            System.out.print("... vous réussissez à blesser l'ennemi !\n");
                            dmg = (this.ennemie.getPV()/this.heros.getPV()*dmg);
                            ennemie.setMoinsPV(dmg);
                            System.out.print("Il perd "+dmg+" pv.");
                            this.majPvDmg(dmg,0);
                        } else {
                            System.out.print("... vous vous faites toucher par l'ennemi !\n");
                            dmg = (this.heros.getPV()/this.ennemie.getPV()*dmg);
                            heros.setMoinsPV(dmg);
                            System.out.print("Vous perdez "+dmg+" pv.");
                            this.majPvDmg(dmg,1);
                        }
                    break;
                    
                    default :
                        System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                        heros.setMoinsPV(this.ennemie.force);
                        System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
                        this.majPvDmg(this.ennemie.getForce(),1);
                    break;
                }
            break;
                        
        }
        //CONTROLE DECES !!
        
        
    }

    public void end() {
        System.out.print("Combat terminé !\n");
        end = true;
    }

    public String canSoigne() {
        if (this.soin){
            return "<2> Se soigner\n";
        } else {
            return "<> Vous ne pouvez plus vous soigner !\n";
        }
    }
    
    public void majPvDmg(int dmg, int target){
        
        if (target == 0) {
           for (int i = 0; i <= dmg; i++) {
              
                JProgressBar pvEnn = this.combat.getPvEnnemi();
                pvEnn.setValue(pvEnn.getValue()-1);
                SwingUtilities.updateComponentTreeUI(this.fenetre);
                
                try {
                    Thread.sleep(100);
                } catch(InterruptedException e) {
                   System.out.println(e.getMessage());
                }
            } 
        }  else if (target == 1){
            
            for (int i = 0; i <= dmg; i++) {
               
                    JProgressBar pvHer = this.combat.getPvHeros();
                    pvHer.setValue(pvHer.getValue()-1);
                    SwingUtilities.updateComponentTreeUI(this.fenetre);
                    try {
                        Thread.sleep(100);
                    } catch(InterruptedException e) {
                       System.out.println(e.getMessage());
                    }
             
            }
        }
        
    }
}
