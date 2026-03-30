import java.applet.Applet;
import java.awt.Graphics;

public class Task1 extends Applet {
    public void paint(Graphics g) {
        // Прямоугольник
        g.drawRect(50, 50, 150, 100);
        g.drawString("Прямоугольник", 70, 45);

        // Круг
        g.drawOval(250, 50, 100, 100);
        g.drawString("Круг", 270, 45);

        // Линия
        g.drawLine(50, 200, 200, 200);
        g.drawString("Линия", 90, 195);
    }
}