//Version 9.0
//Author Ajai
//use case 9 :call stack
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Clean string (remove spaces & convert to lowercase)
        String cleanedStr = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(cleanedStr, 0, cleanedStr.length() - 1);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }

    // Recursive Method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call
        return isPalindrome(str, start + 1, end - 1);
    }
}