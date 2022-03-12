
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

public class event extends JFrame  implements ActionListener, KeyListener,MouseListener{
    private Timer timer;
    private Random ran;
    private int x, x1;
    private int y, y1;
    private int k, l;

    public event() {
        x=100;
        y=100;
        x1=100;
        y1=100;

        timer = new Timer(200, this);
        //timer.start();
        ran= new Random();
        addKeyListener(this);
        addMouseListener(this);

        setSize(500,500);
        setVisible(true);
        setTitle("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillOval(x, y, x1, y1);

    }


    public void goright() {
        x=x+ran.nextInt(10);
        repaint();
    }
    public void goleft() {
        x=x-ran.nextInt(10);
        repaint();
    }
    public void goup() {
        y=y-ran.nextInt(10);
        repaint();
    }
    public void godown() {
        y=y+ran.nextInt(10);
        repaint();
    }
    public void smaller() {
        x1=x1-3;
        y1=y1-3;
        repaint();

    }
    public void bigger() {
        x1=x1+3;
        y1=y1+3;
        repaint();
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

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new event();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub


        repaint();

        x1=x1+k;
        y1=y1+l;

    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyCode()==e.VK_RIGHT) {

            goright();}
        //System.out.println("ss");}
        else if(e.getKeyCode()==e.VK_LEFT)
            goleft();

        else if(e.getKeyCode()==e.VK_UP)
            goup();
        else if(e.getKeyCode()==e.VK_DOWN)
            godown();
        else if(e.getKeyCode()==e.VK_S)
            //System.out.println("sssss");
            smaller();
        else if(e.getKeyCode()==e.VK_L)
            bigger();
    }
    @Override
    public void keyReleased(KeyEvent e) {
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
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
