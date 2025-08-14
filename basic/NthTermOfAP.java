import java.util.Scanner;

public class NthTermOfAP {
    public static int findNthTerm(int a1, int a2, int n) {
        return a1 + (n - 1) * (a2 - a1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first and second term of AP: ");
        int firstTerm = scanner.nextInt();
        int secondTerm = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.println("The " + n + "th term of the given AP is: " + findNthTerm(firstTerm, secondTerm, n));

        scanner.close();
    }

}