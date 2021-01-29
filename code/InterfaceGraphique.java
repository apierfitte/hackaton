import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class InterfaceGraphique extends Frame implements KeyListener {

    public Salle piece;

    int x = 30, y = 30;

    // Constructeur

    public InderfaceGraphique(Salle piece) {
        this.piece = piece;
        addKeyListener(this);
        addWindowListener(new EcouteurPourFermetureFenetre());  

    }

    public void paint(Graphics g) {
        g.drawRect(29, 29, 330, 330);
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
            }
        }
    }
    

    public void keyTyped(KeyEvent ke) {
             // a priori inutile mais necessaire pour le foncrionnement
    }

    public void keyReleased(KeyEvent ke) {

        // a priori inutile
    }


    public void keyPressed(KeyEvent ke) {

        int keyCode = ke.getKeyCode();

        switch(keyCode) {
            case KeyEvent.VK_UP:
                if (y > 30) {y =y -30;}

                break;

            case KeyEvent.VK_DOWN:
                if (y < 330) {y =y +30;}
                break;

            case KeyEvent.VK_LEFT:
                if (x > 30) {x =x -30;}
                break;

            case KeyEvent.VK_RIGHT:
                if (x < 330) {x =x +30;}
                break;
        }

        repaint();


    }

    public static void main(String[] args) {
        Salle piece = new Salle(10,10,0);
        piece.packElement(3,3, new Lobbyiste());
        InterfaceGraphique appli = new InterfaceGraphique(piece);
        appli.setLocation(100, 100);
        appli.setSize(1800, 900);
        appli.setVisible(true);
    }
}