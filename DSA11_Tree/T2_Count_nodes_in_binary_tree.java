//package DSA11_Tree;
//
//public class T2_Count_nodes_in_binary_tree {
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        TreeNode r = new TreeNode(1);
//        binaryTree.root=r;
//        r.left = new TreeNode(2);
//        r.right = new TreeNode(3);
//        r.left.left=new TreeNode(4);
//        r.left.right=new TreeNode(5);
//        r.right.left = new TreeNode(6);
//        r.right.right = new TreeNode(7);
//        System.out.print("Count is :-");
//        System.out.println(binaryTree.count(r));
//    }
//}
//class BinaryTree{
//    TreeNode root;
//
//    public int count(TreeNode root) {
//    if (root==null){
//        return 0;
//    }
//    return 1+count(root.left)+count(root.right);
//    }
//
////    public int count(TreeNode root){
////        if (root==null){
////            return 0;
////        }
////        return 1+count(root.left) + count(root.right);
////    }
//
//}
//class TreeNode{
//    int data;
//    TreeNode left,right;
//    public TreeNode(int data){
//        this.data=data;
//    }
//}