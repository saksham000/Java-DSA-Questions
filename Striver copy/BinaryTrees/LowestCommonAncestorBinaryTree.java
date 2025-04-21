package Striver.BinaryTrees;

import Striver.BinaryTrees.BasicBTImpl.Node;

public class LowestCommonAncestorBinaryTree {

    public static Node findAnc(Node root, Node p, Node q) {

        if (root == null || root == p || root == q) {
            return root;
        }

        Node left = findAnc(root.left, p, q);
        Node right = findAnc(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        Node root = BasicBTImpl.basicBT();
        Node p = root.left.right;
        Node q = root.left.left;
        System.out.println(findAnc(root, p, q).data);
    }
}
