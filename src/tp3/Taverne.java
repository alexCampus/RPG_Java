/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.net.MalformedURLException;
import javax.swing.ImageIcon;

/**
 *
 * @author alexandre.depembroke
 */
public class Taverne implements Event{
    
    private int nb;
    private Heros monHero;
    private int nbPV = (int)(Math.random() * 20) +1;
    private int nbPVPerteMax =(int)(Math.random() * 50)+15;
    private int nbForce = (int)(Math.random() * 5) +1;
    private String text;
    private ImageIcon imgUrl;
    private boolean a = false;
    
    public Taverne(Heros monHero, JFrameMain fenetre) throws MalformedURLException{
        this.monHero = monHero;

        new PanelTaverne(fenetre, this);

        nb = Random.dice(5);
    }
    
    void eventTaverne(JFrameMain fenetre) throws MalformedURLException{
       
            
        
        switch(nb){
            case 1:                
                text = "Vous venez de retrouver un de vos vieux amis, après avoir passé une bonne soirée en sa présence.\nCela vous a permis de regagner " + nbPV + " points de vie.";
                imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/friends_beer.gif"));
                //System.out.println("Vous venez de retrouver un de vos vieux amis, après avoir passé une bonne soirée en sa présence.\nCela vous a permis de regagner " + nbPV + " points de vie."); 
                    new PanelTaverne(text, imgUrl, fenetre,a);
                    monHero.setPlusPV(nbPV); 
                break;
                
            case 2:
                int choix = Random.dice(3);
                    switch(choix){
                        case 1:
                            text = "Malheureusement la taverne est pleine. Le patron est d'humeur sympathique et vous offre une nouvelle épée pour vous dédommager";
                            imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/sword.gif"));
                            new PanelTaverne(text, imgUrl, fenetre,a);
                           // System.out.println("Malheureusement la taverne est pleine. Le patron est d'humeur sympathique et vous offre une nouvelle épée pour vous dédommager");
                            monHero.setPlusForce(nbForce);
                            break;
                            
                        case 2:
                             text = "Vous n'avez pas controlé votre consommation de bieres elfique\n et sous les effets de l'alcool vous vous êtes battus avec votre voisin de comptoir.....";
                             imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/fight.gif"));
                            new PanelTaverne(text, imgUrl, fenetre,a);
                           // System.out.println("Vous n'avez pas controlé votre consommation de bieres elfique\n et sous les effets de l'alcool vous vous êtes battus avec votre voisin de comptoir.....");
                            int nbAleatoire = Random.dice(4);
                            switch(nbAleatoire){
                                case 1:
                                    text = "Bravo, vous lui avez défoncé la tête en moins de deux et vous avez ainsi récuperer ses armes sans perdre de PV";
                                    imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/fight_win.gif"));
                                    new PanelTaverne(text, imgUrl, fenetre,a);
                                    //System.out.println("Bravo, vous lui avez défoncé la tête en moins de deux et vous avez ainsi récuperer ses armes sans perdre de PV");
                                    monHero.setPlusForce(nbForce + 3);
                                    break;
                                    
                                case 2:
                                    text = "Vous vous êtes bien battus mais votre voisin était venus avec tous ses amis.....\n Vous vous êtes donc faits viré de la taverne.\n Vous perdez donc " + nbPV + " points de vie";
                                    imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/fight_lose.gif"));
                                    new PanelTaverne(text, imgUrl, fenetre,a);
                                    //System.out.println("Vous vous êtes bien battus mais votre voisin était venus avec tous ses amis.....\n Vous vous êtes donc faits viré de la taverne.\n Vous perdez donc " + nbPV + " points de vie");
                                    monHero.setMoinsPV(nbPV);
                                    break;
                                    
                                case 3:
                                    text = "Vous vous réveillez dans une chambre inconnu avec mal à la tête, et vous remarquez les calecons posé sur la chaise et ce ne sont pas les votres.....\nVous décidez de vous enfuir le plus vite possible!!!! ";
                                    text += "Vous avez malheureusement oublié votre armure, vous perdez " + nbPV + " PV.";
                                    imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/fight_armor.gif"));
                                    new PanelTaverne(text, imgUrl, fenetre,a);
                                   // System.out.println("Vous vous réveillez dans une chambre inconnu avec mal à la tête, et vous remarquez les calecons posé sur la chaise et ce ne sont pas les votres.....\nVous décidez de vous enfuir le plus vite possible!!!! ");
                                    //System.out.println("Vous avez malheureusement oublié votre armure, vous perdez " + nbPV + " PV.");
                                    monHero.setMoinsPV(nbPV);
                                    break;
                                    
                                default:
                                     text = "Votre voisin etait vraiment super fort, et vous regrettez votre choix car vous perdez " + nbPVPerteMax + " points de vie et " + nbForce + " de force....";
                                    imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/fight_big_lose.gif"));
                                    new PanelTaverne(text, imgUrl, fenetre,a);
                                    //System.out.println("Votre voisin etait vraiment super fort, et vous regrettez votre choix car vous perdez " + nbPVPerteMax + " points de vie et " + nbForce + " de force...." );
                                        monHero.setMoinsPV(nbPVPerteMax);
                                        monHero.setMoinsForce(nbForce);                      
                                    break;
                            }
                            break;
                            
                        case 3:
                            text = "Grâce a votre rencontre avec un mage, vous venez de gagner en rapidité avec les bottes magiques qu'il vous a offert";
                            imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/magical_boots.gif"));
                            new PanelTaverne(text, imgUrl, fenetre,a);
                           // System.out.println("Grâce a votre rencontre avec un mage, vous venez de gagner en rapidité avec les bottes magiques qu'il vous a offert");
                            monHero.setPlusSpeed(1);
                            break;
                            
                        case 4:
                            text = "Vous avez passé une très bonne soirée, vous vous souviendrez de l'adresse de cette taverne ou les plaisirs feminin sont rois.....\n Vous vous etes tellement donné que vous perdez " + nbPV + " points de vie";
                            imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/fuck_lose.gif"));
                            new PanelTaverne(text, imgUrl, fenetre,a);
                            //System.out.println("Vous avez passé une très bonne soirée, vous vous souviendrez de l'adresse de cette taverne ou les plaisirs feminin sont rois.....\n Vous vous etes tellement donné que vous perdez " + nbPV + " points de vie");
                            monHero.setMoinsPV(nbPV);
                            break;
                            
                        default:
                            text = "Vous avez perdu vos chaussures durant la soirée bien arrosé d'hier, vous perdez donc de la rapidité.";
                            imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/boots_lose.gif"));
                            new PanelTaverne(text, imgUrl, fenetre,a);
                           // System.out.println("Vous avez perdu vos chaussures durant la soirée bien arrosé d'hier, vous perdez donc de la rapidité.");
                            if (monHero.speed > 1) {
                                monHero.setMoinsSpeed(1);
                            }          
                            break;
                    }
               
                break;
                
            case 3:
                text = "Vous vous retrouver face a face avec un de vos enemies.";
                imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/creature_fight.gif"));
                new PanelTaverne(text, imgUrl, fenetre, true);
                //System.out.println("Vous vous retrouver face a face avec un de vos enemies.");
                //JPanelCombat c = new JPanelCombat(monHero);
                break;
            
            case 4:
                text = "Vous vous offrez les services d'une jolie demoiselle cela vous rapporte " + nbPV + " points de vie";
                imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/fuck_win.gif"));
                new PanelTaverne(text, imgUrl, fenetre,a);
                //System.out.println("Vous vous offrez les services d'une jolie demoiselle cela vous rapporte " + nbPV + " points de vie");
                    monHero.setPlusPV(nbPV); 
      
                
                break;
                
            default:
                text = "Vous avez profité d'une bonne nuit de repos au sein de la taverne.\n Bonne continuation pour votre aventure";
                imgUrl = new ImageIcon(this.getClass().getResource("../img/taverne/tired.gif"));
                new PanelTaverne(text, imgUrl, fenetre,a);
               // System.out.println("Vous avez profité d'une bonne nuit de repos au sein de la taverne.\n Bonne continuation pour votre aventure");
                break;
        }
    }

    
}
