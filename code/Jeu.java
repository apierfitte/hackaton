import java.util.Scanner;

public class Jeu {
    //--------------------------------------------------------------------
    // ATTRIBUTS ---------------------------------------------------------
    //--------------------------------------------------------------------
    private Donjon donjon;
    private String nomJoueur;
    private boolean fini;

    //--------------------------------------------------------------------
    // CONSTRUCTEUR ------------------------------------------------------
    //--------------------------------------------------------------------
    public Jeu(String nomJoueur) {
        this.nomJoueur = nomJoueur;
        this.donjon = new Donjon();
        this.fini = false;
    }

    //--------------------------------------------------------------------
    // METHODES ----------------------------------------------------------
    //--------------------------------------------------------------------
    public Donjon renvoieDonjon() { return donjon; }
    public boolean estFini() { return fini; }
    public String renvoieNomJoueur() {return nomJoueur; }

    public void gestionSalle(Salle salle) {
        InterfaceGraphique appli = new InterfaceGraphique(salle);
        appli.setLocation(100, 100);
        appli.setSize(1800, 900);
        appli.setVisible(true);

        int y = appli.retourAbscisseEvenement();
        int x = appli.retourOrdonneeEvenement();
        Element truc = appli.renvoieEvenement();

        while (!((appli.retourAbscisse() == x) & (appli.retourOrdonnee() == y))) {
            try { Thread.sleep(1000); }
            catch(Exception e) {}

            System.out.println("xobjet : " + x);
            System.out.println("yobjet : " + y);
            System.out.println("xperso : " + appli.retourAbscisse());
            System.out.println(" yperso : " + appli.retourOrdonnee());
        }
            System.out.println(nomJoueur + " a rencontré un " + truc.getClass().getName());
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

        Jeu jeu = new Jeu(nom);

        Donjon donjon = jeu.renvoieDonjon();

        donjon.packing();
        donjon.afficher();
        
        jeu.gestionSalle(donjon.renvoieEtages()[0].renvoieSalles()[1]);
    }

}