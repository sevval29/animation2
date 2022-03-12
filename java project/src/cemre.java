import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class cemre extends JFrame implements ActionListener, KeyListener, MouseListener {

    private int x = 250, y = 250, nx = 0, ny = 0, k = 0, l = 0, t = 70, r = 70;
    private Timer timer;
    private Random ran;
    private Color color, color2;

    public cemre() {

        timer = new Timer(200, this);
        timer.start();
        ran = new Random();
        color = new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255));

        addKeyListener(this);
        addMouseListener(this);

        setSize(500, 500);
        setVisible(true);
        setTitle("animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.setColor(color);
        g.fillOval(x, y, t, r);
    }

    public static void main(String[] args) {
        new cemre();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        repaint();
        x += nx;
        y += ny;
        t += k;
        r += l;

    }

    public void up() {
        ny = -ran.nextInt(15);
        nx = 0;
    }

    public void down() {
        ny = ran.nextInt(15);
        nx = 0;
    }

    public void left() {
        nx = -ran.nextInt(15);
        ny = 0;
    }

    public void right() {
        nx = ran.nextInt(15);
        ny = 0;
    }

    public void getbigger() {
        k = 3;
        l = 3;
    }

    public void getsmaller() {
        k = -3;
        l = -3;
    }

    public void changelocation() {
        x = getMousePosition().x;
        y = getMousePosition().y;
        repaint();
    }

    public void putitcenter() {
        x = 250;
        y = 250;
        repaint();
    }

    public void getcolorful() {
        color2 = new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255));
        color = color2;
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int trying = e.getKeyCode();


        if (trying == KeyEvent.VK_UP) {
            up();
        }
        if (trying == KeyEvent.VK_DOWN) {
            down();
        }
        if (trying == KeyEvent.VK_LEFT) {
            left();
        }
        if (trying == KeyEvent.VK_RIGHT) {
            right();
        }
        if (trying == KeyEvent.VK_L) {
            getbigger();
        }
        if (trying == KeyEvent.VK_S) {
            getsmaller();
        }

        if (trying == KeyEvent.VK_C) {
            getcolorful();
        }
		/*
		if (trying == KeyEvent.VK_C &&  || (trying == KeyEvent.VK_RIGHT) || (trying == KeyEvent.VK_LEFT)
				|| (trying == KeyEvent.VK_DOWN) || (trying == KeyEvent.VK_UP)) {
			getcolorful();
		}
		*/
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        if (e.getButton() == MouseEvent.BUTTON1) {
            changelocation();
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            putitcenter();
        }
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

}