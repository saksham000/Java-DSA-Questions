package Striver.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import Striver.BinaryTrees.BasicBTImpl.Node;

class Pair {
    Node node;
    int num;

    Pair(Node node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class MaximumWidthBinaryTree {

    public static void findMaxWidth(Node root) {
        if (root == null) {
            return;
        }
        int ans = 0;

        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(root, 0));

        while (!que.isEmpty()) {
            int size = que.size();
            int min = que.peek().num;
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                int curr = que.peek().num - min;
                Node node = que.peek().node;
                que.poll();
                if (i == 0) {
                    first = curr;
                }
                if (i == size - 1) {
                    last = curr;
                }
                if (node.left != null) {
                    que.offer(new Pair(node.left, curr * 2 + 1));
                }
                if (node.right != null) {
                    que.offer(new Pair(node.right, curr * 2 + 2));
                }
                ans = Math.max(ans, last - first + 1);
            }
        }
        System.out.println(ans);
    }

    void main() {
        findMaxWidth(BasicBTImpl.basicBT());
    }
}
