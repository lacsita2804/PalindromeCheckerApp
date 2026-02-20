import java.util.Scanner;

public class usecase3PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        boolean result = input.equals(reversed);

        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + result);

        sc.close();
    }
}