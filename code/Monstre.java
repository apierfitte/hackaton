public class Monstre extends etreVivant {
    // attributs statiques 
    public static final int NOMBREMONSTRES = 2;

    // constructeurs
    public Monstre(int vie, int force, Arme arme, Armure armure) {
        super(vie, force, arme, armure, "M");
    }
}

class Lobbyiste extends Monstre {
    public Lobbyiste() {
        super(75, 11, new appareilJuridique(), new chemise());
    }
}

class Ecolo extends Monstre {
    public Ecolo() {
        super(80, 7, new poireau(), new pagne());
    }
}