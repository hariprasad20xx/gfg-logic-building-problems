import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfectNumber(int n) {

        int sum = 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i != n) {
                    sum = sum + i + n / i;
                } else {
                    sum = sum + i;
                }     
            }
        }

        return sum == n && n != 1;
    }

    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}
