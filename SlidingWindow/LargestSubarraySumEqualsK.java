package SlidingWindow;

public class LargestSubarraySumEqualsK {

    public static void findLargestSub(int[] nums, int k) {
        int i = 0, j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while (j < nums.length) {
            sum += nums[j];

            if (sum < k) {
                j++;
            } else if (sum == k) {
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                while (sum > k) {
                    sum -= nums[i];
                    i++;
                    if (sum == k) {
                        max = Math.max(max, j - i + 1);
                    }
                }
                j++;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        findLargestSub(new int[] { 2, 3, 4, 6, 9, 4 }, 13);
    }
}