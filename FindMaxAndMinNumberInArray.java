import java.util.Scanner;

public class FindMaxAndMinNumberInArray {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the length of the array");
			int numbers[] = new int[sc.nextInt()];
			
			for(int i=0; i<numbers.length; i++) {
				numbers[i] = sc.nextInt();
			}
			findMinAndMax(numbers);
		}

	}
 public static void findMinAndMax(int[] numbers) {
	 int max = numbers[0];
		int min = numbers[0];
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] > max) {
				max=numbers[i];
			}if(numbers[i] < min) {
				min=numbers[i];
				//System.out.println(min);
			}
		}

		System.out.println("Minimum number of an array is "+min );
		System.out.println("Maximum number of an array is "+max);
 }
}
