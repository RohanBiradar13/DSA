import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number");
			int num = sc.nextInt();
			int orginalNumber = num;
			int length = findLength(orginalNumber);
			int sum = 0;
			while (orginalNumber != 0) {
				int digit = orginalNumber % 10;
				int intPower = power(length, digit);
				sum += intPower;
				orginalNumber /= 10;
			}
			if (num == sum) {
				System.out.println("The " + num + " is a Armstrong Number");
				return;
			}
			System.out.println("The " + num + " is not a Armstrong Number");
		}
	}

	public static int findLength(int number) {
		int length = 0;
		for (; number > 0; number /= 10) {
			length++;
		}
		return length;
	}

	public static int power(int length, int digit) {
		int result = 1;
		for (int i = 0; i < length; i++) {
			result *= digit;
		}
		return result;
	}

}
