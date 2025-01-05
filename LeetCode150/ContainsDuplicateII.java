package LeetCode150;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static boolean findDupli(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int total = i - map.get(nums[i]);
                if (total <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findDupli(new int[] { 1, 0, 1, 1 }, 1));
    }
}
