//package DSA11_Tree;
//
//public class T4_Find_an_element_from_Binary_tree {
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        TreeNode r = new TreeNode(1);
//        binaryTree.root=r;
//        r.left=new TreeNode(2);
//        r.right=new TreeNode(3);
//        r.left.left = new TreeNode(4);
//        r.left.right = new TreeNode(5);
//        r.right.left = new TreeNode(6);
//        r.right.right = new TreeNode(7);
//        System.out.println(binaryTree.find(r,3));
//    }
//}
//class BinaryTree{
//    TreeNode root;
//
//    public boolean find(TreeNode root,int value){
//        if (root==null){
//            return false;
//        }
//        if (root.data==value){
//            return true;
//        }
//        return find(root.left,value) || find(root.right,value);
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