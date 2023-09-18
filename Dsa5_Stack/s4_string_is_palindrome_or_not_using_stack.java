package Dsa5_Stack;

import java.util.Stack;

public class s4_string_is_palindrome_or_not_using_stack {
    public static void main(String[] args) {
        String str = "nitin";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i));
        }
        String ans="";
        while (!stack.isEmpty()) {
            ans=ans+stack.pop();
        }
        if (str.equals(ans)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }





//        char[] stack=new char[str.length()];
//        int top=-1;
//
//        for (int i = 0; i <stack.length ; i++) {
//            top=push(stack,top,str.charAt(i));           //stact mathi ak pachi ak character pop karta gya
//        }
//        String ans="";                                   //empty string
//        for (int i = 0; i <stack.length ; i++) {
//            top=pop(stack,top);                          //stack mathi ak pachi ak character ans ma nakhta javana.
//            ans+=stack[top+1];                     //top+1 means top 1 ocho thato jai
//        }
//        if (str.equals(ans)){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("Not palindrome");
//        }
//    }
//    private static int pop(char[] stack,int top){
//        if (top==-1){
//            System.out.println("stack is empty");
//            return top;
//        }
//        top--;
//        return top;
//    }
//    private static int push(char[] stack,int top,char value){
//        if (top==stack.length-1){
//            System.out.println("stack is overflow!!");
//            return top;
//        }
//        top++;
//        stack[top]=value;
//        return top;
//    }
}