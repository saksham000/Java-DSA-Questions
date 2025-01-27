package Striver.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Striver.BinaryTrees.BasicBTImpl.Node;
public class BinaryTreeLevelOrderTrav {

    public static void levelTrav(Node root) {
        Queue<Node> que = new LinkedList<Node>();
        if (root == null) {
            return;
        }
        que.add(root);

        List<Integer> subList = new ArrayList<>();
        while (!que.isEmpty()) {
            int level = que.size();

            for (int i = 0; i < level; i++) {
                if (que.peek().left != null) {
                    que.offer(que.peek().left);
                }
                if (que.peek().right != null) {
                    que.offer(que.peek().right);
                }

                subList.add(que.poll().data);
            }
        }
        for (int i : subList) {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {

        levelTrav(Striver.BinaryTrees.BasicBTImpl.basicBT());

    }
}
