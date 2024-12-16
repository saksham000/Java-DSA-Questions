package LeetCode150;

public class MajorityElement {

    public static void findMajority(int[] nums){
        int ele = nums[0];
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(ele == nums[i]){
                count++;
            }else if(count == 0){
                ele = nums[i];
            }else{
                count--;
            }
        }
        System.out.println(ele);
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        findMajority(nums);
    }
}
