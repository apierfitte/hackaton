public class Armure extends Equipement {

    // attributs statiques
    public static final int NOMBREARMURES = 4;

    // attributs
    private int armure;

    // constructeurs
    public Armure(int armure, boolean magique) {
        super(magique, "B");
        this.armure = armure;

        if (magique) { this.armure += this.renvoieSort().renvoieModificateur(); }
    }

    public Armure(int armure) {
        super("B");
        this.armure = armure;
    }

    // méthode
    public int renvoieArmure() {
        return(this.armure);
    }

}

class colRoule extends Armure {
    public colRoule(boolean magique) {
        super(3, magique);
    }

    public colRoule() {
        super(3);
    }
}

class pagne extends Armure {
    public pagne(boolean magique) {
        super(5, magique);
    }

    public pagne() {
        super(5);
    }
}

class chemise extends Armure {
    public chemise(boolean magique) {
        super(2, magique);
    }

    public chemise() {
        super(2);
    }
}

class Nu extends Armure {
    public Nu(boolean magique) {
        super(1, magique);
    }

    public Nu() {
        super(1);
    }
}