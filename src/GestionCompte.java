import java.util.Scanner;

public class GestionCompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte choix=0;
        String numeroLu="",vide="";
        Scanner lectureClavier= new Scanner(System.in);
                Compte C=new Compte(vide);
        do { 
        choix=menuPrincipal();
        switch(choix){
            case 1:
                System.out.print("Compte Epargne (o/n) : ");
                if(lectureClavier.next().charAt(0)=='o') C=new CpteEpargne();
                else C=new Compte();
                break;
        //Option 2
            case 2:
        //demande  à l'utilisateur de saisir le numéro du compte à afficher
        System.out.print("Quel compte souhaitez-vous afficher?: ");
        numeroLu=lectureClavier.next();
        //Si le numéro existe
        if(numeroLu.equalsIgnoreCase(C.quelNumeroDeCompte()))
            C.afficherCpte();
        //Sinon
        else {
        System.out.println("Le système ne connnait pas le compte "+numeroLu);
        }
        break;
        //Option 3
            case 3:
        System.out.print("Pour quel compte souhaitez-svous creer une ligne? : ");
        numeroLu=lectureClavier.next();
        if(numeroLu.equalsIgnoreCase(C.quelNumeroDeCompte())) C.creerLigne();
        else System.out.println("Le Systeme ne connait pas le compte "+numeroLu);
                
        break;
        //option 4
            case 4:
        sortir();
        break;
            case 5:
        //option 5
        //le programma affiche l'aide
        alAide();
        break;
            default:
                System.out.println("Cette option n'existe pas");
        }
        } while (choix!=4);
        
    }
    public static byte menuPrincipal(){
        byte tmp;
        Scanner lectureClavier=new Scanner(System.in);
        System.out.println("1. Création d'un compte");
        System.out.println("2. Affichage d'un compte");
        System.out.println("3. Ecrire une ligne comptable");
        System.out.println("4. Sortir");
        System.out.println("5. De l'Aide");
        System.out.println();
        System.out.print("Votre choix: ");
        tmp=lectureClavier.nextByte();
        return tmp;
    }
    public static void sortir(){
        System.out.println("Au revoir et à bientôt");
        System.exit(0);
    }
    public static void alAide(){
         System.out.println("Option 1. Pour créer un compte courant entrer C ");
        System.out.println(" Pour créer un compte Joint entrer J ");
        System.out.println(" Pour créer un compte Epargne entrer E ");
        System.out.println(" Puis, entrer  le numero du compte, et");
        System.out.println("sa première valeur creditée");
        System.out.println(" Dans le cas d'un compte epargne, entrer le taux ");
        System.out.println("Option 2. le système affiche les données du compte choisi ");
        System.out.println("Option 3. Ecrire une ligne comptable");
        System.out.println("Option 4. Pour quitter le programme");
        System.out.println("Option 5. Pour afficher l'aide");
        
    }
    
}
