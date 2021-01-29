import java.util.Random;

public class Donjon {
    private int nbEtage;
    private Etage[] etages;

    public Donjon(){
        Random r = new Random();
        this.nbEtage=r.nextInt(3)+3;
        etages = new Etage[nbEtage];
        for (int i = 0 ; i<nbEtage ; i++){
            this.etages[i]=new Etage();
        }
    }

    public void afficher(){
        for (int i = 0 ; i < nbEtage ; i++){
            this.etages[i].afficher();
            System.out.println("Etage suivant");
        }
    }

    public static void main(String[] args){
        Donjon donj = new Donjon();
        donj.afficher();
    }
}
