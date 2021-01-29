public class Objet extends Element {
    // classe générale dont héritent les autres objets

    // attributs
    private boolean magique;
    private Enchantement sort;

    // constructeurs
    public Objet(boolean magique, String caractere) {
        super(caractere);
        this.magique = magique;
    }

    public Objet(String caractere) {
        super(caractere);
        this.magique = false;
    }

    // méthodes
    public boolean estMagique() {
        return this.magique;
    }

    public Enchantement renvoieSort() { return this.sort; }

}