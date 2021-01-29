public class Objet extends Element {
    // classe générale dont héritent les autres objets

    // attributs
    private boolean magique;

    // constructeurs
    public Objet(boolean magique, String caractere) {
        super(caractere);
        this.magique = magique;
    }

    // méthodes
    public boolean estMagique() {
        return this.magique;
    }

    public String renvoieCaractere() {
        return this.caractere;
    }

}