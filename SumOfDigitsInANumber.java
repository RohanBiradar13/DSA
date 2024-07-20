import java.util.Scanner;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number :");
			int number = sc.nextInt();
			System.out.println("Sum of " + number + " number is " + sumOfNumber(number));
		}
	}

	public static int sumOfNumber(int number) {
		int sum = 0;
		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		return sum;
	}
}
