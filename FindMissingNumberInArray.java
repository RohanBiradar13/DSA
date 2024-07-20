import java.util.Scanner;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int numbers[] = { 4, 3, 10, 2, 8, 5, 1, 6, 9 };
			int arr2[] = { 2, 3, 4, 5, 6, 7, 8, 10 };
			missingNumber(numbers);
			missingNumber(arr2);
		}
	}

	public static void missingNumber(int[] numbers) {
		int sum_numbers = 0;
		int sum_newArr = 0;
		int newArr[] = new int[numbers.length + 1];
		int min = numbers[0]; // Assume the first element is the largest initially

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i]; // Update max if the current element is larger
			}
		}
		for (int i = 0; i < numbers.length + 1; i++) {
			newArr[i] = min;
			sum_newArr += newArr[i];
			min++;

		}
		for (int i = 0; i < numbers.length; i++) {
			sum_numbers += numbers[i];
		}
		int missingNumber = sum_newArr - sum_numbers;
		System.out.println("Missing number in array is:" + missingNumber);
	}

}
