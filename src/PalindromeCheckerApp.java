// UC12 — Strategy Pattern

import java.util.*;

interface PalindromeStrategy {
    boolean check(String text);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String text) {
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
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String text) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Strategy selection (runtime change possible)
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + strategy.check(input));
    }
}