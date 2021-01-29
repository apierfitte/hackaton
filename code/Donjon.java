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

    public Etage[] renvoieEtages() {
        return this.etages;
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
                        new biereTradi(), new powerade(), new repartie(), new sensDeLaFete(), new confianceEnSoi(), new compassion(), new appareilJuridique(),
                        new poireau(), new colRoule(), new pagne(), new chemise(), new Lobbyiste(), new Ecolo(), new PotionVie(), new PotionPoison(), new PotionForce() };
                            int k = r.nextInt(objets.length);
                            this.etages[eta].salles[sal].packElement(hObj,lObj,objets[k]);
                   }
               }
               if (((sal+1)==this.etages[eta].renvoieNbSalle())&((eta+1)==(this.nbEtage))){
                this.etages[eta].salles[sal].packElement(hObj,lObj,new Graal());
            }
           }
       } 
    }
}
