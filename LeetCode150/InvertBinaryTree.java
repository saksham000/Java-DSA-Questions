package LeetCode150;

import Striver.BinaryTrees.BasicBTImpl;
import Striver.BinaryTrees.BinaryTreeInorderTrav;
import Striver.BinaryTrees.BasicBTImpl.Node;

public class InvertBinaryTree {

    static void invert(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);
    }

    void main() {
        Node root = BasicBTImpl.basicBT();
        invert(root);
        BinaryTreeInorderTrav.inOrderTrav(root);
    }

}
