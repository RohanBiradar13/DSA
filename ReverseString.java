import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String : ");
			String s1 = new String(sc.next());
			char[] original = s1.toCharArray();
			reverseString(s1, original);
			for (int i = 0; i < s1.length(); i++) {
				System.out.print(original[i]);
			}
		}
	}

	public static void reverseString(String s1, char[] original) {
		int le = s1.length() - 1;
		System.out.println("The Reverse String:");
		for (int i = 0; i < s1.length() - 1; i++) {
			char temp = s1.charAt(i);
			original[i] = s1.charAt(le);
			original[le] = temp;
			le--;
		}
	}
}
