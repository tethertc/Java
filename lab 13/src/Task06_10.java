import java.util.*;
import java.util.Optional;

public class Task06_10 {
    public static void main(String[] args) {
        // Задание 6: Сортировка строк по длине
        System.out.println("=== Задание 6 ===");
        List<String> words = Arrays.asList("java", "python", "c", "javascript", "go");
        System.out.print("Сортировка по длине: ");
        words.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .forEach(w -> System.out.print(w + " "));
        System.out.println();

        // Задание 7: Первая буква заглавная
        System.out.println("\n=== Задание 7 ===");
        System.out.print("С заглавной буквы: ");
        words.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .forEach(w -> System.out.print(w + " "));
        System.out.println();

        // Задание 8: Фильтр строк длиной > 5
        System.out.println("\n=== Задание 8 ===");
        System.out.print("Строки длиной > 5: ");
        words.stream().filter(s -> s.length() > 5).forEach(w -> System.out.print(w + " "));
        System.out.println();

        // Задание 9: Method reference
        System.out.println("\n=== Задание 9 ===");
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);
        System.out.print("Method reference: ");
        nums.forEach(System.out::println);

        // Задание 10: Optional - минимальное число
        System.out.println("\n=== Задание 10 ===");
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> nonEmptyList = Arrays.asList(5, 2, 8, 1, 9);

        int min1 = emptyList.stream().min(Integer::compareTo).orElse(-1);
        System.out.println("Минимум в пустом списке: " + min1);

        int min2 = nonEmptyList.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Минимум в списке: " + min2);
    }
}