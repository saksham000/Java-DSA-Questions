package LeetCode150;

public class JumpGame {

    public static boolean findJump(int[] nums){
        int rechable = 0;
        for(int i=0;i<nums.length;i++){
            if(i > rechable){
                return false;
            }
            rechable = Math.max(rechable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] num = {2,3,1,1,4};
        System.out.println(findJump(num));
    }
    
}
