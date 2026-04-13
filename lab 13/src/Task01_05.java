import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task01_05 {
    public static void main(String[] args) {
        // Задание 1: Сложение двух чисел
        System.out.println("=== Задание 1 ===");
        Calculator sum = (a, b) -> a + b;
        System.out.println("5 + 3 = " + sum.calc(5, 3));

        // Задание 2: Преобразование в верхний регистр
        System.out.println("\n=== Задание 2 ===");
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("hello world -> " + toUpper.apply("hello world"));

        // Задание 3: Фильтрация нечётных чисел
        System.out.println("\n=== Задание 3 ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        System.out.print("Нечётные числа: ");
        numbers.stream().filter(isOdd).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 4: Квадрат каждого числа
        System.out.println("\n=== Задание 4 ===");
        System.out.print("Квадраты чисел: ");
        numbers.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 5: Максимальный элемент
        System.out.println("\n=== Задание 5 ===");
        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        int max = numbers.stream().max(comparator).orElse(0);
        System.out.println("Максимальный элемент: " + max);
    }

    @FunctionalInterface
    interface Calculator {
        int calc(int a, int b);
    }
}