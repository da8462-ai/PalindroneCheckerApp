//Version 3.0
//Author Ajai
//use case 3 :Welcome Page
public class PalindromeCheckerApp{

    public static void main(String[] args) {

        // Original string (Data Structure: String)
        String original = "madam";
        String reversed = "";

        // Loop – Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String concatenation (+)
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}


