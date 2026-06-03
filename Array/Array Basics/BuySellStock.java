import java.util.*;

public class BuySellStock{

    public static int buyAndSellStock(int prices[],int n){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0 ; i<n ; i++){
            if(buyPrice < prices[i]){ //Checking if buyprice < sellingprice
                int profit = prices[i] - buyPrice; //sellingprice - buyprice
                maxProfit = Math.max(maxProfit,profit); //MAX profit
            }
            else{
                buyPrice = prices[i]; //buying price
            }
        }
        return maxProfit;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0 ; i<n ; i++){
            prices[i]=sc.nextInt();
        }
        System.out.print(buyAndSellStock(prices,n));
    }
}