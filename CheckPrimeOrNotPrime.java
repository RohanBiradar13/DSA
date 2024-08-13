import java.util.Scanner;

public class CheckPrimeOrNotPrime {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number : ");
			int number = sc.nextInt();
			int count = checkPrime(number);
			if (count > 2) {
				System.out.println("Not a prime number");
			} else {
				System.out.println("Prime number");
			}

		}
	}

	public static int checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
				if (count > 2)
					return count;
			}
		}
		return count;
	}

}
