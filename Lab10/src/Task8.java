import java.applet.Applet;
import java.awt.*;

public class Task8 extends Applet implements Runnable {
    int x = 50;
    Thread thread;

    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > getWidth() - 50) x = 50;
            repaint();
            try { Thread.sleep(50); } catch(Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 100, 50, 50);
    }
}