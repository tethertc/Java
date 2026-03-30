import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Task9 extends Applet implements MouseListener {
    ArrayList<Point> points = new ArrayList<>();

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        points.add(e.getPoint());
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void paint(Graphics g) {
        for (Point p : points) {
            g.fillOval(p.x - 5, p.y - 5, 10, 10);
        }
    }
}