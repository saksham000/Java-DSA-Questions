package Striver.BinaryTrees;
import Striver.BinaryTrees.BasicBTImpl.Node;
public class MaximumDepthOfBinaryTree {
    
    public static int findHeight(Node root){

        if (root == null) {
            return 0;
        }

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        return 1 + Math.max(lh, rh);
    }


    public static void main(String[] args) {
        System.out.println(findHeight(Striver.BinaryTrees.BasicBTImpl.basicBT()));
    }
}
