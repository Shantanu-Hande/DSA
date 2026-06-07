// 121. Best Time to Buy & Sell Stock.

import java.util.*;

public class Buy_SellStock{

    public static int buySellStock(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0 ; i<prices.length ; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i]; 
            }
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

    //Input
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(buySellStock(nums));
    }
}