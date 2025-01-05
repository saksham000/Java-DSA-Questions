package LeetCode150;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void findLongSub(int[] nums){
        HashSet<Integer> mapSet = new HashSet<>();
        int longest = Integer.MIN_VALUE;
        for (int i : nums) {
            mapSet.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!mapSet.contains(num -1)) {
                int length = 1;

                while (mapSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        System.out.println(longest);
    }
    
    public static void main(String[] args) {
        findLongSub(new int[]{100,4,200,1,3,2});
    }
}
