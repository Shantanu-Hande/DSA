import java.util.*;

public class TwoSum {

    private int [] twoSum(int arr[] , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();
        
        int ans[] = new int[2];
        ans = obj.twoSum(arr, target);
        for(int i = 0; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
    
}
