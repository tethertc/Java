import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Task2 extends Applet {
    public void paint(Graphics g) {
        // Красный прямоугольник
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 80);

        // Зеленый круг
        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 80, 80);

        // Синий овал
        g.setColor(Color.BLUE);
        g.fillOval(50, 170, 120, 70);

        // Желтый квадрат
        g.setColor(Color.YELLOW);
        g.fillRect(220, 170, 80, 80);

        // Оранжевый треугольник
        g.setColor(Color.ORANGE);
        int[] x = {350, 400, 450};
        int[] y = {50, 150, 50};
        g.fillPolygon(x, y, 3);
    }
}