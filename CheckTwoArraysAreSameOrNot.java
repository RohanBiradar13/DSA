import java.util.Scanner;

public class CheckTwoArraysAreSameOrNot {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the length of the 1st array ");
			int arr1[] = new int[sc.nextInt()];
			System.out.println("Enter the length of the 2nd array ");
			int arr2[] = new int[sc.nextInt()];
			System.out.println("Enter the elements of the 1st array");
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			System.out.println("Enter the elements of the 2nd array");
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}
			isSame(arr1, arr2);
			/*
			 * This is using Arrays class equals method if(Arrays.equals(arr1, arr2)) {
			 * System.out.println("Arrays are same"); }else {
			 * System.out.println("Arryas are different"); }
			 */
			/*
			 * This below code is incorrect bcoz if i give same elements even after the o/p
			 * is different. This is checking by array class equals method which will check
			 * their reference(i.e always different) if(arr1.equals(arr2)) {
			 * System.out.println("same"); }else { System.out.println("Different"); }
			 */

		}

	}

	public static void isSame(int[] arr1, int[] arr2) {
		boolean issame = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					issame = false;
				}
			}
		} else {
			System.out.println("Arrays are different");
		}
		if (issame) {
			System.out.println("Arrays are same");
		} else
			System.out.println("Arrays are different");
	}
}
