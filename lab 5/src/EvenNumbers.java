package task4;

public class EvenNumbers {
    public static void print() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}