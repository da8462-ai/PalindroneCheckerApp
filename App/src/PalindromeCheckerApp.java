//Version 2.0
//Author Ajai
//use case 2 :Welcome Page
public class PalindromeCheckerApp{

    public static void main(String[] args) {
        String word = "madam";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}

