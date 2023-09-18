package Dsa5_Stack;
import java.util.Stack;

public class s1_Reverse_a_word_in_stack {
    public static void main(String[] args) {
        String s ="Hello";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }





//        String s="Hello";
//        char stack[] = new char[s.length()];
//        int top=-1;
//
//        for (int i=0;i<s.length();i++){
//            top=push(stack,top,s.charAt(i));
//        }
//        print(stack,top);
//    }
//    private static void print(char[] stack, int top) {
//        while (top>=0) {
//            System.out.print(stack[top]);
//            top--;
//        }
//    }
//    private static int push(char[] stack, int top, char c) {
//        top++;
//        stack[top]=c;
//        return top;
//    }
}
