//package DSA11_Tree;
//
//public class T5_Find_the_Maximum_Depth_and_Height_of_given_Binary_Tree {
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
//        r.left.left.left = new TreeNode(8);
//        r.left.left.left.left = new TreeNode(9);
//        System.out.println("Height is :- "+binaryTree.heigth(r));
//    }
//}
//class BinaryTree{
//    TreeNode root;
//    public int heigth(TreeNode root){
//        if (root == null){
//            return 0;
//        }
//        int leftHeight = heigth(root.left);
//        int rightHeight = heigth(root.right);
//        return 1+Math.max(leftHeight,rightHeight);
//    }
//}
//class TreeNode{
//    int data;
//    TreeNode left,right;
//    public TreeNode(int data){
//        this.data=data;
//    }
//}
