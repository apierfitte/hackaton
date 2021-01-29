public class Equipement extends Element {
    // classe générale dont héritent les autres Equipements

    // attributs
    private boolean magique;
    private Enchantement sort;
    private int attribut;

    // constructeurs
    public Equipement(int attribut, boolean magique, String caractere) {
        super(caractere);
        this.magique = magique;
        this.attribut = attribut;
        if (magique) { this.attribut += this.renvoieSort().renvoieModificateur(); }
    }

    public Equipement(int attribut, String caractere) {
        super(caractere);
        this.magique = false;
        this.attribut = attribut;
    }

    // méthodes
    public boolean estMagique() {
        return this.magique;
    }

    public Enchantement renvoieSort() { return this.sort; }

    public int renvoieStats() { return this.attribut; }

}