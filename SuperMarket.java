

import java.util.Scanner;

public class SuperMarket {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number of products : ");
		int[] products = new int[sc.nextInt()];
		
		for(int i=0; i<products.length; i++) {
			int j = i+1;
			System.out.println("Enter the "+j+" value of the item");
			products[i] = sc.nextInt();
		}
		for(int i=0; i<products.length; i++) {
			int price = 1;
			int j = i+1;
		int num	= products[i]; 
		while(num > 0) {
			int temp = num % 10;
			price = price * temp;
			num/=10;
			
			
		}
		System.out.println("Product "+j+"st price is "+price);
		}
	}
	
}
}