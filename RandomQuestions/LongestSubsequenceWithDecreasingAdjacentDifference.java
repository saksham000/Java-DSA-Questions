package RandomQuestions;

public class LongestSubsequenceWithDecreasingAdjacentDifference {

    public static void findLongestSub(int[] nums) {
        int lastDiff = Math.abs(nums[1] - nums[0]);
        int currStreak = 2, longestSeq = 2;

        for (int i = 1; i < nums.length - 1; i++) {
            int cal = Math.abs(nums[i + 1] - nums[i]);

            if (lastDiff >= cal) {
                currStreak++;
                lastDiff = cal;
            } else {
                currStreak = 2;
                lastDiff = cal;
            }
            longestSeq = Math.max(longestSeq, currStreak);
        }
        System.out.println(longestSeq);
    }

    public static void isSorted(int[] nums){
        int[] num2 = new int[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            num2[i] = nums[i];
        }

        for(int i : num2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        findLongestSub(new int[] { 10, 20, 10, 19, 10, 20 });
        isSorted(new int[]{1,2,3,4,5});
    }
}
