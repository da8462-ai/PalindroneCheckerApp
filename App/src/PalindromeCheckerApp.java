//Version 8.0
//Author Ajai
//use case 8 :Singly Linked List
import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

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

        // Clean string (remove spaces & lowercase)
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        if (cleanedStr.length() == 0)
            return true;

        // Step 1: Convert string to linked list
        Node head = new Node(cleanedStr.charAt(0));
        Node current = head;

        for (int i = 1; i < cleanedStr.length(); i++) {
            current.next = new Node(cleanedStr.charAt(i));
            current = current.next;
        }

        // Step 2: Find middle using fast & slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse second half
        Node secondHalf = reverseList(slow);

        // Step 4: Compare first and second half
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Method to reverse linked list
    public static Node reverseList(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}