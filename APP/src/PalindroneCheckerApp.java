/**
 * =====================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * This class demonstrates palindrome validation
 * by reversing the string using a loop.
 *
 * Key Concepts:
 * - For Loop
 * - String Immutability
 * - String Concatenation (+)
 * - equals() method
 *
 * @author Developer
 * @version 3.0
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "RADAR";   // Hardcoded string
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}
