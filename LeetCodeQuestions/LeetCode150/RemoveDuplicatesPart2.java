package LeetCodeQuestions.LeetCode150;

import java.util.Arrays;

public class RemoveDuplicatesPart2 {

    public static void removeDupliPart2(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        removeDupliPart2(nums);
    }

}