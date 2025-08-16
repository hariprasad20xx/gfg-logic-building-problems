import java.util.Scanner;

public class ReverseNumber {
    public static int reverseDigits(int n) {
        int revNum = 0;
        while(n != 0) {
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }

        return revNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Reverse of the number " + number + " is: " + reverseDigits(number));
        
        scanner.close();
    }
}
