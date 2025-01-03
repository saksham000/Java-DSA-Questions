package LeetCode150;

public class MinimumSizeSubarraySum {

    public static void findMinSub(int nums[], int target) {

        int i = 0, j = 0, min = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];

            if (sum < target) {
                j++;
            } else if (sum == target) {
                min = Math.min(min, j - i + 1);
                j++;
            } else if (sum > target) {
                while (sum >= target) {
                    min = Math.min(min, j - i + 1);
                    sum -= nums[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(min == Integer.MAX_VALUE ? 0 : min);
    }

    public static void findLength(int num){
        
    }

    public static void main(String[] args) {
        findMinSub(new int[] { 1, 2, 3, 4, 5 }, 11);
    }
}
