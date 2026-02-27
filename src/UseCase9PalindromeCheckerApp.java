public class UseCase9PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If mismatch
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String text = "refer";

        boolean result = isPalindrome(text, 0, text.length() - 1);

        System.out.println("Input : " + text);
        System.out.println("Is palindrome : " + result);
    }
}