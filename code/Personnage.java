import java.util.Random;
import java.lang.Math;

public class Personnage extends etreVivant {
    // personnage de xavier sécheresse

    public final static int NOMBREPOUVOIRS = 2;

    // attributs
    private int argent;
    private int faim;
    private int soif;
    private boolean[] pouvoirs; // pouvoirs[i]=true <=> le héros a le pouvoir i (cf. readme pour numéro des pouvoirs)

    // constructeurs
    public Personnage() { //initialise un personnage
        super(100,(new Random()).nextInt(11) + 5, new Poings(), new Nu(), "@"); // force aléatoire entre 5 et 15
        argent = 0;
        faim = 0;
        soif = 0;
        pouvoirs = new boolean[NOMBREPOUVOIRS];
    }

    // méthodes

    // accesseurs

    public int renvoieArgent() { return argent; }

    public int renvoieFaim() { return faim; }

    public int renvoieSoif() { return soif; }


    // autres méthodes

    public void ajouterArgent() { argent++; }
    public void ajouterArgent(int somme) { argent += Math.abs(somme); } // la somme doit toujours être positive

    public void retirerArgent() { argent--; }
    public void retirerArgent(int somme) { argent -= Math.abs(somme); }

    public void manger() { faim--; }
    public void manger(int nutriments) { faim -= nutriments; }

    public void affamer() { faim++; }
    public void affamer(int nutriments) { faim += nutriments; }

    public void boire() { soif--; }
    public void boire(int volume) { soif -= volume; }

    public void assoifer() {soif++; }
    public void assoifer(int volume) {soif += volume; }

}