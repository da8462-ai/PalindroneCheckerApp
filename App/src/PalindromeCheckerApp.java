//Version 7.0
//Author Ajai
//use case 7 :Deque
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checkPalindrome(input);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String str) {

        // Clean the string (remove spaces and convert to lowercase)
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char ch : cleanedStr.toCharArray()) {
            deque.addLast(ch);   // Insert at rear
        }

        // Compare front and rear characters
        while (deque.size() > 1) {

            char front = deque.removeFirst();   // Remove from front
            char rear = deque.removeLast();     // Remove from rear

            if (front != rear) {
                return false;
            }
        }

        return true;
    }
}