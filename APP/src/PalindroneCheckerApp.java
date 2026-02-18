/**
 * =====================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * This class demonstrates palindrome validation
 * using a Stack (LIFO principle).
 *
 * Key Concepts:
 * - Stack Data Structure
 * - Push Operation
 * - Pop Operation
 * - Reversal Logic using Stack
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";
        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;


        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}
