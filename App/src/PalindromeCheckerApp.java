//Version 10.0
//Author Ajai
//use case 10 :String and Array
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checkPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {

        // Step 1: Normalize string
        // Remove spaces and convert to lowercase
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // OPTIONAL (Advanced Improvement):
        // Remove all non-alphanumeric characters
        // String normalized = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Apply Two-Pointer Logic
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}