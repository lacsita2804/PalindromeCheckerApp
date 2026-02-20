import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to queue and stack
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            queue.add(ch);     // FIFO
            stack.push(ch);    // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input text: " + text);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}