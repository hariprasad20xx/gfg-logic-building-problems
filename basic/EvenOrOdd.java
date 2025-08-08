import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

		if(isEven(number)) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        scanner.close();
    }

    public static boolean isEven(int n) {
        if((n & 1) == 0) {
            return true;
        } else {
            return false;
        }
            
    }
}
