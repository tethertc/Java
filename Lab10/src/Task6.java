import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task6 extends Applet implements ActionListener {
    TextField textField;
    Button button;
    String name = "";

    public void init() {
        textField = new TextField(20);
        button = new Button("OK");
        add(new Label("Введите имя:"));
        add(textField);
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        name = textField.getText();
        repaint();
    }

    public void paint(Graphics g) {
        if (!name.isEmpty()) {
            g.drawString("Привет, " + name + "!", 50, 150);
        }
    }
}