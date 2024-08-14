package LeetCodeQuestions.LeetCode150;

import BasicArrays.SortArray;

public class BestTimeToBuyAndSellStock {
    public static int buySellStock(int[] nums){
        int buyDay = 0;
        int sellDay = 0;
        int profit = 0;

        nums = SortArray.sort(nums);
        buyDay = nums[0];
        sellDay = nums[nums.length-1];
        // profit =  sellDay - buyDay ;
        System.out.println("Buy day is " + buyDay + " Sell Day is "+sellDay);


        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buySellStock(prices));
    }    
}
