import java.util.*;

public class SelectionSort{

    public static void selectionSort(int arr[],int n){
        for(int i=0 ; i<n-1 ; i++){
            int minPos = i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

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

        selectionSort(arr,n);
        printArr(arr,n);
    }
}