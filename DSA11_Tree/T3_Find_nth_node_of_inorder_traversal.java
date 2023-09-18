//package DSA11_Tree;
//
//public class T3_Find_nth_node_of_inorder_traversal {
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        TreeNode r = new TreeNode(1);
//        binaryTree.root=r;
//        r.left= new TreeNode(2);
//        r.right= new TreeNode(3);
//        r.left.left=new TreeNode(4);
//        r.left.right=new TreeNode(5);
//        r.right.left=new TreeNode(6);
//        r.right.right=new TreeNode(7);
//        System.out.print("In order :-");
//        binaryTree.printInorder(r);
//        System.out.println();
//        System.out.print("Nth node is :- ");
//        binaryTree.nthNode(r,3);
//    }
//}
//class BinaryTree{
//    TreeNode root;
//    int count=0;
//    public void nthNode(TreeNode root,int value) {
//        if (root==null){
//            return;
//        }
//        nthNode(root.left,value);
//        count++;
//        if (count==value){
//            System.out.println(root.data);
//            return;
//        }
//        nthNode(root.right,value);
//    }
//
//    public void printInorder(TreeNode root) {
//        if (root==null){
//            return;
//        }
//        printInorder(root.left);
//        System.out.print(root.data+" ");
//        printInorder(root.right);
//    }
//}
//class TreeNode {
//    int data;
//    TreeNode left;
//    TreeNode right;
//    public TreeNode(int data){
//        this.data=data;
//    }
//}
