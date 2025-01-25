package LeetCode150;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void findCombi(int i, int target, List<Integer> combi, int[] nums) {

        if (i == nums.length) {
            if (target == 0) {
                for (int x : combi) {
                    System.out.print(x);
                }
                System.out.println();
            }
            return;
        }
        if (nums[i] <= target) {

            combi.add(nums[i]);
            findCombi(i, target - nums[i], combi, nums);
            combi.remove(combi.size() - 1);
        }
        findCombi(i + 1, target, combi, nums);
    }

    public static void main(String[] args) {
        findCombi(0, 7, new ArrayList<>(), new int[] { 2, 3, 6, 7 });
    }
}
