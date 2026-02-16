import task1.NumbersPrinter;
import task2.SumCalculator;
import task3.Factorial;
import task4.EvenNumbers;
import task5.SumUntilZero;
import bonus.MultiplicationTable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ЛАБОРАТОРНАЯ РАБОТА №5\n");

        // Задание 1
        System.out.print("Задание 1. N = ");
        NumbersPrinter.print(scanner.nextInt());

        // Задание 2
        System.out.print("Задание 2. N = ");
        int n2 = scanner.nextInt();
        System.out.println("Сумма = " + SumCalculator.calculate(n2));

        // Задание 3
        System.out.print("Задание 3. N = ");
        int n3 = scanner.nextInt();
        System.out.println("Факториал = " + Factorial.compute(n3));

        // Задание 4
        System.out.println("Задание 4. Чётные числа:");
        EvenNumbers.print();

        // Задание 5
        System.out.println("Задание 5. Сумма = " + SumUntilZero.calculate());

        // Бонус
        System.out.println("Бонус. Таблица умножения:");
        MultiplicationTable.print();

        scanner.close();
    }
}