public class Personnage extends etreVivant {
    // personnage de xavier sécheresse

    public final static int NOMBREPOUVOIRS = 2;

    // attributs
    private int vie;
    private int argent;
    private int force;
    private int armure;
    private int faim;
    private int soif;
    private boolean poison;
    private boolean[] pouvoirs; // pouvoirs[i]=true <=> le héros a le pouvoir i (cf. readme pour numéro des pouvoirs)
    private Arme arme; // idem que pour les pouvoirs 

    // constructeurs
    public Personnage() { //initialise un personnage
        super("@");
        vie = 100;
        argent = 0;
        force = 10;
        armure = 0;
        faim = 0;
        soif = 0;
        poison = false;
        pouvoirs = new boolean[NOMBREPOUVOIRS];
        armes = null;
    }

    // méthodes
}