package Dsa7_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Q4_Queue_using_Dequeue {
    static Deque<Integer> deque = new LinkedList<>();
    public static void main(String[] args) {
            deque.add(1);
            deque.add(2);
            deque.add(3);
            System.out.println("peek is = "+deque.peek());
            System.out.println(deque.remove());
            System.out.println(deque.remove());
            System.out.println(deque.remove());
        }
        public static void add(int value){
            deque.addLast(value);
        }
        public static void remove(){
            deque.removeFirst();
        }
        public static void peek(){
            deque.getFirst();
        }

}
