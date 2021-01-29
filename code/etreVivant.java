public class etreVivant extends Element {
    // attributs 
    private boolean enVie;
    private int vie;
    private int force;
    private Arme arme;
    private Armure armure;
    private boolean poison;

    // constructeur
    public etreVivant(int vie, int force, Arme arme, Armure armure, String caractere) {
        super(caractere);
        this.vie = vie;
        this.force = force;
        this.arme = arme;
        this.armure = armure;
        this.enVie = true;
        this.poison = false;
    }

    // méthodes

    // accesseurs

    public boolean estEmpoisonne() { return poison; }

    public boolean estVivant() {
        if (vie <= 0) { enVie = false; }
        return enVie;
    }

    public int renvoiePV() { return vie; }

    public int renvoieForce() { return force; }

    public Arme renvoieArme() { return arme; }

    public Armure renvoieArmure() { return armure; }

    // autres méthodes

    public void blesser() { 
        vie--; 
        }
    public void blesser(int degats) { vie -= degats; }

    public void soigner() { vie++; }
    public void soigner(int soin)  { vie += soin; }

    public void changerArmure(Armure armure) { this.armure = armure; }
    public void changerArme(Arme arme) {this.arme = arme; }

    public void empoisonner() { this.poison = true; }

    public void boirePotion(PotionVie p) { this.vie += p.renvoieModificateur(); }
    public void boirePotion(PotionForce p) {
        int n = p.renvoieModificateur();
        if (force >= 20 - n) {
            vie -= 2;
        }
        else {
            force += n;
        }
    }

    public void boirePotion(PotionPoison p) { this.empoisonner(); }
}