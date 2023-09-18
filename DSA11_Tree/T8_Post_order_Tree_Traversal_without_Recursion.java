//package DSA11_Tree;
//
//import java.util.Stack;
//
//public class T8_Post_order_Tree_Traversal_without_Recursion {
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
//        System.out.println("Post Order :-");
//        binaryTree.postOrder(r);
//        System.out.println();
//    }
//}
//class BinaryTree{
//    TreeNode root;
//
//    public void postOrder(TreeNode root) {
//        if (root==null){
//            return;
//        }
//        Stack<TreeNode> stack = new Stack<>();
//        Stack<Integer> stack1 = new Stack<>();
//        stack.push(root);
//        while (!stack.isEmpty()){
//            TreeNode node  =stack.pop();
//            stack1.push(node.data);
//            if (node.left!=null){
//                stack.push(node.left);
//            }
//            if (node.right!=null){
//                stack.push(node.right);
//            }
//        }
//        while (!stack1.isEmpty()){
//            System.out.print(stack1.pop()+" ");
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
