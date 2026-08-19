import java.util.*;

public class RotateByK {

    private void reverse(int arr[] , int start , int end){
        int left = start, right = end;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private int [] rotateByK(int arr[] , int k){
        int turn = k % arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,turn-1);
        reverse(arr,turn,arr.length-1);
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        RotateByK obj = new RotateByK();
        int[] ans = obj.rotateByK(arr, k);
        for(int i = 0; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
