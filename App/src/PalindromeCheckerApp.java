//Version 11.0
//Author Ajai
//use case 11 :Internal Stack/Array
import java.util.Scanner;
import java.util.Stack;

// Service Class following OOP principles
class PalindromeChecker {

    // Public method exposed to outside (Encapsulation)
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Normalize string (remove spaces & convert to lowercase)
        String cleanedStr = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char ch : cleanedStr.toCharArray()) {
            stack.push(ch);
        }

        // Compare characters using stack (LIFO)
        for (char ch : cleanedStr.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}