package Dsa5_Stack;

import java.util.Stack;

public class s8_postfix_to_infix_convert_using_stack {
    public static void main(String[] args) {
        //2.Postfix to infix convert using stack
        String postfix = "ab+cd*+";
        Stack<String> stack = new Stack<>();

        for (int i = 0; i <postfix.length() ; i++) {
            if (postfix.charAt(i)=='+' ||postfix.charAt(i)=='-' ||postfix.charAt(i)=='*' ||postfix.charAt(i)=='/'){
                String right = String.valueOf(stack.peek());
                stack.pop();
                String left = String.valueOf(stack.peek());
                stack.pop();
                String newstring = "("+left+postfix.charAt(i)+right+")";
                stack.push(newstring);
            }else {
                stack.push(String.valueOf(postfix.charAt(i)));
            }
        }
        System.out.print(stack.peek());
    }


//        String postfix="xyz*-";
//        String stack[] =new String[postfix.length()];
//        int top=-1;
//
//
//        for (int i =0; i <postfix.length() ; i++) {
//            if (postfix.charAt(i)=='+' ||postfix.charAt(i)=='-' ||postfix.charAt(i)=='*' ||postfix.charAt(i)=='/'){
//                String right=peek(stack,top);
//                top=pop(top);
//                String left=peek(stack,top);
//                top=pop(top);
//                String newString="(" +left+postfix.charAt(i)+right+ ")";
//                top=push(stack,top,newString);
//            }else {
//                top=push(stack,top,String.valueOf(postfix.charAt(i)));
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
