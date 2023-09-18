package Dsa7_Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class Q3_stack_using_deque {
    static Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args) {
        //stack and queue using deque //stack
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("Peek is = "+deque.peek());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }

    private static void push(int value) {
        deque.addLast(value);
    }
    private static void pop(){
        deque.removeLast();
    }
    private static void peek(){
        deque.getLast();
    }
}
