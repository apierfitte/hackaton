public class etreVivant extends Element {
    // attributs 
    private boolean vie;

    // constructeur
    public etreVivant(String caractere) {
        super(caractere);
        vie = true;
    }

    // méthode 
    public boolean estVivant() {
        return vie;
    }
}