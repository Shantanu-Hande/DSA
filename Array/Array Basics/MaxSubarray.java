import java.util.*;

public class MaxSubarray{

    public static void printSubarray(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE; 

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                currsum = 0;
                for(int k=i ; k<=j ; k++){
                    currsum += arr[k];
                }
                if( currsum > maxsum ){
                    maxsum = currsum;
                }
            }
        }
        System.out.print("Max Sum = " +maxsum);
        
    }

    public static void prefixsum(int arr[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE; 
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i=1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if( currsum > maxsum ){
                    maxsum = currsum;
                }
            }
        }
        System.out.print("Max Sum = " + maxsum);
    }

    public static void kadanes(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i=0 ; i<arr.length ; i++){
            currsum += arr[i];
            if( currsum<0 ){
                currsum = 0;
            }
            maxsum = Math.max(currsum,maxsum);
        }
        System.out.print("Our maximum subarray sum is " + maxsum);
    }



    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);

    }
}