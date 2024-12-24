package LeetCode150;

public class TrappingRainWater {
    
    public static void findWater(int[] height){
        int left = 0;
        int right = height.length -1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;

        while (left < right) {
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            }else{
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }
        System.out.println(water);
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        findWater(height);
    }

}
