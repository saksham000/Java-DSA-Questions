package LeetCode150;

public class TwoSumII {

    public static void findSum(int[] num, int target) {
        int[] ans = new int[2];
        int left = 0, right = num.length - 1;
        int total = 0;
        while (left < right) {
            total = num[left] + num[right];
            if (total == target) {
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
            left++;
            right--;
        }

        for (int x : ans) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] nums = { -10, -8, -2, 1, 2, 5, 6 };
        findSum(nums, 0);
    }
}
