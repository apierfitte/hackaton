public class Personnage {
    // personnage de xavier sécheresse

    // attributs
    private final static int NOMBREPOUVOIRS = 2;
    private final static int NOMBREARMES = 4;

    private int vie;
    private int argent;
    private int force;
    private int armure;
    private int faim;
    private int soif;
    private boolean poison;
    private boolean[] pouvoirs; // pouvoirs[i]=true <=> le héros a le pouvoir i (cf. readme pour numéro des pouvoirs)
    private boolean[] armes; // idem que pour les pouvoirs 

    // constructeurs
    public Personnage() { //initialise un personnage
        vie = 100;
        argent = 0;
        force = 10;
        armure = 0;
        faim = 0;
        soif = 0;
        poison = false;
        pouvoirs = new boolean[NOMBREPOUVOIRS];
        armes = new boolean[NOMBREARMES];
    }

    // méthodes
}