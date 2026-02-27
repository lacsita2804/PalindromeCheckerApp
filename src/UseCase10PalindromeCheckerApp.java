public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        // Normalize → remove spaces & convert to lowercase
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        // Reverse using loop
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        boolean result = normalized.equals(reversed);

        System.out.println("Input : " + text);
        System.out.println("Is Palindrome? : " + result);
    }
}
