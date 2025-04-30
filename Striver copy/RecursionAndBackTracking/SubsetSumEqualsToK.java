package Striver.RecursionAndBackTracking;

import java.util.ArrayList;

public class SubsetSumEqualsToK {

    public static void findSubset(int i, int sum, int[] nums, int k, int n, ArrayList<Integer> list) {
        if (i == n) {
            if (sum == k) {
                for (int x : list) {
                    System.out.print(x);
                }
                System.out.println();
            }
            return;
        }
        list.add(nums[i]);
        sum += nums[i];
        findSubset(i + 1, sum, nums, k, n, list);
        list.remove(list.size() - 1);
        sum -= nums[i];
        findSubset(i + 1, sum, nums, k, n, list);
    }

    public static int findCountofSubSetEqToK(int i, int sum, int[] nums, int k, int n) {
        if (i == n) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        sum += nums[i];
        int left = findCountofSubSetEqToK(i + 1, sum, nums, k, n);
        sum -= nums[i];
        int right = findCountofSubSetEqToK(i + 1, sum, nums, k, n);
        return left + right;
    }

    public static void main(String[] args) {
        // findSubset(0, 0, new int[] { 1, 2, 1 }, 2, 3, new ArrayList<>());
        System.out.println(findCountofSubSetEqToK(0, 0, new int[]{1,2,1}, 2, 3));
    }
}
