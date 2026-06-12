//

public class Q_26{

    //Brute Force 
    
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 1;
        
        while (i < n) {
            // If the current element is a duplicate of the previous one
            if (nums[i] == nums[i - 1]) {
                // Shift all elements to the right of 'i' one step to the left
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                // Reduce the logical size of the array
                n--; 
            } else {
                // Only move forward if we didn't just shift elements into the current index
                i++; 
            }
        }
        return n;
    }

    //Optimized Apporach == Two Pointer O(N)
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for(int right = 1 ; right<nums.length ; right++){
            if(nums[right] != nums[left]){
                nums[left+1] = nums[right];
                left++;
            }
        }
        return left+1;
    }
}