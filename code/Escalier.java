public class Escalier extends Element{
    private int etageA;
    private int etageB;
    private int[] coordA;
    private int[] coordB;
    private int salleA;
    private int salleB;

    public Escalier(int a, int b, int salle, int[] posA, int[] posB ){
        super("µ");
        try{
            if ((posA.length!=2)|(posB.length!=2)){
                throw new MonException("Position non valide");
            }
        }
        catch(MonException e){
            System.out.println(e.getMessage());
        }
        this.etageA = a;
        this.etageB = b;
        this.salleA = salle;
        this.salleB = 0;
        this.coordA = new int[2];
        this.coordA = posA;
        this.coordB = new int[2];
        this.coordB = posB;

    }

    public int[] changementEtage(int k){
        try{
            if ((k!=this.etageA)&(k!=this.etageB)){
                throw new MonException("Etage non valide");
            }
        }
        catch (MonException e){
            System.out.println(e.getMessage());
        }
        int[] position = new int[4];
        if (k==this.etageA){
            position[0] = this.etageB;
            position[1] = this.salleB;
            position[2] = this.coordB[0];
            position[3] = this.coordB[1];

            return position ;
        }
        else {
            position[0] = this.etageA;
            position[1] = this.salleA;
            position[2] = this.coordA[0];
            position[3] = this.coordA[1];

            return position ;
        }
    }
}