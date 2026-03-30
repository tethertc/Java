import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task5 extends Applet implements ActionListener {
    Button button;
    int counter = 0;

    public void init() {
        button = new Button("Нажми +1");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        counter++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Счётчик: " + counter, 50, 100);
    }
}