public class Consommable extends Element {
    // atributs 
    private boolean consomme;

    // constructeur
    public Consommable(String caractere) {
        super(caractere);
        consomme = false;
    }

    //méthodes

    // accesseurs
    public boolean estConsomme() { return consomme; }

    // autres méthodes
    public void consommer() { this.consomme = true; }
}