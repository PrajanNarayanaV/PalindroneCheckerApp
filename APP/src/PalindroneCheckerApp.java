/**
 * =====================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * This class demonstrates palindrome validation
 * using a character array and two-pointer technique.
 *
 * Key Concepts:
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Time Complexity Awareness (O(n))
 *
 * @author Developer
 * @version 4.0
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "radar";
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;


        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }


        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}
