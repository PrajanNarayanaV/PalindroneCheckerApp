import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindroneCheckerApp {
    public static void main(String[] args){
        String input = "civic";
        Queue<Character>queue=new LinkedList<>();
        Stack<Character>stack=new Stack<>();
        for(char c:input.toCharArray()){
            queue.add(c);
            stack.push(c);
        }
        boolean ispalindrome=true;

        while(!queue.isEmpty()){
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if(fromQueue != fromStack){
                ispalindrome=false;
                break;
            }
        }
        System.out.printf("Input:"+input);
        System.out.printf("Is Palindrome?:"+ispalindrome);
    }

}