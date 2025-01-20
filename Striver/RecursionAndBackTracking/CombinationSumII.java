package Striver.RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public static void findCombi(int idx, int target, List<Integer> ans, int[] nums) {

        if (target == 0) {
            for (int i : ans) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > target) {
                break;
            }
            ans.add(nums[i]);
            findCombi(i + 1, target - nums[i], ans, nums);
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2 };
        Arrays.sort(nums);
        findCombi(0, 4, new ArrayList<>(), nums);
    }
}
