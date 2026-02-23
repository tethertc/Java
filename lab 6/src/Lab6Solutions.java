package lab6;

import java.util.Scanner;

public class Lab6Solutions {

    // ЗАДАНИЕ 1: Метод вычисления площади прямоугольника
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    // ЗАДАНИЕ 2: Метод определения чётности числа
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // ЗАДАНИЕ 3: Перегрузка метода max (для int)
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // ЗАДАНИЕ 3: Перегрузка метода max (для double)
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // ЗАДАНИЕ 4: Рекурсивное вычисление факториала
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: Факториал отрицательного числа не определён!");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // ЗАДАНИЕ 5: Рекурсивное вычисление степени числа
    public static long power(int base, int exponent) {
        if (exponent < 0) {
            System.out.println("Ошибка: Отрицательная степень не поддерживается!");
            return -1;
        }
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    // ГЛАВНЫЙ МЕТОД
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ЛАБОРАТОРНАЯ РАБОТА №6 =====");

        // ЗАДАНИЕ 1
        System.out.println("\n--- ЗАДАНИЕ 1: Площадь прямоугольника ---");
        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();
        System.out.print("Введите высоту: ");
        double height = scanner.nextDouble();
        double area = rectangleArea(width, height);
        System.out.println("Площадь прямоугольника = " + area);

        // ЗАДАНИЕ 2
        System.out.println("\n--- ЗАДАНИЕ 2: Проверка чётности ---");
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        if (isEven(num)) {
            System.out.println("Число " + num + " - ЧЁТНОЕ");
        } else {
            System.out.println("Число " + num + " - НЕЧЁТНОЕ");
        }

        // ЗАДАНИЕ 3 (int)
        System.out.println("\n--- ЗАДАНИЕ 3: Поиск максимума (int) ---");
        System.out.print("Введите первое целое число: ");
        int int1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int int2 = scanner.nextInt();
        System.out.println("Максимум: " + max(int1, int2));

        // ЗАДАНИЕ 3 (double)
        System.out.println("\n--- ЗАДАНИЕ 3: Поиск максимума (double) ---");
        System.out.print("Введите первое дробное число: ");
        double dbl1 = scanner.nextDouble();
        System.out.print("Введите второе дробное число: ");
        double dbl2 = scanner.nextDouble();
        System.out.println("Максимум: " + max(dbl1, dbl2));

        // ЗАДАНИЕ 4
        System.out.println("\n--- ЗАДАНИЕ 4: Рекурсивный факториал ---");
        System.out.print("Введите число: ");
        int factNum = scanner.nextInt();
        long factResult = factorial(factNum);
        if (factResult != -1) {
            System.out.println(factNum + "! = " + factResult);
        }

        // ЗАДАНИЕ 5
        System.out.println("\n--- ЗАДАНИЕ 5: Рекурсивная степень ---");
        System.out.print("Введите основание: ");
        int base = scanner.nextInt();
        System.out.print("Введите показатель степени: ");
        int exp = scanner.nextInt();
        long powResult = power(base, exp);
        if (powResult != -1) {
            System.out.println(base + " в степени " + exp + " = " + powResult);
        }

        scanner.close();
        System.out.println("\n===== ПРОГРАММА ЗАВЕРШЕНА =====");
    }
}