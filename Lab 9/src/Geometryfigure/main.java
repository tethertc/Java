public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 2: Геометрические фигуры ===");
        Circle circle = new Circle(5);
        Rectangle rect = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Triangle area: " + triangle.area());
        System.out.println();
    }
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}