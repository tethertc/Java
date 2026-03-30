import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Task3 extends Applet {
    public void paint(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 24);
        g.setFont(font);
        g.setColor(Color.RED);
        g.drawString("Hello Java Applet", 100, 150);
        setBackground(Color.LIGHT_GRAY);
    }
}