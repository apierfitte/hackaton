import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")


public class InterfaceGraphique extends Frame implements KeyListener {

    public Salle piece;

    private int x = 30, y = 30;
    private int icarre = 1, jcarre = 1;
    private int a, b;
    private int xporte, yporte;
    private int xescalier, yescalier;
    private Element evenement;
    private Porte p;

    // Constructeur

    public InterfaceGraphique(Salle piece) {
        this.piece = piece;
        addKeyListener(this);
        addWindowListener(new EcouteurPourFermetureFenetre());  

        for (int i = 0; i< this.piece.hauteur; i++) {    // parcours de la salle
            for (int j = 0; j< this.piece.largeur; j++) {

                if ( (piece.salle[i][j] instanceof Monstre) && (((Monstre) piece.salle[i][j]).estVivant()) ) {
                    a = i;
                    b = j;
                    evenement = piece.salle[i][j];

                }
                if ( (piece.salle[i][j] instanceof Equipement) && (((Equipement) piece.salle[i][j]).estConsomme() == false) ) {
                    a = i;
                    b = j;
                    evenement = piece.salle[i][j];

                }
                if ( (piece.salle[i][j] instanceof Consommable) && ((Consommable) (piece.salle[i][j])).estConsomme() == false)  {
                    a = i;
                    b = j;
                    evenement = piece.salle[i][j];
                }
                if (piece.salle[i][j] instanceof Escalier) {
                    xescalier = i;
                    yescalier = j;
                }
                if  (piece.salle[i][j] instanceof Porte) {
                    xporte = i;
                    yporte = j;
                    p = (Porte)piece.salle[i][j];
                }
            }
    }

    }

    public Porte renvoiePorte() { return p; }
    public int retourAbscisse() {
        return icarre;
    }

    public int retourOrdonnee() {
        return jcarre;
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

    public int renvoiexporte() { return xporte; }
    public int renvoieyporte() { return yporte; }

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
                }
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
                jcarre--;
                if (y > 60) {y =y -30;}

                break;

            case KeyEvent.VK_DOWN:
                jcarre++;
                if (y < 60+ 30 *this.piece.largeur) {y =y +30;}
                break;

            case KeyEvent.VK_LEFT:
                icarre--;
                if (x > 30) {x =x -30;}
                break;

            case KeyEvent.VK_RIGHT:
                icarre++;
                if (x < 30+ 30 *this.piece.hauteur) {x =x +30;}
                break;
        }

        repaint();

    }

}