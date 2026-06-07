// 268. Missing Number

import java.util.*;

public class MissingNumber{
    
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sumofN = n*(n+1)/2;
        int sumofNums = 0;
        for(int i=0 ; i<n ; i++){
            sumofNums += nums[i];    
        }
        int missingElement = sumofN - sumofNums;
        return missingElement;
    }

    //Input
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(missingNumber(nums));
    }
}
