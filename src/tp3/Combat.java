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
    
    public Combat(Heros heros) {
        this.heros= heros;
        this.ennemie = Random.ennemie();
        
    }
    
    public void debutDuCombat(){
        System.out.print("Vous vous faites attaquer par un "+ennemie.getNom()+" !");
        
    }
    
    public void choix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Il vous reste "+heros.getPV()+" PV.\n"
                + "Que souhaitez-vous faire ?\n"
                + "<1> Attaquer\n"
                + "<2> Vous soignez\n"
                + "<3> Fuir\n");
        String ch = sc.nextLine();
        switch(ch) {
            case "1" :
                this.menuAttaque();
                break;
            case "2" :
                this.soin();
                break;
            case "3" :
                this.fuir();
                break;
        }
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
        System.out.print("Vous récupérez XX pv.");
    }

    private void fuir() {
        boolean b = Random.fuite(ennemie);
        if (b) {
            System.out.print("Vous prenez la fuite ...");
            this.end();
        }
        else {
            System.out.print("Fuite impossible ... L'ennemie vous rattrape et vous blesse.");
            //Ajouter la perte de pv du joueur heros.setPv();
            System.out.print("Vous perdez XX pv.");
            if(heros.getPV() > 0) {
                choix();
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
                    case 1 : System.out.print("L'ennemie et vous portez un coup puissant. Vos coups s'annulent ...\n");
                    break;
                    case 2 : System.out.print("L'ennemie porte un coup puissant mais vous contre-attaquez magistralement ! Vous le touchez !\n");
                    //Ajouter la perte de pv de l'ennemie ennemie.setPv();
                    System.out.print("Il perd XX pv.");
                    break;
                    case 3 : System.out.print("L'ennemie porte un coup puissant, votre feinte est inutile ! Il vous touche !\n");
                    //Ajouter la perte de pv du joueur heros.setPv();
                    System.out.print("Vous perdez XX pv.");
                    break;
                }
            break;
            case 2 :
                switch (t) {
                    case 1 : System.out.print("Vous tentez un coup puissant mais l'ennemie arrive à vous contrez ! Il vous touche !\n");
                    //Ajouter la perte de pv du joueur heros.setPv();
                    System.out.print("Vous perdez XX pv.");
                    break;
                    case 2 : System.out.print("Votre ennemie et vous-même attendez patiemment le coup de l'autre ...\n");
                    break;
                    case 3 : System.out.print("Vous simulez une attaque, l'ennemie manque sa parade et vous lui portez un coup ! Vous le touchez !\n");
                    //Ajouter la perte de pv de l'ennemie ennemie.setPv();
                    System.out.print("Il perd XX pv.");
                    break;
                }
            break;
            case 3 :
                switch (t) {
                    case 1 : System.out.print("L'ennemie tente maladroitement une attaque, vous le punissez ! Vous le touchez !\n");
                    //Ajouter la perte de pv de l'ennemie ennemie.setPv();
                    System.out.print("Il perd XX pv.");
                    break;
                    case 2 : System.out.print("L'ennemie semble vouloir porter un coup violent, vous tentez une parade mais il vous porte un coup bas au dernier moment ! Il vous touche !\n");
                    //Ajouter la perte de pv du joueur heros.setPv();
                    System.out.print("Vous perdez XX pv.");
                    break;
                    case 3 : System.out.print("Vous tentez une feinte, l'ennemie semble vouloir attaquer, mais vous manquez tous les deux votre coup...\n");
                    break;
                }
            break;
                        
        }
        //CONTROLE DECES !!
        
        if(/*joueur mort*/) {
            
        }
        else if(/*ennemie mort*/) {
            System.out.print("Vous avez tué le "+ennemie.getNom()+" !");
            this.end();
        } else {
            System.out.print("Vous vous remettez en position ...");
            choix();
        }
    }

    private void end() {
        System.out.print("Combat terminé !");
    }
}
