package LeetCode150;

public class MinimumSizeSubarraySum {

    public static int findSubLen(int[] nums, int target) {

        int i = 0;
        int j = i +1;
        int k = nums.length - 1;
        while (i < k) {
            if (target == nums[i]) {
                return new int[] { nums[i] }.length;
            } else if (target == nums[k]) {
                return new int[] { nums[k] }.length;
            }
            int sum = nums[i] + nums[k];

            if (sum >= target) {
                return new int[] { nums[i], nums[k] }.length;
            }
            i++;
            k--;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5 };
        System.out.println(findSubLen(nums, 11));
    }
}
