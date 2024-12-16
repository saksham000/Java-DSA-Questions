package LeetCode150;

public class BestTimeToBuyAndSellStock {
    public static int buySellStock(int[] nums){
        int buy = nums[0];
        int profit = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < buy){
                buy = nums[i];
            }else if(nums[i] - buy > profit){
                profit = nums[i] - buy;
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buySellStock(prices));
    }    
}
