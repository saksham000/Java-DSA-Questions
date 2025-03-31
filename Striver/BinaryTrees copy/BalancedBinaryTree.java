package Striver.BinaryTrees;

import Striver.BinaryTrees.BasicBTImpl.Node;;

public class BalancedBinaryTree {

    public static int isBalanced(Node root) {
        if (root == null) {
            return 0;
        }

        int l = isBalanced(root.left);
        if (l == -1) {
            return -1;
        }
        int r = isBalanced(root.right);
        if (r == -1) {
            return -1;
        }

        if (Math.abs(l - r) > 1) {
            return -1;
        }
        return Math.max(l, r) + 1;
    }

    public static void main(String[] args) {
        if (isBalanced(BasicBTImpl.basicBT()) != -1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
