enum Emplacement{
    Gauche,Droite,Haut,Bas
}


public class Salle {
    public int largeur;
    public int hauteur;
    public int numeroSalle;
    public Element[][] salle;

    public Salle(int l, int h, int nbsalle){
        try{
            if ((l<=0)|(h<=0)) {
                throw new MonException("La largeur et la hauteur doivent être strictement positifs");
            }
        }
        catch (MonException e){
            System.out.println(e.getMessage());
        }
        this.largeur=l+2; //On compte la bordure
        this.hauteur=h+2; //On compte la bordure 
        this.numeroSalle = nbsalle; 
        this.salle = new Element[this.hauteur][this.largeur]; 
    }
    public void packSalle(){
        for (int i = 0; i<this.hauteur; i++){
            if ((i==0)|(i==(this.hauteur-1))){
                for (int j = 0; j<this.largeur; j++){
                        this.salle[i][j] = new Element("-");
                }
            }
            else {
                for (int j = 0; j<this.largeur; j++){
                    if ((j==0)||(j==(this.largeur-1))){
                        this.salle[i][j] = new Element("|");
                    }
                    else {
                        this.salle[i][j] = new Element(".");
                    }                 
                }
            }
        }
    }
    public void packElement(int i, int j, Element elem){
        try {
            if ((i<=0)|(i>=this.hauteur)|(j<=0)|(j>=this.largeur)){
                throw new MonException("Coordonnées non valides");
            }
        }
        catch (MonException e) {
            System.out.println(e.getMessage());
        } 
        this.salle[i][j]=elem;
    }

    public void afficher(){
        String s = "";
        for (int i = 0 ; i < this.salle.length ; i++){
            for (int j = 0 ; j < this.salle[0].length ; j++){
                s = s + this.salle[i][j].renvoieCaractere() ;
            }
            s = s + "\n";
        }
        System.out.println(s);
    }
    public static void main(String [] args) throws MonException{
        Salle Sa = new Salle(3,3,0);
        Sa.packSalle();
        Sa.afficher();
    }
}
