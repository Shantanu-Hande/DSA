import java.util.*;

public class AlternatePosNeg {

    private int [] alternatePosNeg(int arr[]){
        int ans[] = new int[arr.length];
        int posindex = 0 , negindex = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                ans[posindex] = arr[i];
                posindex += 2;
            }
            else{
                ans[negindex] = arr[i];
                negindex += 2;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        AlternatePosNeg obj = new AlternatePosNeg();
       
        int [] res = obj.alternatePosNeg(arr);
        for(int i = 0 ; i < res.length ; i++){
            System.out.print(res[i]+" ");
        }
        sc.close();

    }
}
