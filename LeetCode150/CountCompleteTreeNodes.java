package LeetCode150;

import Striver.BinaryTrees.BasicBTImpl;
import Striver.BinaryTrees.BasicBTImpl.Node;

public class CountCompleteTreeNodes {

    public static int findNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = getLH(root);
        int rh = getRH(root);

        if (lh == rh) {
            return ((2 << lh) - 1);
        } else {
            return findNodes(root.left) + findNodes(root.right) + 1;
        }
    }

    static int getLH(Node root) {
        int count = 0;

        while (root.left != null) {
            root = root.left;
            count++;
        }
        return count;
    }

    static int getRH(Node root) {
        int count = 0;

        while (root.right != null) {
            root = root.right;
            count++;
        }
        return count;
    }

    void main() {
        System.out.println(findNodes(BasicBTImpl.basicBT()));
    }
}
