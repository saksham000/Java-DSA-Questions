package Striver.BinaryTrees;

import Striver.BinaryTrees.BasicBTImpl.Node;

public class DiameterOfBinaryTree {

    public static int findDia(Node root, int[] max) {
        if (root == null) {
            return 0;
        }

        int lh = findDia(root.left, max);
        int rh = findDia(root.right, max);

        max[0] = Math.max(max[0], lh + rh);

        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        int[] max = new int[1];
        findDia(Striver.BinaryTrees.BasicBTImpl.basicBT(), max);
        System.out.println(max[0]);
    }
}
