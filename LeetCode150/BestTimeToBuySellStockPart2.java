package LeetCode150;

public class BestTimeToBuySellStockPart2 {

    public static void findBestTime(int[] prices){
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit = profit + prices[i] - prices[i-1];
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        findBestTime(prices);
    }
    
}
