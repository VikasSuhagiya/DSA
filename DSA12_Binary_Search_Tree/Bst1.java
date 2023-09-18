package DSA12_Binary_Search_Tree;

import org.w3c.dom.Node;
           //Time complixcity = o(n);
public class Bst1 {
    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.insert(5);
        bst.insert(1);
        bst.insert(3);
        bst.insert(4);
        bst.insert(2);
        bst.insert(6);
        bst.insert(7);
        System.out.println("In order :-");
        bst.inorder(bst.root);
        bst.delete(2);
        System.out.println();
        System.out.println("after Delete element :- ");
        bst.inorder(bst.root);
        System.out.println();
        System.out.println("Search element is :-"+search(bst.root,5));
    }

    private static boolean search(Node1 root, int value) {
        if (root == null){
            return false;
        }
        if (root.data == value){
            return true;
        }
        if (root.data > value){
            return search(root.left, value);
        }
        return search(root.right, value);
    }
}

class Bst{
    Node1 root;

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node1 insert(int value, Node1 root) {
        if (root == null){
            root = new Node1(value);
            return root;
        }else if (value > root.data){
            root.right = insert(value, root.right);
        }else {
            root.left = insert(value, root.left);
        }
        return root;
    }

    public void inorder(Node1 root) {
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private Node1 delete(Node1 root, int value) {
        if (root == null){
            return root;
        }
        if (value > root.data){
            root.right = delete(root.right, value);
        }else if (value < root.data){
            root.left = delete(root.left, value);
        }else {
            if (root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node1 node) {
        int min = node.data;
        while (node.left != null){
            min = node.left.data;
        }
        return min;
    }
}

class Node1{
    int data;
    Node1 left, right;

    public Node1(int value) {
        this.data = value;
    }
}
