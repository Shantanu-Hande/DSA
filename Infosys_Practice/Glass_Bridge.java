import java.util.*;

public class Glass_Bridge{

    private static boolean sol(int [] scores, int target){
        int left = 0 , right = scores.length-1;
        while(left < right){
            int sum = scores[left] + scores[right];
            if(sum == target){
                return true;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scores[] = new int [n];
        for(int i = 0 ; i < scores.length ; i++){
            scores[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean ans = sol(scores, target);
        System.out.print(ans);
        sc.close();
    }
}