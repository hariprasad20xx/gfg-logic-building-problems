import java.util.Scanner;

public class OppositeFaceOfDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter face of the dice: ");
        int faceOfDice = scanner.nextInt();

        System.out.println("The number on the opposite face of the dice is: " + (7 - faceOfDice));

        scanner.close();
    }
}
