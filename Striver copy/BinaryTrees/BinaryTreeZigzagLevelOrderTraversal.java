package Striver.BinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Striver.BinaryTrees.BasicBTImpl.Node;

public class BinaryTreeZigzagLevelOrderTraversal {

    public static void trav(Node root) {

        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(root);
        boolean flag = true;

        while (!queue.isEmpty()) {
            int level = queue.size();

            Integer[] sub = new Integer[level];
            for (int i = 0; i < level; i++) {

                Node node = queue.poll();

                int index = flag ? i : level - 1 - i;

                sub[index] = node.data;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            flag = !flag;
            ans.add(Arrays.asList(sub));
        }

        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        trav(BasicBTImpl.basicBT());
    }
}
