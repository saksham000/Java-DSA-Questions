package Striver.BinaryTrees;

import Striver.BinaryTrees.BasicBTImpl.Node;

public class SymmetricTree {
    
    public static boolean isSym(Node root){
        return root == null || isSymCheck(root.left, root.right);
    }

    public static boolean isSymCheck(Node left,Node right){
        if (left == null || right == null) {
            return left == right;
        }

        if (left.data != right.data) {
            return false;
        }

        return isSymCheck(left.left,right.right) && isSymCheck(left.right, right.left);
    }

    

    public static void main(String[] args) {
        System.out.println(isSym(BasicBTImpl.basicBT()));
    }
}
