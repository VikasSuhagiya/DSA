package Dsa5_Stack;

public class s3_reverse_a_number_in_stack {
    public static void main(String[] args) {
        int n=125;
        int[] stack = new int[3];
        int top=-1;
        int rev=0;

        while (n!=0){
            int d=n%10;
            top=push(stack,top,d);
            n=n/10;
        }
        int pv=1;            //plash value
        while(!isempty(top)){
            top=pop(stack,top);
            int digit=stack[top+1];
            rev=rev+digit*pv;
            pv*=10;
        }
        System.out.println(rev);
     }
    private static int pop(int[] stack, int top) {
        if (top==-1){
            System.out.println("Stack is Empty");
            return top;
        }
        top--;
        return top;
    }
    private static boolean isempty(int top) {
        if (top==-1){
            return true;
        }
        return false;
    }

    private static int push(int[] stack,int top,int value){
        if (top== stack.length-1){
            System.out.println("Stack is overflow!!");
            return top;
        }
        top++;
        stack[top]=value;
        return top;
    }
}
