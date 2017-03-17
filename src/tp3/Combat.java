/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Scanner;

/**
 *
 * @author Loic.FOREST
 */
public class Combat {
    private Ennemies ennemie;
    private Heros heros;
    private boolean soin = true;
    private boolean end = false;
    
    public Combat(Heros heros) {
        this.heros= heros;
        this.ennemie = Random.ennemie();
        
    }
    
    public void debutDuCombat(){
        System.out.print("Vous vous faites attaquer par un "+ennemie.getNom()+" !");
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

    private void menuAttaque() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quel type d'attaque voulez-vous executer ?\n"
                + "<1> Coup puissant\n"
                + "<2> Contre-Attaque\n"
                + "<3> Feinte\n");
        
        int t = sc.nextInt();
        sc.nextLine();
        attaque(t);
    }
    
    

    private void soin() {
        System.out.print("Vous vous soignez ...");
        this.soin = false;
        double s = this.heros.seSoigner();
        System.out.print("Vous récupérez "+(int)s+" pv.");
    }

    private void fuir() {
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

    private void attaque(int t) {
        int attEnnemie = Random.typeAttaque();
        switch (attEnnemie) {
            case 1 :
                switch (t) {
                    case 1 : System.out.print("L'ennemi et vous portez un coup puissant. Vous vous blessez tous les deux.\n");
                    ennemie.setMoinsPV(this.heros.force);
                    heros.setMoinsPV(this.ennemie.force);
                    System.out.print("Il perd "+this.heros.force+" pv.");
                    System.out.print("Vous perdez "+this.ennemie.force+" pv.");
                    break;
                    case 2 : System.out.print("L'ennemi porte un coup puissant mais vous contre-attaquez magistralement ! Vous le touchez !\n");
                    ennemie.setMoinsPV(this.ennemie.force);
                    System.out.print("Il perd "+this.ennemie.force+" pv.");
                    break;
                    case 3 : System.out.print("L'ennemi porte un coup puissant, votre feinte est inutile ! Il vous touche !\n");
                    heros.setMoinsPV(this.ennemie.force);
                    System.out.print("Vous perdez "+this.ennemie.force+" pv.");
                    break;
                    default :
                    System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                    heros.setMoinsPV(this.ennemie.force);
                    System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
                    break;
                }
            break;
            case 2 :
                switch (t) {
                    case 1 : System.out.print("Vous tentez un coup puissant mais l'ennemi arrive à vous contrez ! Il vous touche !\n");
                    heros.setMoinsPV(this.heros.force);
                    System.out.print("Vous perdez "+this.heros.force+" pv.");
                    break;
                    case 2 : System.out.print("Votre ennemi et vous-même attendez patiemment le coup de l'autre ...\n");
                    break;
                    case 3 : System.out.print("Vous simulez une attaque, l'ennemi manque sa parade et vous lui portez un coup ! Vous le touchez !\n");
                    ennemie.setMoinsPV((this.ennemie.getPV()/this.heros.getPV()*15));
                    System.out.print("Il perd "+this.heros.force+" pv.");
                    break;
                    default :
                    System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                    heros.setMoinsPV(this.ennemie.force);
                    System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
                    break;
                }
            break;
            case 3 :
                switch (t) {
                    case 1 : System.out.print("L'ennemi tente maladroitement une attaque, vous le punissez ! Vous le touchez !\n");
                    ennemie.setMoinsPV(this.heros.force);
                    System.out.print("Il perd "+this.heros.force+" pv.");
                    break;
                    case 2 : System.out.print("L'ennemi semble vouloir porter un coup violent, vous tentez une parade mais il vous porte un coup bas au dernier moment ! Il vous touche !\n");
                    heros.setMoinsPV((this.heros.getPV()/this.ennemie.getPV()*15));
                    System.out.print("Vous perdez "+this.heros.force+" pv.");
                    break;
                    case 3 : System.out.print("Vous tentez une feinte, l'ennemi semble vouloir attaquer, mais vous manquez tous les deux votre coup...\n");
                    break;
                    default :
                    System.out.print("Action impossible. L'ennemi vous attaque et vous blesse.");
                    heros.setMoinsPV(this.ennemie.force);
                    System.out.print("Vous perdez "+this.ennemie.getForce()+" pv.");
                    break;
                }
            break;
                        
        }
        //CONTROLE DECES !!
        
        
    }

    private void end() {
        System.out.print("Combat terminé !\n");
        end = true;
    }

    private String canSoigne() {
        if (this.soin){
            return "<2> Se soigner\n";
        } else {
            return "<> Vous ne pouvez plus vous soigner !\n";
        }
    }
}
