import java.util.*;
import java.util.stream.Collectors;

class Order {
    String product;
    double price;

    Order(String product, double price) {
        this.product = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return product + " ($" + price + ")";
    }
}

public class Task16_20 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Bob", 20, 85),
                new Student("Alice", 22, 90),
                new Student("Charlie", 19, 75),
                new Student("David", 20, 88),
                new Student("Eva", 22, 92)
        );

        // Задание 16: Группировка по возрасту
        System.out.println("=== Задание 16 ===");
        var groupedByAge = students.stream()
                .collect(Collectors.groupingBy(s -> s.age));
        groupedByAge.forEach((age, list) -> {
            System.out.println("Возраст " + age + ":");
            list.forEach(s -> System.out.println("  " + s));
        });

        // Задание 17: Reduce - сумма элементов
        System.out.println("\n=== Задание 17 ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Сумма " + numbers + " = " + sum);

        // Альтернативный reduce
        int sum2 = numbers.stream().reduce(Integer::sum).orElse(0);
        System.out.println("Сумма (через метод): " + sum2);

        // Задание 18: Distinct + Limit
        System.out.println("\n=== Задание 18 ===");
        List<Integer> withDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
        System.out.print("Уникальные первые 3 элемента: ");
        withDuplicates.stream()
                .distinct()
                .limit(3)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 19: FlatMap (список списков)
        System.out.println("\n=== Задание 19 ===");
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        System.out.print("Все элементы через flatMap: ");
        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Задание 20: Real case - обработка заказов
        System.out.println("\n=== Задание 20 ===");
        List<Order> orders = Arrays.asList(
                new Order("Laptop", 1200),
                new Order("Mouse", 25),
                new Order("Keyboard", 80),
                new Order("Monitor", 350),
                new Order("Desk", 450),
                new Order("Chair", 1500)
        );

        System.out.println("Заказы > 1000, отсортированные по цене:");
        orders.stream()
                .filter(o -> o.price > 1000)
                .sorted(Comparator.comparing(o -> o.price))
                .forEach(o -> System.out.println("  " + o));
    }
}