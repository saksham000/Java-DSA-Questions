package LeetCodeQuestions.LeetCode150;

public class RemoveDuplicates {

    public static void removeDupli(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[k] = nums[i];
                k++;
                nums[k] = nums[i + 1];
            }
        }
        for (int i = 0; i <= k; i++) {
            System.out.println(nums[i]);
        }
        k++;
        System.out.println(k);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };

        removeDupli(nums);

    }
}
