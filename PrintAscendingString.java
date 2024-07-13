import java.util.Scanner;

public class PrintAscendingString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String: ");
			String s = new String(sc.next());
			char[] s2 = s.toCharArray();

			for (int i = 0; i < s.length() - 1; i++) {
				for (int j = 0; j < s.length() - 1 - i; j++) {
					if (Character.compare(s2[j], s2[j + 1]) > 0) {
						char temp = s2[j];
						s2[j] = s2[j + 1];
						s2[j + 1] = temp;

					}
				}
			}
			System.out.println("Alphabetically Correct String: ");
			for (char c : s2) {
				System.out.print(c + " ");
			}

		}
	}

}
