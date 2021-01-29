public class Arme extends Equipement {
    // atributs statiques
    public final static int NOMBREARMES = 7;  

    // attributs
    private int degats;


    // constructeur
    public Arme(int degats, boolean magique) {
        super(magique, "A");
        this.degats = degats;

        if (magique) { this.degats += this.renvoieSort().renvoieModificateur(); }

    }

    public Arme(int degats) {
        super("A");
        this.degats = degats;
    }

    // méthode
    public int renvoieDegats() {
        return(this.degats);
    }


}

class repartie extends Arme {
    public repartie(boolean magique) {
        super(6, magique);
    }

    public repartie() {
        super(6);
    }
}

class sensDeLaFete extends Arme {
    public sensDeLaFete(boolean magique) {
        super(7, magique);
    }

    public sensDeLaFete() {
        super(7);
    }
}

class confianceEnSoi extends Arme {
    public confianceEnSoi(boolean magique) {
        super(8, magique);
    }

    public confianceEnSoi() {
        super(8);
    }
}

class compassion extends Arme {
    public compassion(boolean magique) {
        super(5, magique);
    }

    public compassion() {
        super(5);
    }
}

class Poings extends Arme {
    public Poings() { super(2); }
}

class appareilJuridique extends Arme {
    public appareilJuridique(boolean magique) { super(4, magique); }
    public appareilJuridique() { super(4); }
}

class poireau extends Arme {
    public poireau(boolean magique) { super(3, magique); }
    public poireau() { super(3); }
}

class gesteDesordonne extends Arme {
    public gesteDesordonne(boolean magique) { super(6, magique)}
    public gesteDesordonne() { super(6);}
}