import java.util.*;

public class InsertionSort{

    public static void insertionSort(int arr[],int n){
        for(int i=0 ; i<n ; i++){
            int curr = arr[i];
            int pre = i+1;
            while(pre>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--
            }
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[],int n){
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        insertionSort(arr,n);
        printArr(arr,n);
    }
}