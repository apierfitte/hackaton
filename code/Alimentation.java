public class Alimentation extends Consommable {
    // attributs statiques
    private static final int NOMBREALIMENTS = 9;
    
    // attributs
    private int faim;
    private int soif;

    // constructeur
    public Alimentation(int faim, int soif, String caractere) {
        super(caractere);
        this.faim = faim;
        this.soif = soif;
    }

    // méthodes

    public int renvoieSoif() { return soif; }
    public int renvoieFaim() { return faim;}

}

class antiNourriture extends Alimentation {
    public antiNourriture() {super(2, 0, "¨");}
}

class tacos69 extends Alimentation {
    public tacos69() {super(-7, 2, "T");}
}

class jonquille extends Alimentation {
    public jonquille() {super(-1, -1, "J");}
}

class conteDeFees extends Alimentation {
    public conteDeFees() {super(-5, 0, "f");}
}

class wrap extends Alimentation {
    public wrap() {super(-6, 1, "w"); }
}

class eau extends Alimentation {
    public eau() {super(0, -2, "o");}
}

class cocaCola extends Alimentation {
    public cocaCola() {super(0, 1, "è"); }
}

class biereTradi extends Alimentation {
    public biereTradi() {super(-1, -3, "&"); }
}

class powerade extends Alimentation {
    public powerade() {super(1, -4, "~");}
}