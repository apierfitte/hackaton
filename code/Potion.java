public class Potion extends Consommable {
    // attributs
    private int modificateur;

    // constructeur
    public Potion(int modificateur, String caractere) {
        super(caractere);
        this.modificateur = modificateur;
    }

    // méthodes
    public int renvoieModificateur() { return modificateur; }
}

class PotionVie extends Potion {
    public PotionVie(int modificateur) {
        super(modificateur , "V");
    }

    public PotionVie() {
        super(10, "V");
    }
}

class PotionPoison extends Potion {
    public PotionPoison() {
        super(0, "s");
    }
}

class PotionForce extends Potion {
    public PotionForce(int modificateur) {
        super(modificateur, "F");
    }

    public PotionForce() {
        super(2, "F");
    }
}
