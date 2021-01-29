import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Deplacement extends Frame implements KeyListener {

    int x = 200, y = 200;

    // Constructeur

    public Deplacement() {

        addKeyListener(this);
        addWindowListener(new EcouteurPourFermetureFenetre());  

    }

    public void paint(Graphics g) {
        //g.drawString("x =" + x + ", y =" + y, 40, 30);
        g.drawRect(40, 40, 400, 400);
        g.setColor(Color.CYAN);
        g.fillRect(x,y, 30, 30);

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
                if (y > 41) {y =y -10;}

                break;

            case KeyEvent.VK_DOWN:
                if (y < 400) {y =y +10;}
                break;

            case KeyEvent.VK_LEFT:
                if (x > 41) {x =x -10;}
                break;

            case KeyEvent.VK_RIGHT:
                if (x < 400) {x =x +10;}
                break;
        }

        repaint();


    }

    public static void main(String[] args) {
        Deplacement appli = new Deplacement();
        appli.setLocation(100, 100);
        appli.setSize(600, 600);
        appli.setVisible(true);
    }
}