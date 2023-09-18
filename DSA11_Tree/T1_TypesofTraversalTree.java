//package DSA11_Tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class T1_TypesofTraversalTree {
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        TreeNode r = new TreeNode(1);
//        binaryTree.root=r;
//        r.left=new TreeNode(2);
//        r.right=new TreeNode(3);
//        r.left.left=new TreeNode(4);
//        r.left.right=new TreeNode(5);
//        r.right.left=new TreeNode(6);
//        r.right.right=new TreeNode(7);
//        System.out.print("Level order :-");
//        binaryTree.levelorderTraversal();                       //simple print
//        System.out.println();
//        System.out.print("Pre order   :-");
//        binaryTree.preorder();
//        System.out.println();
//        System.out.print("Post order  :-");
//        binaryTree.postorder();
//        System.out.println();
//        System.out.print("In order    :-");
//        binaryTree.printusingRecursionIn(r);
//    }
//}
//class BinaryTree{
//    TreeNode root;
//
//    //1.Level order
//    public void levelorderTraversal() {
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()){
//            TreeNode node = queue.poll();                    //poll means pop
//            System.out.print(node.data+" ");
//            if (node.left!=null){
//                queue.add(node.left);
//            }
//            if (node.right!=null){
//                queue.add(node.right);
//            }
//        }
//    }
//
//    //2.Pre-order          Root - left - right
//    public void preorder() {
//        printusingRecursionPre(root);
//    }
//
//    private void printusingRecursionPre(TreeNode root) {
//        if (root==null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        printusingRecursionPre(root.left);
//        printusingRecursionPre(root.right);
//    }
//
//    //3.Post order        left - right - Root
//    public void postorder() {
//        printusingRecursionPost(root);
//    }
//
//    private void printusingRecursionPost(TreeNode root) {
//        if (root==null){
//            return;
//        }
//        printusingRecursionPost(root.left);
//        printusingRecursionPost(root.right);
//        System.out.print(root.data+" ");
//    }
//
//    //4.In order        left - Root - right
//    public void printusingRecursionIn(TreeNode root) {
//        if (root==null){
//            return;
//        }
//        printusingRecursionIn(root.left);
//        System.out.print(root.data+" ");
//        printusingRecursionIn(root.right);
//    }
//}
//class TreeNode{
//    int data;
//    TreeNode left,right;
//
//    public TreeNode(int data){
//        this.data=data;
//    }
//}