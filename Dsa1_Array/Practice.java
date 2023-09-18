package Dsa1_Array;

public class Practice {
    public static void main(String[] args) {
        String prefix="a+b+c*d";
        String stack[] =new String[prefix.length()];
        int top=-1;

//        for (int i = prefix.length()-1; i >=0 ; i--) {
        for (int i =0; i <prefix.length() ; i++) {
            if (prefix.charAt(i)=='+' ||prefix.charAt(i)=='-' ||prefix.charAt(i)=='*' ||prefix.charAt(i)=='/'){
                String right=peek(stack,top);
                top=pop(top);
                String left=peek(stack,top);
                top=pop(top);
                String newString="(" +prefix.charAt(i)+left+right+ ")";
                top=push(stack,top,newString);
            }else {
                top=push(stack,top,String.valueOf(prefix.charAt(i)));
            }
        }
        System.out.println(peek(stack,top));
    }
    private static String peek(String[] stack, int top) {
        return stack[top];
    }
    private static int pop(int top) {
        top--;
        return top;
    }
    private static int push(String[] stack, int top,String newstring) {
        top++;
        stack[top]=newstring;
        return top;
    }











//
//    String infix="a+b+c*d";
//    String prefix="a+b+c*d";
//    String postfix="ab+cd*+";
//    Stack<String> stack = new Stack<>();
//
//        for (int i = prefix.length()-1; i >=0 ; i--) {
//            if (prefix.charAt(i)=='+' ||prefix.charAt(i)=='-' ||prefix.charAt(i)=='*' ||prefix.charAt(i)=='/'){
//                String right=stack.peek();
//                stack.pop();
//                String left=stack.peek();
//                stack.pop();
//                String newstring = "("+prefix.charAt(i)+left+right+")";
//                stack.push(newstring);
//            }else {
//                stack.push(String.valueOf(prefix.charAt(i)));
//            }
//        }
//        System.out.println(stack.peek());
//
//    }
}