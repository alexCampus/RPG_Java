/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;
import java.util.Scanner;
/**
 *
 * @author alexandre.depembroke
 */
public class Tp3 {

        static Scanner sc = new Scanner(System.in);

        static int nbTours = 0; //Nombre de tours écoulés
        static boolean exitMain = false; //Permet de sortir du menu principal et quitter le programme
        static String choix;//Capture le choix pour chaque switch
        static int deplacement;//Nombre de case franchies en début de tour
        static int Case;//Case sur laquelle le joueur se trouve
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Initialisation scanner
        
        do{
            
            System.out.println("Bienvenue, allez vous reussir a sauver la Princesse....");

            System.out.println(
                    "\n____________________\n\n " +
                    "1 Commencer la partie \n\n " +
                    "2 Quitter                  " +
                    "\n____________________   \n");
            choix = sc.nextLine();
            
            switch(choix)
            {
                case "1":
                    System.out.println(
                            "Bienvenue dans une histoire dont VOUS serez le héros !\n" +
                            "Dans ce jeu, vous allez progresser sur un plateau constitué\n" +
                                    "de 100 cases.\n" +
                                    "Au hasard, des chemins, vous rencontrerez des événements\n" +
                                    "et essaierez d'y survivre.");
                    tour();

                case "2":

                    System.out.println("Au revoir");
                    exitMain = true;
                    break;
                
                default:
                    System.out.println("\u001B[41mL'option " + choix + " n'est pas valide.\u001B[m");
            }
            
        }while(!exitMain);

    }

    private static void tour(){
        System.out.println(
                "\n" +
                "Quelle race de héros voulez vous incarner ?\n\n" +
                "1 - Je veux être fort ! Je serai assez lent, mais je briserai tous ceux qui se mettront sur ma route !\n" +
                "2 - Je veux être rapide et agile. La force ne sera pas mon point fort, mais personne ne me rattrapera !\n" +
                "3 - Peu m'importe la force ou la rapidité, je veux pouvoir me soigner. Personne ne pourra me vaincre !\n" +
                "4 - Je ne sais pas trop choisir, je préfererai être polyvalent et parer à toutes les situations !\n");
        String choiceRace = sc.nextLine();
        Heros m = new Heros();
        switch (choiceRace){
            case "1" :
                System.out.println("Vous serez donc un nain !");
                m = new Nain();
                break;
            case "2" :
                System.out.println("Vous serez donc un elfe !");
                m = new Elfe();
                break;
            case "3" :
                System.out.println("Vous serez donc un hobbit !");
                m = new Hobbit();
                break;
            case "4" :
                System.out.println("Vous serez donc un humain !");
                m = new Humain();
                break;
            default :
                System.out.println("\u001B[41mL'option " + choix + " n'est pas valide.\u001B[m");
        }

        while (Case < 100) {
            nbTours ++;
            deplacement = 1;
            System.out.println("\u001B[36m       [              TOUR SUIVANT\n" +
                    "o()xxxx[{::::::::::::::::::::::::::::::::::>\n" +
                    "       [\n\u001B[m");
            for(int i = 0;i<m.getSpeed();i++){
                int rolledDice = Random.dice(6)-1;
                deplacement += rolledDice;
                System.out.println("Dice " + i + " : " + rolledDice);
            }
            Case += deplacement;
            System.out.println("\nVous avancez de " + deplacement + " cases.\n");
            System.out.println("Tour \u001B[32m" + nbTours + "\u001B[m - Case " + Case);
            if(Case>100){
                break;
            }

            int event = Random.event();

            switch(event) {
                case 0:
                    System.out.println("Vous continuez votre route et rien ne se passe.");
                    break;
                case 1:
                    System.out.println("Sur votre route, vous remarquez un petit village avc une taverne.\n" +
                            "Voulez vous y entrer ? Y/n");
                    choix = sc.nextLine();
                    switch (choix){
                        case "y":
                        case "Y":
                        case "o":
                        case "O":
                            System.out.println("Vous entrez dans la taverne...");
                            Taverne n = new Taverne(m);
                            n.eventTaverne();
                            break;
                        default:
                            System.out.println("Vous décidez de ne pas y entrer et continuez votre route sans encombres.");
                    }
                    break;
                case 2:
                    //INSTANCIER OBSTACLE
                    Obstacle obstacle = new Obstacle(Random.boolObsctacle(),2);
                    System.out.println("Un obstacle encombre votre route.");
                    if(obstacle.getIsBloquant()){ //   CHECK obstacle.isBloquant()
                        System.out.println("L'obstacle semble vraiment infranchissable, vous décidez donc de faire demi-tour.");
                        Case -= (int)Math.round((deplacement)*0.70);
                    } else {
                        System.out.println("Vous pensez pouvoir le franchir.\n" +
                                "1 - J'essaie de le franchir !\n" +
                                "2 - Non, je préfère faire demi-tour et trouver un autre chemin");
                        choix = sc.nextLine();
                        switch(choix){
                            case "1":
                                //QUI PEUT PASSER L'OBSTACLE, DANS QUELLES CONDITIONS
                                System.out.println("Vous réussissez à passer l'obstacle, mais vous sentez qu'un peu de repos vous fera le plus grand bien.\n" +
                                        "Votre prochain déplacement en sera peut-être affecté.");
                                break;
                            case "2":
                                System.out.println("L'obstacle vous semble vraiment infranchissable, vous décidez donc de faire demi-tour.");
                                break;
                        }
                    }
                    break;
                case 3:
                    Combat c = new Combat(m);
                    c.debutDuCombat();
                    break;
            }
            if (m.getPV() <= 0) {
                System.out.println("Vous êtes tout mourru !\n");
                Case = 100;
            }
            sc.nextLine();
        }
        if (m.getPV() < 0) {
            System.out.println("Vos amis vous pleuront pendant au moins 5 minutes, promis.");
        } else {
            System.out.println("Bravo ! Vous avez réussi à terminer cette histoire ! à bientôt pour de nouvelles aventures");
        }
        exitMain = true;
    }
}
