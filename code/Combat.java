import java.util.Random;

class Combat {

    //Attributs

    private Monstre Auguste;
    private Personnage Xavier;
    private int degatsP;
    private int degatsM;


    public Combat (Monstre M, Personnage P){
        Auguste = M;
        Xavier = P;

        int P_arme = Xavier.renvoieArme().renvoieDegats();
        
        double p_attaque = (int) 1 + 5 * Math.random();
        int P_attaque = (int) p_attaque;
        int P_force = Xavier.renvoieForce();
        double P_faim = Xavier.renvoieFaim();
        double P_soif = Xavier.renvoieSoif();
        double ATTAQUE_P = P_arme * P_attaque * P_force - P_faim - P_soif;
        degatsP =(int) ATTAQUE_P/Auguste.renvoieArmure().renvoieArmure();

        int M_arme = Auguste.renvoieArme().renvoieDegats();
        double m_attaque = 1 + 5 * Math.random();
        int M_attaque = (int) m_attaque;
        int M_force = Auguste.renvoieForce();
        double ATTAQUE_M = M_arme * M_attaque * M_force;
        degatsM =(int) ATTAQUE_M/Xavier.renvoieArmure().renvoieArmure();
    }

    public static void main (String[] args, Monstre M){
       // Monstre M = new Lobbyiste();
        Personnage P = new Personnage();
        Combat c = new Combat (M,P);
        c.Auguste.blesser(c.degatsP);
        c.Xavier.blesser(c.degatsM);
    }

}
