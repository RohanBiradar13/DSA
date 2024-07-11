import java.util.Scanner;

public class PrintAscending {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the size of the array: ");
			int[] arr = new int[sc.nextInt()];
			System.out.println("Enter the elements of the array: ");
			for(int i=0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			printAscending(arr);
			System.out.println("The elements are printed Ascendically.. ");
			for(int a : arr) {
				System.out.print(a+" ");
			}
		}
	}
	public static void printAscending(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		}
	}

}
