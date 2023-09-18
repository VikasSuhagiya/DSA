package Dsa7_Queue;
import java.util.LinkedList;
import java.util.Queue;
public class Q1_ImplementStackusingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        print();
    }

    private static void print(){
        while (!q1.isEmpty()){
            System.out.println(q1.remove()+" ");
        }
    }
    private static void push(int value){
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(value);
        while (!q2.isEmpty()){
            q1.add(q2.remove());
        }
    }
}