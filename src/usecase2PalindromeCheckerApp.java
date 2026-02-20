public class usecase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "madam";
        String reversed = new StringBuilder(text).reverse().toString();

        boolean result = text.equals(reversed);

        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + result);
    }
}