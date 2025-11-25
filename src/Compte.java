
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Compte {
    private String typeCpte;
    private double val_courante;
    private String numeroCpte;
    private LigneComptable ligne;
    private int nbLigneReel;
    
    public Compte(){
        Scanner lectureClavier=new Scanner(System.in);
       typeCpte=controleType();
                System.out.print("Numéro du compte: ");
                numeroCpte=lectureClavier.next();
                System.out.print("Première valeur creditée : ");
                val_courante=controleValinit();
       nbLigneReel=0;
    }
    public Compte(String type){
        Scanner lectureClavier=new Scanner(System.in);
        if(type.equalsIgnoreCase("Epargne")){
            typeCpte=type;
            System.out.print("Numero du compte : ");
            numeroCpte=lectureClavier.next();
            val_courante=controleValinit();
            nbLigneReel=0;
        }

    }
    

    public String quelTypeDeCompte() {
        return typeCpte;
    }

    public double quelleValeurCourante() {
        return val_courante;
    }


    public String quelNumeroDeCompte() {
        return numeroCpte;
    }
    
    private String controleType(){
        char tmpc='\0';
        Scanner lectureClavier=new Scanner(System.in);
        String tmpS="";
        do {
            System.out.print("Type du compte [Types possibles :");
            System.out.print("C(ourant),J(oint)] : ");
            tmpc=lectureClavier.next().charAt(0);
            
        }while (tmpc!='C'  && tmpc!='J');
        switch(tmpc){
            case 'C' : tmpS="Courant";
            break;
            case 'J' : tmpS="Joint";
            break;
            
        }
        return tmpS;
    }
    
    private double controleValinit(){
        double tmpval;
        Scanner lectureClavier=new Scanner(System.in);
        do {
            System.out.print("Valeur initiale du compte: ");
            tmpval=lectureClavier.nextDouble();
        } while(tmpval<=0);
        return tmpval;
    }
    
    public void creerLigne(){
        ligne=new LigneComptable();
        //ligne.creerLigneComptable();
        nbLigneReel=1;
        val_courante=val_courante+ligne.quelleValeur();
    }
    public void afficherCpte(){
        System.out.println("Le compte n°: "+numeroCpte+
                " est un compte"+typeCpte);
        if(nbLigneReel>0) ligne.afficherLigne();
        System.out.println("Valeur courante: "+val_courante);
        if(val_courante<0)
            System.out.println("Attention compte débiteur ....!!!");
        
    }
}
