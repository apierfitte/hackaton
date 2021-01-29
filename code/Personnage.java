import java.util.Random;

public class Personnage extends etreVivant {
    // personnage de xavier sécheresse

    public final static int NOMBREPOUVOIRS = 2;

    // attributs
    private int argent;
    private int faim;
    private int soif;
    private boolean poison;
    private boolean[] pouvoirs; // pouvoirs[i]=true <=> le héros a le pouvoir i (cf. readme pour numéro des pouvoirs)

    // constructeurs
    public Personnage() { //initialise un personnage
        super(100,(new Random()).nextInt(16) + 5, new Poings(), new Nu(), "@"); // force aléatoire entre 5 et 15
        argent = 0;
        faim = 0;
        soif = 0;
        poison = false;
        pouvoirs = new boolean[NOMBREPOUVOIRS];
    }

    // méthodes

    // accesseurs

    public int renvoieArgent() { return argent; }

    public int renvoieFaim() { return faim; }

    public int renvoieSoif() { return soif; }

    public boolean estEmpoisonne() { return poison; }
}