import java.util.*;

public class ArrayAss{

    public static boolean Q1(int nums[],int n){
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static int Q2(int nums[],int n,int target){
        int start = 0 , end = n-1 ;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[start]<=nums[mid]){    //asumming Left is sorted
                if(target>=nums[start] && target<=nums[mid - 1]){ //checking if target is in left 
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{                               //Right is sorted (esle if failed)
                if(target>=nums[mid + 1] && target<=nums[end]){ //Checking if target is in right
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int Q3(int prices[],int n){
        int buyPrice = Integer.MAX_VALUE , maxProfit = 0;
        for(int i=0 ; i<n ; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        

        /*int target = sc.nextInt();
        System.out.print(Q2(arr,n,target));*/

        //System.out.print(Q1(nums,n));
    }
}