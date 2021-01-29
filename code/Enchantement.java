public class Enchantement {
    // attributs statiques
    public static final int NOMBREENCHANTEMENTS = 2;

    // attributs
    private int modif;

    // constructeurs

    public Enchantement(int modif) {
    this.modif = modif;
    }

    // méthodes

    public int renvoieModificateur() { return this.modif; }
}

class mauvaiseFacture extends Enchantement {
    public mauvaiseFacture() {
        super(-1);
    }
}

class tresCoupant extends Enchantement {
    public tresCoupant() {
        super(2);
    }
}

