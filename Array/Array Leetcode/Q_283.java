// 283. Move Zeroes

public class Q_283{
    
    //Brute Force Approach
    public void moveZeroes(int[] nums) { 
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums.length - i - 1 ; j++){
                if(nums[j]==0){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    //Optimized Solution ==> Two Pointer
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right=0 ; right<nums.length ; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
