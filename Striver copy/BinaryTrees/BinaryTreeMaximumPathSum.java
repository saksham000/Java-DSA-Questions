package Striver.BinaryTrees;

import Striver.BinaryTrees.BasicBTImpl.Node;

public class BinaryTreeMaximumPathSum {

    public static int findMax(Node root, int[] max) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, findMax(root.left, max));
        int right = Math.max(0, findMax(root.right, max));
        max[0] = Math.max(max[0], left + right + root.data);

        return Math.max(left, right) + root.data;
    }

    public static void main(String[] args) {
        int[] num = new int[1];
        findMax(BasicBTImpl.basicBT(), num);
        System.out.println(num[0]);
    }
}
