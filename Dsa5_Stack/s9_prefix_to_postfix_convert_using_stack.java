package Dsa5_Stack;

import java.util.Stack;

public class s9_prefix_to_postfix_convert_using_stack {
    public static void main(String[] args) {
        //prefix to convert postfix using stack
        String prefix="++ab*cd";
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length()-1; i >=0 ; i--) {
            if (prefix.charAt(i)=='+' ||prefix.charAt(i)=='-' ||prefix.charAt(i)=='*' ||prefix.charAt(i)=='/'){
                String left = String.valueOf(stack.peek());
                stack.pop();
                String right= String.valueOf(stack.peek());
                stack.pop();
                String newstring = "("+left+right+prefix.charAt(i)+")";
                stack.push(newstring);
            }else {
                stack.push(String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }









//        String prefix="+a*bc";
//        String stack[] =new String[prefix.length()];
//        int top=-1;
//
//        for (int i =prefix.length()-1; i >=0 ; i--) {
//            if (prefix.charAt(i)=='+' ||prefix.charAt(i)=='-' ||prefix.charAt(i)=='*' ||prefix.charAt(i)=='/'){
//                String left=peek(stack,top);
//                top=pop(top);
//                String right=peek(stack,top);
//                top=pop(top);
//                String newString="(" +left+right+prefix.charAt(i)+ ")";
//                top=push(stack,top,newString);
//            }else {
//                top=push(stack,top,String.valueOf(prefix.charAt(i)));
//            }
//        }
//        System.out.println(peek(stack,top));
//    }
//    private static String peek(String[] stack, int top) {
//        return stack[top];
//    }
//    private static int pop(int top) {
//        top--;
//        return top;
//    }
//    private static int push(String[] stack, int top,String newstring) {
//        top++;
//        stack[top]=newstring;
//        return top;
//    }
}
