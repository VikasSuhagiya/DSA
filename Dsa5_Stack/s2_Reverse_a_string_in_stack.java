package Dsa5_Stack;
import java.util.Stack;
public class s2_Reverse_a_string_in_stack {
    public static void main(String[] args) {
        String s = "Hello World";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' '){
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }else {
                stack.push(s.charAt(i));
            }
        }
        while (!stack.isEmpty()){             //aa while loop atla mate k world ni pachal space no ave to te print no thai
            System.out.print(stack.pop());
        }
    }

//        String s = "Hello World";
//        char stack[] = new char[s.length()];
//        int top = -1;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ') {               //s.charat(i)==' ' ave to stack mathi savik ak pahi ak pop/delete thai
//                while (!isEmpty(top)) {
//                    top = pop(stack, top);
//                }
//                System.out.print(" ");
//            } else {
//                top = push(stack, top, s.charAt(i));       //s.charat(i)==' ' no thai to stak ma push/add karta jai
//            }
//        }
//        while (!isEmpty(top)) {
//            top = pop(stack, top);      //aa while loop atla mate che k AYIGAHUS aa word pachi space no ave to te print no thai
//        }
//    }
//
//    private static int pop(char[] stack, int top) {
//        System.out.print(stack[top]);
//        top--;
//        return top;
//    }
//
//    private static boolean isEmpty(int top) {
//        if (top == -1) {
//            return true;
//        }
//        return false;
//    }
//
//    private static int push(char[] stack, int top, char c) {
//        top++;
//        stack[top] = c;
//        return top;
//    }
}