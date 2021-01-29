public class Armure extends Equipement {

    // attributs statiques
    public static final int NOMBREARMURES = 4;

    // constructeurs
    public Armure(int armure, boolean magique) {
        super(armure, magique, "B");
    }

    public Armure(int armure) {
        super(armure, "B");
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