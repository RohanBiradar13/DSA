import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int num = sc.nextInt();
			reverseNum(num);

		}
	}

	public static void reverseNum(int number) {
		int reverse = 0;

		for (; number > 0; number /= 10) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
		}
		System.out.println("Reverse Number : " + reverse);

	}

}
