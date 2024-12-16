package LeetCode150;

import java.util.HashMap;

public class FindMajorityElement {

    public static void findMajority(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else
            map.put(nums[i], 1);
        }

        int maxCount = Integer.MIN_VALUE;
        int value = 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                if(count > maxCount){
                    maxCount = count;
                    value = nums[i];
                }
            }
        }

        System.out.println("number "+ value + " has max count of " + maxCount);
    }


    public static void main(String[] args) {
        int[] num = {1,3,2,4};
        findMajority(num);
    }
}
