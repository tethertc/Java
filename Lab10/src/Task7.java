import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task7 extends Applet implements ActionListener {
    Button red, green, blue;
    Color currentColor = Color.RED;

    public void init() {
        red = new Button("RED");
        green = new Button("GREEN");
        blue = new Button("BLUE");

        add(red);
        add(green);
        add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red) currentColor = Color.RED;
        if (e.getSource() == green) currentColor = Color.GREEN;
        if (e.getSource() == blue) currentColor = Color.BLUE;
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(currentColor);
        g.fillRect(100, 100, 150, 100);
    }
}