//package DSA11_Tree;
//
//import java.util.Stack;
//
//public class T9_in_order_Tree_Traversal_without_Recursion {
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        TreeNode r = new TreeNode(1);
//        binaryTree.root=r;
//        r.left=new TreeNode(2);
//        r.right=new TreeNode(3);
//        r.left.left  = new TreeNode(4);
//        r.left.right  = new TreeNode(5);
//        r.right.left = new TreeNode(6);
//        r.right.right = new TreeNode(7);
//        System.out.println("In Order :-");
//        binaryTree.inOrder(r);
//        System.out.println();
//    }
//}
//class BinaryTree{
//    TreeNode root;
//
//
//    public void inOrder(TreeNode root) {
//        if (root == null){
//            return;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        while (root != null || stack.size() > 0){
//            while (root != null){
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            System.out.print(root.data + " ");
//            root = root.right;
//        }
//    }
//}
//class TreeNode{
//    int data;
//    TreeNode left,right;
//    public TreeNode(int data){
//        this.data=data;
//    }
//}
