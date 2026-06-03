import java.util.*;

public class Subarray{

    public static void printSubarray(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int ts = 0;
        for(int i=0 ; i<arr.length ; i++){
            int start = i;
            for(int j=i; j<arr.length ; j++){
                int end = j;
                int sum = 0;
                for(int k=start ; k<=end ; k++){
                    sum += arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println("= " + sum);
                ts++;
                if(sum < smallest){
                    smallest = sum;
                }
                if(sum > largest){
                    largest = sum;
                }
            }
            System.out.println();
        }
        System.out.println("The Largest sum is "+largest);
        System.out.println("The Smallest sum is "+smallest);
        System.out.println("Total Subarrays = "+ts);
    }

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        printSubarray(arr);
    }
}