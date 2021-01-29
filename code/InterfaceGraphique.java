import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")


public class InterfaceGraphique extends Frame implements KeyListener {

    public Salle piece;

<<<<<<< HEAD
    private int x = 30, y = 30;
    private int a, b;
    private Element evenement;
=======
    int x = 30, y = 60;
>>>>>>> 4c34a6afb8d272dffb175c34931ecf019a75f3f4

    // Constructeur

    public InterfaceGraphique(Salle piece) {
        this.piece = piece;
        addKeyListener(this);
        addWindowListener(new EcouteurPourFermetureFenetre());  

        for (int i = 0; i< this.piece.hauteur; i++) {    // parcours de la salle
            for (int j = 0; j< this.piece.largeur; j++) {

                if ( (piece.salle[i][j] instanceof Monstre) && (((Monstre) piece.salle[i][j]).estVivant()) ) {
                    a = 30 + 30*i;
                    b = 60 + 30*j;
                    evenement = piece.salle[i][j];

                }
                if ( (piece.salle[i][j] instanceof Equipement) && (((Equipement) piece.salle[i][j]).estConsomme() == false) ) {
                    a = 30 + 30*i;
                    b = 60 + 30*j;
                    evenement = piece.salle[i][j];

                }
                if ( (piece.salle[i][j] instanceof Consommable) && ((Consommable) (piece.salle[i][j])).estConsomme() == false)  {
                    a = 30 + 30*i;
                    b = 60 + 30*j;
                    evenement = piece.salle[i][j];
                }
                if (piece.salle[i][j] instanceof Escalier) {
                    a = 30 + 30*i;
                    b = 60 + 30*j;
                    evenement = piece.salle[i][j];
                }
            }
    }

    }

    public int retourAbscisse() {
        return x + 90;
    }

    public int retourOrdonnee() {
        return y;
    }

    public int retourOrdonneeEvenement() {
        return a;
    }

    public int retourAbscisseEvenement() {
        return b;
    }

    public Element renvoieEvenement() {
        return evenement;
    }

    public void paint(Graphics g) {
        g.drawRect(29, 59, 30+ 30 *this.piece.hauteur, 60+ 30*this.piece.largeur);
        g.setColor(Color.CYAN);
        g.fillRect(x,y, 30, 30);

         for (int i = 0; i< this.piece.hauteur; i++) {    // parcours de la salle
            for (int j = 0; j< this.piece.largeur; j++) {

                if ( (piece.salle[i][j] instanceof Monstre) && (((Monstre) piece.salle[i][j]).estVivant()) ) {
                    g.setColor(Color.BLACK);
                    g.fillRect(30*i,30*j, 30, 30);
                }
                if ( (piece.salle[i][j] instanceof Equipement) && (((Equipement) piece.salle[i][j]).estConsomme() == false) ) {
                    g.setColor(Color.GREEN);
                    g.fillRect(30*i,30*j, 30, 30);

                }
                if ( (piece.salle[i][j] instanceof Consommable) && ((Consommable) (piece.salle[i][j])).estConsomme() == false)  {
                    g.setColor(Color.RED);
                    g.fillRect(30*i,30*j, 30, 30);

                }
                if (piece.salle[i][j] instanceof Escalier) {
                    g.setColor(Color.PINK);
                    g.fillRect(30*i,30*j, 30, 30);
                if  (piece.salle[i][j] instanceof Porte) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(30*i,30*j, 30, 30);

                }
            }
        }
    }
    

    public void keyTyped(KeyEvent ke) {
             // a priori inutile mais necessaire pour le fonctionnement
    }

    public void keyReleased(KeyEvent ke) {

        // a priori inutile
    }


    public void keyPressed(KeyEvent ke) {

        int keyCode = ke.getKeyCode();

        switch(keyCode) {
            case KeyEvent.VK_UP:
                if (y > 60) {y =y -30;}

                break;

            case KeyEvent.VK_DOWN:
                if (y < 60+ 30 *this.piece.largeur) {y =y +30;}
                break;

            case KeyEvent.VK_LEFT:
                if (x > 30) {x =x -30;}
                break;

            case KeyEvent.VK_RIGHT:
                if (x < 30+ 30 *this.piece.hauteur) {x =x +30;}
                break;
        }

        repaint();

    }

<<<<<<< HEAD
=======
    public static void main(String[] args) {
        Salle piece = new Salle(5,7,0);
        piece.packElement(3,3, new Lobbyiste());
        InterfaceGraphique appli = new InterfaceGraphique(piece);
        appli.setLocation(100, 100);
        appli.setSize(600, 600);
        appli.setVisible(true);
    }
>>>>>>> 4c34a6afb8d272dffb175c34931ecf019a75f3f4
}