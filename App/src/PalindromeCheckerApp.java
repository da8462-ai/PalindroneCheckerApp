//Version 13.0
//Author Ajai
//use case 13 :System.nanoTime() and Algorithm comparison
import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Stack Strategy Timing
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(cleaned);
        long endStack = System.nanoTime();

        // Deque Strategy Timing
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(cleaned);
        long endDeque = System.nanoTime();

        // Recursive Strategy Timing
        long startRec = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(cleaned, 0, cleaned.length() - 1);
        long endRec = System.nanoTime();

        System.out.println("\n===== RESULTS =====");
        System.out.println("Stack Result: " + stackResult +
                " | Time: " + (endStack - startStack) + " ns");

        System.out.println("Deque Result: " + dequeResult +
                " | Time: " + (endDeque - startDeque) + " ns");

        System.out.println("Recursive Result: " + recursiveResult +
                " | Time: " + (endRec - startRec) + " ns");

        scanner.close();
    }

    // Stack Approach
    public static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Deque Approach
    public static boolean dequePalindrome(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    // Recursive Approach
    public static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursivePalindrome(str, start + 1, end - 1);
    }
}