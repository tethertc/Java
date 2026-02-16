import java.util.Scanner;
public class Task3_AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("\n=== ЗАДАНИЕ 3: Оператор присваивания ===");

        // Инициализация переменной
        int x = 10;
        System.out.println("Начальное значение x = " + x);

        // Присваивание с арифметическим выражением
        x = x + 5;
        System.out.println("После x = x + 5: x = " + x);

        // Составные операторы присваивания
        x += 3;  // эквивалентно x = x + 3
        System.out.println("После x += 3: x = " + x);

        x *= 2;  // эквивалентно x = x * 2
        System.out.println("После x *= 2: x = " + x);

        x -= 4;  // эквивалентно x = x - 4
        System.out.println("После x -= 4: x = " + x);

        x /= 2;  // эквивалентно x = x / 2
        System.out.println("После x /= 2: x = " + x);

        System.out.println("\nМеханизм присваивания:");
        System.out.println("1. Сначала вычисляется правая часть выражения");
        System.out.println("2. Затем результат присваивается переменной слева");
    }
}