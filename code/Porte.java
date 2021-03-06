public class Porte extends Element{
    private int salleA;
    private int salleB;
    private int[] coordA;
    private int[] coordB;
    private int numEtage;

    public Porte(int a, int b, int etage, int[] posA, int[] posB){
        super("+");
        try{
            if ((posA.length!=2)|(posB.length!=2)){
                throw new MonException("Position non valide");
            }
        }
        catch(MonException e){
            System.out.println(e.getMessage());
        }
        this.numEtage = etage;
        this.salleA = a;
        this.salleB = b;
        this.coordA = new int[2];
        this.coordA = posA;
        this.coordB = new int[2];
        this.coordB = posB;
    }

    public int[] changementSalle(int k){
        try{
            if ((k!=this.salleA)&(k!=this.salleB)){
                throw new MonException("Salle non valide");
            }
        }
        catch (MonException e){
            System.out.println(e.getMessage());
        }
        int[] position = new int[4];
        position[0] =  this.numEtage;
        if (k==this.salleA){
            position[1] = this.salleB;
            position[2] = this.coordB[0];
            position[3] = this.coordB[1] ;
            return position ;
        }
        else {
            position[1] = this.salleA;
            position[2] = this.coordA[0];
            position[3] = this.coordA[1] ;
            return position ;
        }
    }
}
