//package DSA11_Tree;
//
//import java.util.Stack;
//
//public class T7_pre_order_Tree_Traversal_without_Recursion {
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
//        System.out.println("Pre Order :-");
//        binaryTree.preOrder();
//        System.out.println();
//    }
//}
//class BinaryTree{
//    TreeNode root;
//
//    public void preOrder() {
//        if (root==null){
//            return;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode node = stack.peek();
//            System.out.print(node.data+" ");
//            stack.pop();
//            if (node.right!=null){
//                stack.push(node.right);
//            }
//            if (node.left!=null){
//                stack.push(node.left);
//            }
//        }
//    }
//}
//
//class TreeNode{
//    int data;
//    TreeNode left,right;
//    public TreeNode(int data){
//        this.data=data;
//    }
//}