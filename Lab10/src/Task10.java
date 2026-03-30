import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task10 extends Applet implements ActionListener {
    TextField textField;
    Button button;
    String text = "";
    Color color = Color.RED;

    public void init() {
        textField = new TextField(20);
        button = new Button("Показать");

        add(new Label("Введите текст:"));
        add(textField);
        add(button);

        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = textField.getText();
        color = Color.BLUE;
        repaint();
    }

    public void paint(Graphics g) {
        // Фигура
        g.setColor(color);
        g.fillRect(100, 150, 100, 80);

        // Текст
        if (!text.isEmpty()) {
            g.setColor(Color.BLACK);
            g.drawString("Текст: " + text, 100, 100);
        }
    }
}