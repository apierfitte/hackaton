public class etreVivant extends Element {
    // attributs 
    private boolean enVie;
    private int vie;
    private int force;
    private Arme arme;
    private Armure armure;

    // constructeur
    public etreVivant(int vie, int force, Arme arme, Armure armure, String caractere) {
        super(caractere);
        this.vie = vie;
        this.force = force;
        this.arme = arme;
        this.armure = armure;
        this.enVie = true;
    }

    // méthode 
    public boolean estVivant() {
        return enVie;
    }
}