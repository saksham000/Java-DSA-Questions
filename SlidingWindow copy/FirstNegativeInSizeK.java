package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInSizeK {

    public static void findFirstNeg(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {

            if (arr[j] < 0) {
                que.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {

                if (que.isEmpty()) {
                    ans.add(0);
                } else {
                    ans.add(que.peek());
                    if (arr[i] == que.peek()) {
                        que.poll();
                    }
                }
                i++;
                j++;

            }
        }
        for (int list : ans) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        int[] num = { -8, 2, 3, -6, 10 };
        findFirstNeg(num, 2);
    }
}
