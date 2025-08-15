import java.util.Scanner;

public class SumOfDigits {
    public static int findSum(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Sum of digits of the number " + number + " is: " + findSum(number));
        
        scanner.close();
    }
}
