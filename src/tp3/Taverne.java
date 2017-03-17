/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author alexandre.depembroke
 */
public class Taverne {
    
    private int nb;
    private Heros monHero;
    int nbPV = (int)(Math.random() * 20) +1;
    int nbPVPerteMax =(int)(Math.random() * 50)+15;
    int nbForce = (int)(Math.random() * 5) +1;
    
    public Taverne(Heros monHero){
        this.monHero = monHero;
        nb = (int)(Math.random() *5);
       
    }
    
    public void eventTaverne(){
        switch(nb){
            case 1:                
                
                System.out.println("Vous venez de retrouver un de vos vieux amis, après avoir passé une bonne soirée en sa présence.\nCela vous a permis de regagner " + nbPV + " points de vie.");                
                monHero.setPlusPV(nbPV); 
                break;
                
            case 2:
                int choix = (int)(Math.random() * 5);
                    switch(choix){
                        case 1:
                            System.out.println("Malheureusement la taverne est pleine. Le patron est d'humeur sympathique et vous offre une nouvelle épée pour vous dédommager");
                            monHero.setPlusForce(nbForce);
                            break;
                            
                        case 2:
                            System.out.println("Vous n'avez pas controlé votre consommation de bieres elfique\n et sous les effets de l'alcool vous vous êtes battus avec votre voisin de comptoir.....");
                            int nbAleatoire = (int)(Math.random() * 5)+1;
                            switch(nbAleatoire){
                                case 1:
                                    System.out.println("Bravo, vous lui avez défoncé la tête en moins de deux et vous avez ainsi récuperer ses armes sans perdre de PV");
                                    monHero.setPlusForce(nbForce + 3);
                                    break;
                                    
                                case 2:
                                    System.out.println("Vous vous êtes bien battus mais votre voisin était venus avec tous ses amis.....\n Vous vous êtes donc faits viré de la taverne.\n Vous perdez donc " + nbPV + " points de vie");
                                    monHero.setMoinsPV(nbPV);
                                    break;
                                    
                                case 3:
                                    System.out.println("Vous vous réveillez dans une chambre inconnu avec mal à la tête, et vous remarquez les calecons posé sur la chaise et ce ne sont pas les votres.....\nVous décidez de vous enfuir le plus vite possible!!!! ");
                                    break;
                                    
                                default:
                                    System.out.println("Votre voisin etait vraiment super fort, et vous regrettez votre choix car vous perdez " + nbPVPerteMax + " points de vie et " + nbForce + " de force...." );
                                    monHero.setMoinsPV(nbPVPerteMax);
                                    monHero.setMoinsForce(nbForce);                                 
                                    break;
                            }
                            break;
                            
                        case 3:
                            System.out.println("Grâce a votre rencontre avec un mage, vous venez de gagner en rapidité avec les bottes magiques qu'il vous a offert");
                            monHero.setPlusSpeed(nbForce);
                            break;
                            
                        case 4:
                            System.out.println("Vous avez passé une très bonne soirée, vous vous souviendrez de l'adresse de cette taverne ou les plaisirs feminin sont rois.....\n Vous vous etes tellement donné que vous perdez " + nbPV + " points de vie");
                            monHero.setMoinsPV(nbPV);
                            break;
                            
                        default:
                            System.out.println("Vous avez perdu vos chaussures durant la soirée bien arrosé d'hier, vous perdez donc de la rapidité.");
                            monHero.setMoinsSpeed(nbForce);
                            break;
                    }
               
                break;
                
            case 3:
                System.out.println("Vous êtes vraiment très fatigué et vous choisissez de vous faire une soirée pépère......");
                break;
            
            case 4:
                System.out.println("Vous vous offrez les services d'une jolie demoiselle cela vous rapporte " + nbPV + " points de vie");
                monHero.setPlusPV(nbPV); 
                break;
                
            default:
                System.out.println("Vous avez profité d'une bonne nuit de repos au sein de la taverne.\n Bonne continuation pour votre aventure");
                break;
        }
    }
    
}
