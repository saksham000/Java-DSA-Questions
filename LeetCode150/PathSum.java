package LeetCode150;

import Striver.BinaryTrees.BasicBTImpl;
import Striver.BinaryTrees.BasicBTImpl.Node;;

public class PathSum {

    public static boolean findPath(Node root, int sum, int target) {
        if (root == null) {
            return false;
        }
        sum += root.data;
        if (root.left == null && root.right == null) {
            return sum == target;
        }
        return findPath(root.left, sum, target) || findPath(root.right, sum, target);
    }

    void main() {
        System.out.println(findPath(BasicBTImpl.basicBT(), 0, 6));
    }

}
