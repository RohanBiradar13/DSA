import java.util.Scanner;

public class CountNumberOfEven_Odd_Digits {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int number = sc.nextInt();
			countEvenOdd(number);
		}
	}

	public static void countEvenOdd(int number) {
		int count_even = 0;
		int count_odd = 0;
		for (; number > 0; number /= 10) {
			int temp = number % 10;
			if (temp % 2 == 0) {
				count_even++;
			}
			if (temp % 2 != 0) {
				count_odd++;
			}
		}
		System.out.println("Count of Even numbers is:" + count_even);
		System.out.println("Count of Odd numbers is:" + count_odd);
	}

}
