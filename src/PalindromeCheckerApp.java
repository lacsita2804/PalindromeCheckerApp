import java.util.*;

public class PalindromeCheckerApp {

    static boolean checkPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return text.equals(reversed);
    }

    public static void main(String[] args) {

        String input = "level";

        long start = System.nanoTime();
        boolean result = checkPalindrome(input);
        long end = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
        System.out.println("Execution Time : " + (end - start) + " ns");
    }
}