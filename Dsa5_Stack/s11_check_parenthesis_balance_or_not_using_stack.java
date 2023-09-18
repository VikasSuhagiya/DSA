package Dsa5_Stack;

import java.util.Stack;

public class s11_check_parenthesis_balance_or_not_using_stack {
    public static void main(String[] args) {
       String s = "{[(())]}";
       Stack<Character> stack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='{' ||s.charAt(i)=='[' ||s.charAt(i)=='(' ){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()){
                    System.out.println("Not balance");
                    return;
                }
                char c = stack.pop();
                if (c=='{' && s.charAt(i)!='}' ||c=='(' && s.charAt(i)!=')' ||c=='[' && s.charAt(i)!=']' ){
                    System.out.println("Not balance");
                    return;
                }
            }
        }
        if (stack.empty()){
            System.out.println("Balance");
        }else {
            System.out.println("Not balance");
        }
    }
}
