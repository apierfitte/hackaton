import java.util.Scanner;

public class Jeu {
    //--------------------------------------------------------------------
    // ATTRIBUTS ---------------------------------------------------------
    //--------------------------------------------------------------------
    private Donjon donjon;
    private String nomJoueur;

    //--------------------------------------------------------------------
    // CONSTRUCTEUR ------------------------------------------------------
    //--------------------------------------------------------------------
    public Jeu(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        this.donjon = new Donjon();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n");

        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("###----------------------------------------###");
        System.out.println("## L'aventure de Xavier Sécheressse le doux ##");
        System.out.println("###----------------------------------------###");
        System.out.println("##############################################");
        System.out.println("##############################################");
        System.out.println("##############################################");


        System.out.print("\n");

        System.out.println("Quel est ton nom Xavier Sécheresse ?");
        String nom = sc.nextLine();

        System.out.println("Bienvenue à toi, " + nom + ".");

        

    }

}