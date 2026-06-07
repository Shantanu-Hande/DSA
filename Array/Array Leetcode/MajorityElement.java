// 169. Majority Element 

import java.util.*;
import java.util.Arrays;

public class MajorityElement{

    public static int Approach1(int[] nums,int n) {
        int majority = -1;
        for(int i=0 ; i<nums.length ; i++){
            int count = 1;
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count > n/2){
                majority = nums[i];
            }
        }
        return majority;
    }

    //Sorting the array
    public static int Approach2(int[] nums,int n) {
        Arrays.sort(nums);
        int majority = nums[0];
        int count = 1;
        for(int i=1 ; i<nums.length ; i++){
                if(nums[i]==nums[i-1]){
                    count++;
                }
                else{
                    count = 1;
                }
            if(count > n/2){
                majority = nums[i];
            }
        }
        return majority;
    }

    //Moore Voting Algorithm 
    public static int Approach3(int[] nums,int n) {
        int majority = 0;
        int count = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(count == 0){
                majority = nums[i];
            }
            if(majority == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return majority;
    }

    //Input
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }
        //System.out.print(Approach1(nums,n));
        //System.out.print(Approach2(nums,n));
        System.out.print(Approach3(nums,n));
    }
}