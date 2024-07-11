import java.util.Scanner;

public class CheckAscending {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array");
			int arr[] = new int[sc.nextInt()];
			boolean isCheckAscending = true;
			System.out.println("Enter the elements in the array");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			checkAscending(arr, isCheckAscending);
		}
	}
			public static void checkAscending(int arr[], boolean isCheckAscending ) {
		
			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] > arr[i + 1]) {
					isCheckAscending = false;
					break;
				}

			}
			if (isCheckAscending) {
				System.out.println("The elements in the arrays are Ascending");
			} else {
				System.out.println("The elements in the arrays are not Ascending");
			}

		}

	}


