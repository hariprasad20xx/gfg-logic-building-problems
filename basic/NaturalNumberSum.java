import java.util.Scanner;

public class NaturalNumberSum {
    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        System.out.println("Sum of first " + number + " natural numbers is: " + findSum(number));

        scanner.close();
    }
}
