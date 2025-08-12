import java.util.Scanner;

public class ClosestNumber {
    public static int findClosest(int n, int m) {
		int quotient = n / m;
		
		// first closest number
		int n1 = m * quotient;
		
		// second closest number
		int n2 = (n * m > 0) ? m * (quotient + 1) : m * (quotient - 1);
		
		if (Math.abs(n - n1) < Math.abs(n2 - n)) {
			return n1;
		}
		
		return n2;
		
	}

    public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Program to find a number closest to n and divisible by m");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		
		System.out.print("Enter n and m (m != 0): ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		System.out.println("");
		System.out.println("The number closest to " + n + " and divisible by " + m + " is: " + findClosest(n, m));

        scanner.close();
	}
}
