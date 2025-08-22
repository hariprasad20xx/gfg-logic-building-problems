import java.util.Scanner;

public class ValidTriangle {
    public static boolean isValid(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sides of the triangle: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isValid(a, b, c)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is invalid.");
        }

        scanner.close();
    }
}
