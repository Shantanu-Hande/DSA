import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSum {
    // Your exact solution logic
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the array
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();

        // Fix one element and use two-pointer approach for the rest
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    // Store triplet in set to avoid duplicates
                    s.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        // Transfer set elements to final result list
        ans.addAll(s);
        return ans;
    }

    // The entry point Java needs to run the program
    public static void main(String[] args) {
        // 1. Create an instance of the class
        ThreeSum solver = new ThreeSum();
        
        // 2. Set up a standard test case (commonly seen in this problem)
        int[] testArray = {-1, 0, 1, 2, -1, -4};
        
        // 3. Run the method and store the output
        List<List<Integer>> result = solver.threeSum(testArray);
        
        // 4. Print the output
        System.out.println("Input array: " + Arrays.toString(testArray));
        System.out.println("Unique triplets that sum to 0: " + result);
    }
}