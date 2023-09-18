package Dsa8_LinkeList;

public class L6_Create_and_print_circular_linked_list_without_tail_node {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.print();
    }
}

class LinkedList{
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }


    public void print() {
        Node temp = head;
        while(temp != tail) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }


    public void insert(int data){
        Node nn = new Node(data);
        if (head==null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            tail = nn;
            tail.next = head;
        }
    }
}


