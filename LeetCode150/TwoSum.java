package LeetCode150;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    
    public static int[] findSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           int compliment = target - nums[i];

            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i], i);
        }
        
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSum(new int[]{2,7,11,15}, 9)));
    }
}
