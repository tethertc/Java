import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   ЛАБОРАТОРНАЯ РАБОТА №3");
        System.out.println("   Тема: Линейные алгоритмы в Java");
        System.out.println("==========================================");

        while (true) {
            // Меню выбора заданий
            System.out.println("\nВыберите задание для выполнения:");
            System.out.println("1 - Задание 1: Последовательность команд");
            System.out.println("2 - Задание 2: Арифметические операции");
            System.out.println("3 - Задание 3: Оператор присваивания");
            System.out.println("4 - Задание 4: Ввод и вывод данных");
            System.out.println("5 - Задание 5: Площадь прямоугольника");
            System.out.println("6 - Все дополнительные задачи (1-6)");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Task1_CommandSequence.main(null);
                    break;
                case 2:
                    Task2_ArithmeticOperations.main(null);
                    break;
                case 3:
                    Task3_AssignmentOperator.main(null);
                    break;
                case 4:
                    Task4_InputOutput.main(null);
                    break;
                case 5:
                    Task5_LinearAlgorithm.main(null);
                    break;
                case 6:
                    AdditionalTasks.runAllTasks();
                    break;
                case 0:
                    System.out.println("\nПрограмма завершена. До свидания!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }

            System.out.println("\nНажмите Enter для продолжения...");
            scanner.nextLine(); // Очистка буфера
            scanner.nextLine(); // Ожидание нажатия Enter
        }
    }
}