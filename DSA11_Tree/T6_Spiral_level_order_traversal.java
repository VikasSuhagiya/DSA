//package DSA11_Tree;
//
//import java.util.Deque;
//import java.util.LinkedList;
//
//public class T6_Spiral_level_order_traversal {
//    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        TreeNode r = new TreeNode(10);
//        binaryTree.root = r;
//        r.left = new TreeNode(20);
//        r.right = new TreeNode(30);
//        r.left.left = new TreeNode(40);
//        r.left.right = new TreeNode(50);
//        r.right.left = new TreeNode(60);
//        r.right.right = new TreeNode(70);
//        System.out.println("Spiral Level Nodes :- ");
//        binaryTree.SpiralLevel();
//
//    }
//}
//class BinaryTree {
//    TreeNode root;
//
//
//    public void SpiralLevel() {
//          Deque<TreeNode> deque = new LinkedList<>();
//       boolean isRev = false;
//       deque.add(root);
//
//       while (!deque.isEmpty()){
//           if (isRev){
//               int size = deque.size();
//               while (size>0){
//                   TreeNode node = deque.removeLast();
//                   System.out.print(node.data+" ");
//                   if (node.right!=null){
//                       deque.addFirst(node.right);
//                   }
//                   if (node.left!=null){
//                       deque.addFirst(node.left);
//                   }
//                   size--;
//               }
//               System.out.println();
//               isRev=!isRev;
//           }else {
//               int size = deque.size();
//               while (size>0){
//                   TreeNode node = deque.removeFirst();
//                   System.out.print(node.data+" ");
//                   if (node.left!=null){
//                       deque.addLast(node.left);
//                   }
//                   if (node.right!=null){
//                       deque.addLast(node.right);
//                   }
//                   size--;
//               }
//               System.out.println();
//               isRev=!isRev;
//           }
//       }
//
//    }
//}
//class TreeNode{
//    int data;
//    TreeNode left,right;
//    public TreeNode(int i){
//        this.data = i;
//    }
//}
