import java.util.Scanner;
public class Task5_LinearAlgorithm {
    public static void main(String[] args) {
        System.out.println("\n=== ЗАДАНИЕ 5: Площадь прямоугольника ===");

        Scanner scanner = new Scanner(System.in);

        // Ввод длины прямоугольника
        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        // Ввод ширины прямоугольника
        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        // Вычисление площади (линейный алгоритм)
        double area = length * width;

        // Вычисление периметра (дополнительно)
        double perimeter = 2 * (length + width);

        // Вывод результатов
        System.out.println("\nРезультаты вычислений:");
        System.out.println("--------------------------------");
        System.out.printf("Длина: %.2f%n", length);
        System.out.printf("Ширина: %.2f%n", width);
        System.out.printf("Площадь прямоугольника: %.2f%n", area);
        System.out.printf("Периметр прямоугольника: %.2f%n", perimeter);

        scanner.close();
    }
}