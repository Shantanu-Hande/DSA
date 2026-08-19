import java.util.*;

public class MissingNumber {

    private int missingNumber(int arr[], int n){
        int xor = 0; 
        for(int i = 1 ; i <= n ; i++){
            xor ^= i; 
        }

        for(int num : arr){
            xor ^= num;
        }

        return xor;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        for(int i = 0 ; i < n-1 ; i++){
            arr[i] = sc.nextInt();
        }

        MissingNumber obj = new MissingNumber();
        int num = obj.missingNumber(arr,n);

        System.out.println(num);
        sc.close();
    }
    
}
