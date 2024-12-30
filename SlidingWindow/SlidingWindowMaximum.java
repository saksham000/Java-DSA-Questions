package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowMaximum {

    public static void findMax(int[] nums, int k) {
        int i = 0, j = 0;
        Deque<Integer> que = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        while (j < nums.length) {
            while(!que.isEmpty() && nums[j] > que.peekLast()) {
                que.pollLast();
            }
            que.add(nums[j]);

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                ans.add(que.peekFirst());

                if (nums[i] == que.peekFirst()) {
                    que.pollFirst();
                }
                i++;
                j++;
            }

        }

        int[] result = ans.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] num = { 1,3,-1,-3,5,3,6,7 };
        findMax(num, 3);
    }
}
