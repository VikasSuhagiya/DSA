package Dsa10_LRU_Least_Recently_Used;

import java.util.HashMap;

public class leastRecentlyUsed {
    public static void main(String[] args) {
        LRU lru = new LRU(5);
        lru.add(1);
        lru.add(2);
        lru.add(3);
        lru.add(2);
        lru.add(2);
        lru.add(4);
        lru.add(5);
        lru.add(6);
        lru.add(5);
        lru.print();
    }
}
class LRU{
    HashMap<Integer,Node> hashMap = new HashMap<>();
    Doublyll doublyll = new Doublyll();
    int capacity;

    public void add(int data) {
        if (hashMap.containsKey(data)){     //value hit thai to true thai
            if (doublyll.istail(data)){     //2 value baju ma bajuma hit thai to te return kari de ex:1 2 3 2 2 4   //last ma 2,2 pase hit thai to te agal thi remove thai k no thai ki fer pade nai.
                return;
            }
            Node address = hashMap.get(data);   // value hit thai to agal ni same value delete kare
            doublyll.remove(address);
            hashMap.remove(data);
        }
        if (hashMap.size()==capacity){               //hashmap ni size and capacity equal thai to first element delete kari devano
            int d = doublyll.removeFirst();
            hashMap.remove(d);
        }
        Node nn = doublyll.insertLast(data);
        hashMap.put(data,nn);
    }

    public void print(){
        doublyll.print();
    }
    public LRU(int capacity){
        this.capacity = capacity;
    }
}

class Doublyll{
    Node head;
    Node tail;



    public void remove(Node address) {
        if (head==address && head==tail){
            head=tail=null;
        } else if (address==head) {
            head=head.next;
            head.prev=null;
        }else {
            address.prev.next=address.next;
            address.next.prev=address.prev;
        }
    }



    public Node insertLast(int data) {
        Node nn = new Node(data);
        if (head==null){
            head=tail=nn;
        }else {
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
        return nn;
    }

    public boolean istail(int data) {
        if (tail.data==data){
            return true;
        }
        return false;
    }

    public int removeFirst() {
        int data= head.data;
        head=head.next;
        head.prev=null;
        return data;
    }

    public void print() {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class Node{
    int data;
    Node next,prev;
    public Node(int data){
        this.data=data;
    }
}