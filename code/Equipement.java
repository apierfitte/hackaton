public class Equipement extends Element {
    // classe générale dont héritent les autres Equipements

    // attributs
    private boolean magique;
    private Enchantement sort;

    // constructeurs
    public Equipement(boolean magique, String caractere) {
        super(caractere);
        this.magique = magique;
    }

    public Equipement(String caractere) {
        super(caractere);
        this.magique = false;
    }

    // méthodes
    public boolean estMagique() {
        return this.magique;
    }

    public Enchantement renvoieSort() { return this.sort; }

}