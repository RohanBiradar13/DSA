import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[] = new int[sc.nextInt()];
		System.out.print("Enter the data of the array : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Array Data: ");
		for(int a : arr) {
			System.out.print(a+" " );
		
		}
		//now we want to reverse the given array 
		//write a logic for that
		int le= arr.length-1;
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[le];
			arr[le] = temp;
			le--;
		}
		System.out.print("Array Data after sorting: ");
		for(int a : arr) {
			System.out.print(a+" " );
		
		}

	}

}
