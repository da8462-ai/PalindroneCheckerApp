//Version 4.0
//Author Ajai
//use case 4 :Welcome Page
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "madam";

        // Convert String to Character Array (char[])
        char[] characters = original.toCharArray();

        // Two-Pointer Technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            // Compare start & end characters using array indexing
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}



