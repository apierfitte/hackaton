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
    public int renvoieNbEtage(){
        return this.nbEtage;
    }
    public void afficher(){
        for (int i = 0 ; i < nbEtage ; i++){
            this.etages[i].afficher();
            System.out.println("Etage suivant");
        }
    }

    public void packing(){
       for (int eta = 0 ; eta < this.nbEtage ; eta ++){
           for (int sal = 0 ; sal < this.etages[eta].renvoieNbSalle() ; sal ++){
               int l = this.etages[eta].salles[sal].largeur;
               int h = this.etages[eta].salles[sal].hauteur;
               Random r = new Random();
               int lObj = r.nextInt(l-2)+1;
               int hObj = r.nextInt(h-2)+1;
               if (((sal + 1)==this.etages[eta].renvoieNbSalle())&((eta+1)!=(this.nbEtage))){
                   this.etages[eta].salles[sal].packElement(hObj,lObj,new Escalier(eta,eta+1,sal,new int[]{hObj,lObj}, new int[]{1,1}));
                   this.etages[eta+1].salles[0].packElement(1,1,new Escalier(eta+1,eta,sal,new int[]{1,1}, new int[]{hObj,lObj}));
               }
               else {
                   if (sal!=0){
                        Element[] objets = new Element[]{new antiNourriture(), new tacos69(), new jonquille(), new conteDeFees(), new wrap(), new eau(), new cocaCola(),
                        new biereTradi(), new powerade(), new repartie(), new sensDeLaFete(), new confianceEnSoi(), new compassion(), new Poings(), new appareilJuridique(),
                        new poireau(), new colRoule(), new pagne(), new chemise(), new Nu(), new Lobbyiste(), new Ecolo(), new PotionVie(), new PotionPoison(), new PotionForce() };
                        int k = r.nextInt(objets.length);
                        this.etages[eta].salles[sal].packElement(hObj,lObj,objets[k]);
                   }
               }
               if (((sal+1)==this.etages[eta].renvoieNbSalle())&((eta+1)==(this.nbEtage))){
                this.etages[eta].salles[sal].packElement(hObj,lObj,new Graal());
               }
               if (sal==0){
                   Random q = new Random();
                   int hObje = q.nextInt(h-2)+1;
                   int hObj2 = q.nextInt(this.etages[eta].salles[sal+1].hauteur-2)+1;
                   this.etages[eta].salles[sal].packElement(hObje,this.etages[eta].salles[sal].largeur-1, new Porte(0,1,eta,new int[]{hObje,this.etages[eta].salles[sal].largeur-1},new int[]{hObj2,0}));
                   this.etages[eta].salles[sal+1].packElement(hObj2,0, new Porte(1,0,eta,new int[]{hObj2,0},new int[]{hObje,this.etages[eta].salles[sal].largeur-1}));
               }
               else {
                   if((sal+1)!=this.etages[eta].renvoieNbSalle()){
                        Random p = new Random();
                        int hObjet = p.nextInt(h-2)+1;
                        int hObje2 = p.nextInt(this.etages[eta].salles[sal+1].hauteur-2)+1;
                        this.etages[eta].salles[sal].packElement(hObjet,this.etages[eta].salles[sal].largeur-1, new Porte(sal,sal+1,eta,new int[]{hObjet,this.etages[eta].salles[sal].largeur-1},new int[]{hObje2,0}));
                        this.etages[eta].salles[sal+1].packElement(hObje2,0, new Porte(sal+1,sal,eta,new int[]{hObje2,0},new int[]{hObjet,this.etages[eta].salles[sal].largeur-1}));
                    }
               }
            }
        
       } 
    }
    public static void main(String[] args){
        Donjon D = new Donjon();
        D.packing();
        D.afficher();
    }
}
