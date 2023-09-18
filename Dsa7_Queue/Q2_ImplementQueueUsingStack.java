package Dsa7_Queue;

import java.util.Stack;

public class Q2_ImplementQueueUsingStack {
  static Stack<Integer> s1 = new Stack<>();
  static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        print();

    }
    private static void push(int value){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(value);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    private static void print(){
        while (!s1.isEmpty()){
            System.out.println(s1.pop()+ " ");
        }
    }


}