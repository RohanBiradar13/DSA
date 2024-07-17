import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int num = sc.nextInt();
			// System.out.println(reverseNum(num));
			if (num == reverseNum(num)) {
				System.out.println("The " + num + " is Palindrome Number ");
			} else
				System.out.println("The " + num + " is not a Palindrome Number ");

		}

	}

	public static int reverseNum(int number) {
		int reverse = 0;

		for (; number > 0; number /= 10) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
		}

		return reverse;

	}

}
