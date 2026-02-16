package task5;

import java.util.Scanner;

public class SumUntilZero {
    public static int calculate() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Число: ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);
        return sum;
    }
}