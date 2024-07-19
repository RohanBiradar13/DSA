import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the name:");
            String name = sc.next();
            if (isPalindrome(name)) {
                System.out.println("String is a Palindrome String");
            } else {
                System.out.println("String is not a Palindrome String");
            }
        }
    }

    public static boolean isPalindrome(String name) {
        char[] originalName = name.toCharArray();
        char[] names = name.toCharArray();
        int length = names.length - 1;

        for (int i = 0; i < names.length / 2; i++) {
            char temp = names[length];
            names[length] = names[i];
            names[i] = temp;
            length--;
        }

        for (int i = 0; i < originalName.length; i++) {
            if (originalName[i] != names[i]) {
                return false;
            }
        }
        return true;
    }
}
