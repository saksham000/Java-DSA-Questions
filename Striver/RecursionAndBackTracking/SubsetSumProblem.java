package Striver.RecursionAndBackTracking;

public class SubsetSumProblem {

    public static boolean findSubSet(int i, int[] nums, int sum, int target) {
        if (i == nums.length) {
            return sum == target;
        }
        if (findSubSet(i + 1, nums, sum + nums[i], target)) {
            return true;
        }
        sum -= nums[i];
        if (findSubSet(i + 1, nums, sum + nums[i], target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findSubSet(0, new int[] { 3, 34, 4, 12 }, 0, 9));
    }
}
