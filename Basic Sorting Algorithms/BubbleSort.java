import java.util.*;

public class BubbleSort{

    public static void bubbleSort(int arr[],int n){
        for(int turn=0 ; turn<n ; turn++){
            for(int j=0 ; j<n-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
            }
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

        bubbleSort(arr,n);
        printArr(arr,n);
    }
}