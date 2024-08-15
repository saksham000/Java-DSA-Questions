package LeetCodeQuestions.LeetCode150;

public class Majorityele2 {
    public static void findMajority(int[] nums) {
        int count = 0;
        int[] arr2 = new int[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {

                    count += 1;
                }
            }
            arr2[i] = count;
        }
        System.out.println("Array 2 is");
        for(int i : arr2){
            System.out.println(arr2[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        findMajority(nums);
    }
}
