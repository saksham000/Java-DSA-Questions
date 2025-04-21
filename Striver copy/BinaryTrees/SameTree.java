package Striver.BinaryTrees;

import Striver.BinaryTrees.BasicBTImpl.Node;

public class SameTree {

    public static boolean isSame(Node root, Node root2) {
        if (root == null || root2 == null) {
            return root == root2;
        }

        return root.data == root2.data && isSame(root.left, root2.left) && isSame(root.right, root2.right);
    }

    public static void main(String[] args) {
        System.out.println(isSame(BasicBTImpl.basicBT(), BasicBTImpl.basicBT()));
    }
}
