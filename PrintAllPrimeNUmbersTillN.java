import java.util.Scanner;

public class PrintAllPrimeNUmbersTillN {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number : ");
			int n = sc.nextInt();
			printAllPrimeTillN(n);
		}
	}
	public static void printAllPrimeTillN(int n) {
		for(int i=2; i<=n ;i++) {
			int count = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					count++;
				}
			}if(count <= 2) {
				System.out.println(i);
			}
		}
	}

}
