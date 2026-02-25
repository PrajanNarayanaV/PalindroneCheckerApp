import java.util.*;

public class PalindroneCheckerApp {
    public static void main(String[] args){
        String input = "refer";
        Deque<Character> queue=new ArrayDeque<>();

        for(char c:input.toCharArray()){
            queue.addLast(c);
        }
        boolean ispalindrome=true;

        while(queue.size()>1){
            char front = queue.removeFirst();
            char rear = queue.removeLast();

            if( front != rear){
                ispalindrome=false;
                break;
            }
        }
        System.out.printf("Input:"+input);
        System.out.printf("Is Palindrome?:"+ispalindrome);
    }

}