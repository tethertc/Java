import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%s (%d лет, оценка: %.1f)", name, age, grade);
    }
}

public class Task11_15 {
    public static void main(String[] args) {
        // Задание 11: Consumer
        System.out.println("=== Задание 11 ===");
        Consumer<String> printer = s -> System.out.println("Вывод: " + s);
        printer.accept("Hello Consumer!");

        // Задание 12: Supplier
        System.out.println("\n=== Задание 12 ===");
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println("Случайное число: " + randomSupplier.get());
        System.out.println("Ещё случайное: " + randomSupplier.get());

        // Задание 13: Comparator.comparing
        System.out.println("\n=== Задание 13 ===");
        List<Student> students = Arrays.asList(
                new Student("Bob", 20, 85),
                new Student("Alice", 22, 90),
                new Student("Charlie", 19, 75)
        );
        students.sort(Comparator.comparing(s -> s.age));
        System.out.println("Сортировка по возрасту: ");
        students.forEach(s -> System.out.println("  " + s));

        // Задание 14: Работа с объектами Student
        System.out.println("\n=== Задание 14 ===");
        System.out.println("Студенты с оценкой > 80, сортировка по имени:");
        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(s -> System.out.println("  " + s));

        // Задание 15: Stream chaining
        System.out.println("\n=== Задание 15 ===");
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6);
        System.out.print("Цепочка (фильтр > 3, *2, сортировка): ");
        numbers.stream()
                .filter(n -> n > 3)
                .map(n -> n * 2)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}