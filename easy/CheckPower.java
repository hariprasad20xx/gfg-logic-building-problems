import java.util.Scanner;

public class CheckPower {
    public static boolean isPower(int x, int y) {
        double result1 = Math.log(y) / Math.log(x);
        return result1 == Math.floor(result1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("Program to check if y is a power of x");
        System.out.println("**************************************");
        System.out.println();

        System.out.print("Enter the value of x and y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (isPower(x, y)) {
            System.out.println(y + " is a power of " + x);
        } else {
            System.out.println(y + " is not a power of " + x);
        }

        scanner.close();
    }
}
