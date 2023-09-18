package Dsa7_Queue;

public class Queue_Function {
    static int[] queue = new int[5];
    static int front=-1;
    static int rear=-1;
    public static void main(String[] args) {
       enqueue(10);
       enqueue(20);
       enqueue(30);
       enqueue(40);
       enqueue(50);
       dequeue();
       dequeue();
       print();
       System.out.println(peek() +" is peeked");
       System.out.println("size is  :"+size());
       isEmpty();

    }

    private static boolean isEmpty() {
        if (rear==-1){
            return true;
        }
        return false;
    }

    private static int size() {
        return rear-front;
    }

    private static int  peek() {
        if (isEmpty()){
            return -1;
        }
        return queue[front];
    }

    private static void print() {
        if (isEmpty()){
            System.out.println("Queue is Empty");
        }else {
            for (int i=front+1;i<=0;i++){
                System.out.println(queue[i]);
            }
        }
    }


    private static void dequeue() {
        if (rear==-1 || rear==front){
            System.out.println("Queue is Empty");
            return;
        }
        front++;
        System.out.println(queue[front]+"   is deleted");
    }

    private static void enqueue(int value) {
        if (rear == queue.length-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear]=value;
    }
}


