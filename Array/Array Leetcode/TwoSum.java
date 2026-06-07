// 1. Two Sum //Not optimized cause uses Hashmap 
public class TwoSum{

    public static int[] twoSum(int[] nums, int target) {
        int array [] = new int[2];
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]+nums[j] == target){
                    array[0] = j ;
                    array[1] = i ;
                }
            }
        }
        return array;
    }
    
    

    public static void main(String args[]){

    }
}
