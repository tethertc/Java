import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends Applet implements ActionListener {
    Button button;
    String message = "";

    public void init() {
        button = new Button("Нажми меня");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Кнопка нажата!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}