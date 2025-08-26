import java.util.Scanner;

public class PairCubeCount {
    public static int countPairs(int n) {
        int count = 0;

        for (int i = 1; i <= Math.cbrt(n); i++) {
            int cube = i * i * i;

            int difference = n - cube;

            int cbrtDiff = (int) Math.cbrt(difference);

            if (cbrtDiff * cbrtDiff * cbrtDiff == difference) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Number of pairs whose sum of cubes is equal to " + number + " is: " + countPairs(number));

        scanner.close();
    }
}