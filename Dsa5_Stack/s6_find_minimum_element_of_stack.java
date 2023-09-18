package Dsa5_Stack;

public class s6_find_minimum_element_of_stack {
    static int[] mainstack =new int[5];
    static int maintop=-1;
    static int[] minimumstack =new int[5];
    static int minimumtop=-1;
    public static void main(String[] args) {
        pushinstack(10);
        pushinstack(20);
        pushinstack(11);
        pushinstack(5);
        pushinstack(12);
        System.out.println(getMin());
        popfromStack();
        popfromStack();
    }

    private static void pushinstack(int value){
        pushmain(value);

        if (isEmpty(minimumtop)){
            pushMinimum(value);
        }
        if (peekMinimum()>value){                                              //Max element mate < karvanu
            pushMinimum(value);
        }
    }
    private static void popfromStack(){
        int value=peekMain();
        popMain();
        if (peekMinimum()==value){
            popMinimum();
        }
    }
    private static void popMain() { maintop--;
    }
    private static void popMinimum(){
        minimumtop--;
    }
    private static int getMin(){
        return minimumstack[minimumtop];
    }
    private static int peekMinimum(){
        return  minimumstack[minimumtop];
    }
    private static int peekMain(){
        return mainstack[maintop];
    }
    private static void pushmain(int value){
        maintop++;
        mainstack[maintop]=value;
    }
    private static void pushMinimum(int value){
        minimumtop++;
        minimumstack[minimumtop]=value;
    }
    private static boolean isEmpty(int minmumtop){
        if (minimumtop==-1){
            return true;
        }
        return false;
    }


}












































//        int[] stack = new int[5];
//        int[] minStack = new int[5];
//        int top = -1;
//
//        top = push(stack, minStack, top, 2);
//        top = push(stack, minStack, top, 3);
//        top = push(stack, minStack, top, 6);
//        top = push(stack, minStack, top, 5);
//        top = push(stack, minStack, top, 1);
//
//        top = pop(stack, minStack, top);
//        System.out.println("Min. element is: "+ getMin(minStack));
//
//        top = push(stack, minStack, top, 3);
//        System.out.println("Min. element is: "+ getMin(minStack));
//    }
//    public static int getMin(int[] minStack){
//        return minStack[minTop];
//    }
//    public static int push(int[] stack, int[] minStack, int top, int value){
//        if(top == stack.length-1){
//            System.out.println("Stack is overflow!");
//            return top;
//        }
//        top++;
//        stack[top] = value;
//
//        if(top == 0){
//            minTop++;
//            minStack[minTop] = value;
//        }
//        if(value < minStack[minTop]){
//            minTop++;
//            minStack[minTop] = value;
//        }
//        return top;
//    }
//    public static int pop(int[] stack, int[] minStack, int top){
//        if(stack[top] == minStack[minTop]){
//            minTop--;
//        }
//        top--;
//        return top;
//    }
//}

