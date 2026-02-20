

public class usecase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Pop characters to form reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        boolean result = text.equals(reversed);

        System.out.println("Input text: " + text);
        System.out.println("Is Palindrome : " + result);
    }
}