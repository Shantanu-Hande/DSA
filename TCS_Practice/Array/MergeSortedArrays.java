import java.util.*;

public class MergeSortedArrays {

    private int [] merge(int arr1[] , int arr2[]){
        int i = 0 , j = 0;
        int ans[] = new int[arr1.length + arr2.length];
        int count = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[count++] = arr1[i];
                i++;
            }
            else if(arr1[i] > arr2[j]){
                ans[count++] = arr2[j];
                j++;
            }
            else{
                ans[count++] = arr1[i];
                ans[count++] = arr2[j];
                i++;
                j++;
            }
        }
        while( i < arr1.length ){
            ans[count++] = arr1[i];
            i++;
        }
        while(j < arr2.length){
            ans[count++] = arr2[j];
            j++;
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1 [] = new int [n];
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int [m];
        for(int i = 0 ; i< m ; i++){
            arr2[i] = sc.nextInt();
        }

        MergeSortedArrays obj = new MergeSortedArrays();

        int result[] = obj.merge(arr1, arr2);
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }   
}
