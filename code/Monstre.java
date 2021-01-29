public class Monstre extends etreVivant {
    // attributs statiques 
    public static final int NOMBREMONSTRES = 2;

    // attributs
    private int vie;
    private int force;
    private Arme arme;
    private Armure armure;

    // constructeurs
    public Monstre(int vie, int force, Arme arme, Armure armure) {
        super("M");
        this.vie = vie;
        this.force = force;
        this.arme = arme;
        this.armure = armure;
    }
}

class Lobbyiste {
    public Lobbyiste() {
        super();
    }
}

class Ecolo {
    public Ecolo() {
        super();
    }
}