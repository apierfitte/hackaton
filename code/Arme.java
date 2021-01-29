public class Arme extends Objet {
    // atributs statiques
    public final static int NOMBREARMES = 4;  

    // attributs
    private int degats;


    // constructeur
    public Arme(int degats, boolean magique) {
        super(magique, "A");
        this.degats = degats;

    }

    public Arme(int degats) {
        super(false);
        this.degats = degats;
    }

    // méthode
    public int renvoieDegats() {
        return(this.degats);
    }


}

class repartie extends Arme {
    public repartie(boolean magique) {
        super(, magique);
    }

    public repartie() {
        super();
    }
}

class sensDeLaFete extends Arme {
    public sensDeLaFete(boolean magique) {
        super(, magique);
    }

    public sensDeLaFete() {
        super();
    }
}

class confianceEnSoi extends Arme {
    public confianceEnSoi(boolean magique) {
        super(, magique);
    }

    public confianceEnSoi() {
        super();
    }
}

class compassion extends Arme {
    public compassion(boolean magique) {
        super(, magique);
    }

    public compassion() {
        super();
    }
}