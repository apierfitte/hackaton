public class Armure extends Objet {

    // attributs statiques
    public static final int NOMBREARMURES = 3;

    // attributs
    private int armure;

    // constructeurs
    public Armure(int armure, boolean magique) {
        super(magique, "B");
        this.armure = armure;
    }

    public Armure(int armure) {
        super(false);
        this.armure = armure;
    }

    // méthode
    public int renvoieArmure() {
        return(this.armure);
    }

}

class colRoule extends Armure {
    public colRoule(boolean magique) {
        super(, magique);
    }

    public colRoule() {
        super();
    }
}

class pagne extends Armure {
    public pagne(boolean magique) {
        super(, magique);
    }

    public pagne() {
        super();
    }
}

class chemise extends Armure {
    public chemise(boolean magique) {
        super(, magique);
    }

    public chemise() {
        super();
    }
}