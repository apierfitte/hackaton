import java.util.Random ;

public class Etage {
    private int hauteur;
    private int largeur;
    private int nbSalle ;
    public Salle[] salles;

    public Etage(){
        this.hauteur = 30;
        this.largeur = 60;
        Random r = new Random();
        this.nbSalle = r.nextInt(5)+4;
        this.salles = new Salle[this.nbSalle];
        for (int i = 0 ; i<this.nbSalle ; i++) {
            int h = r.nextInt(8)+3;
            int l = r.nextInt(8)+3;
            this.salles[i]= new Salle(l,h,i);
            this.salles[i].packSalle();
        }
    }

    public void afficher(){
        for (int i = 0 ; i < nbSalle ; i ++){
            salles[i].afficher();
        }
    }
    public static void main(String[] args){
        Etage eta = new Etage();
        eta.afficher();
    }
}
