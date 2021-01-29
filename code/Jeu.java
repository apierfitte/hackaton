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

        int ytruc = appli.retourAbscisseEvenement();
        int xtruc = appli.retourOrdonneeEvenement();
        int xporte = appli.renvoiexporte();
        int yporte = appli.renvoieyporte();
        Element truc = appli.renvoieEvenement();
        Porte p = appli.renvoiePorte();

        boolean b = true;
        while (b) {
            try{Thread.sleep(2000);}
            catch (Exception e) {}
            System.out.println("x : " + appli.retourAbscisse());
            System.out.println("y : " + appli.retourOrdonnee());
            System.out.println("xporte :" + xporte);
            System.out.println("yporte : " + yporte);
        if ((appli.retourAbscisse() == xtruc) & (appli.retourOrdonnee() == ytruc)) {
            System.out.println(nomJoueur + " a rencontré un " + truc.getClass().getName());
        }
        if (((appli.retourAbscisse() == xporte) & (appli.retourOrdonnee() == yporte))) {
            b = false;
            System.out.print("port");
        }
        }
        appli.dispose();
            
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
        
        for (int i=0; i<donjon.renvoieNbEtage();i++) {
            for (int j=0; j<donjon.renvoieEtages()[i].renvoieNbSalle(); j++){
                jeu.gestionSalle(donjon.renvoieEtages()[i].renvoieSalles()[j]);
            }
        }
        jeu.gestionSalle(donjon.renvoieEtages()[0].renvoieSalles()[1]);
    }

}