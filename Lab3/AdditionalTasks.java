import java.util.Scanner;
public class AdditionalTasks {

    // Задача 1: Сумма и среднее арифметическое двух чисел
    public static void task1_SumAndAverage() {
        System.out.println("\n--- Задача 1: Сумма и среднее арифметическое ---");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        double average = sum / 2;

        System.out.printf("Сумма: %.2f + %.2f = %.2f%n", a, b, sum);
        System.out.printf("Среднее арифметическое: (%.2f + %.2f) / 2 = %.2f%n", a, b, average);
    }

    // Задача 2: Площадь и периметр прямоугольника
    public static void task2_RectangleAreaAndPerimeter() {
        System.out.println("\n--- Задача 2: Площадь и периметр прямоугольника ---");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Площадь: %.2f * %.2f = %.2f%n", length, width, area);
        System.out.printf("Периметр: 2 * (%.2f + %.2f) = %.2f%n", length, width, perimeter);
    }

    // Задача 3: Площадь круга
    public static void task3_CircleArea() {
        System.out.println("\n--- Задача 3: Площадь круга ---");
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14; // Константа

        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius; // S = π * r²

        System.out.printf("Площадь круга с радиусом %.2f = %.2f * %.2f² = %.2f%n",
                radius, PI, radius, area);
        System.out.println("(π = 3.14)");
    }

    // Задача 4: Перевод температуры из Цельсия в Фаренгейт
    public static void task4_CelsiusToFahrenheit() {
        System.out.println("\n--- Задача 4: Перевод температуры °C → °F ---");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32; // Формула перевода

        System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
        System.out.println("Формула: °F = (°C × 9/5) + 32");
    }

    // Задача 5: Расстояние при равномерном движении
    public static void task5_Distance() {
        System.out.println("\n--- Задача 5: Расстояние при равномерном движении ---");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость (км/ч): ");
        double speed = scanner.nextDouble();

        System.out.print("Введите время (часы): ");
        double time = scanner.nextDouble();

        double distance = speed * time; // S = v * t

        System.out.printf("Расстояние: %.2f км/ч * %.2f ч = %.2f км%n", speed, time, distance);
    }

    // Задача 6: Вычисление квадрата и куба числа
    public static void task6_SquareAndCube() {
        System.out.println("\n--- Задача 6: Квадрат и куб числа ---");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double number = scanner.nextDouble();

        double square = number * number;      // Квадрат числа
        double cube = square * number;         // Куб числа (используем предыдущий результат)

        System.out.printf("Число: %.2f%n", number);
        System.out.printf("Квадрат: %.2f² = %.2f%n", number, square);
        System.out.printf("Куб: %.2f³ = %.2f%n", number, cube);
        System.out.println("Куб вычислен путем умножения квадрата на исходное число");
    }

    // Метод для запуска всех дополнительных задач
    public static void runAllTasks() {
        System.out.println("\n=== ДОПОЛНИТЕЛЬНЫЕ ЗАДАЧИ 1-6 ===");

        task1_SumAndAverage();
        task2_RectangleAreaAndPerimeter();
        task3_CircleArea();
        task4_CelsiusToFahrenheit();
        task5_Distance();
        task6_SquareAndCube();
    }
}