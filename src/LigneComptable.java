
import java.util.Scanner;

/**
 *
 * @author 
 */
public class LigneComptable {
    private double valeur;
    private String date;
    private String motif;
    private String mode;

    public LigneComptable(){
          Scanner lectureClavier=new Scanner(System.in);
        System.out.print("Entrer la valeur à crediter (+) ou"
                + " debiter (-) : ");
        valeur=lectureClavier.nextDouble();
        System.out.print("Date de l'operation [jj/mm/an] ");
        date=lectureClavier.next();
        System.out.print("Entrer le motif [S(alaire), L(oyer),"+
        "A(limentation), D(ivers)]: ");
        motif=controleMotif();
        mode=controleMode();
    }
    public double quelleValeur() {
        return valeur;
    }

    public String quelleDate() {
        return date;
    }

    public String quelMotif() {
        return motif;
    }

    public String quelMode() {
        return mode;
    }
    
    private String controleMode(){
        Scanner lectureClavier=new Scanner(System.in);
        String tmpS="";
        char tmpc='\0';
        do {
           System.out.print("Mode [C(B), N(° cheque), V(irement)] :");
           tmpc=lectureClavier.next().charAt(0);
        } while (tmpc!='C' && tmpc!='N' && tmpc!='V');
        switch(tmpc) {
            case 'C' : tmpS="CB";
            break;
            case 'N' : tmpS="Cheque";
            break;
            case 'V' : tmpS="Virement";
            break;
        }
        return tmpS;
    }
    private  String controleMotif(){
        Scanner lectureClavier=new Scanner(System.in);
        String tmpS="";
        char tmpc='\0';
        do{
            System.out.print("Motif de l'operation [S(alaire);");
            System.out.print("L(oyer),A(limentation),D(ivers)]: ");
            tmpc=lectureClavier.next().charAt(0);
        } while(tmpc!='S' && tmpc!='L' && tmpc!='A' && tmpc!='D');
        switch(tmpc) {
            case 'S': tmpS="Salaire";
            break;
            case 'L': tmpS="Loyer";
            break;
            case 'A': tmpS="Alimentation";
            break;
            case 'D': tmpS="Divers";
            break;
        }
        return tmpS;
        
    }

    public void afficherLigne(){
        if(valeur<0)
            System.out.print("Debiter: "+valeur);
        else
            System.out.print("Crediter : "+valeur);
        System.out.println("le: "+date+" motif: "+motif+" mode: "+mode);
    }
}
