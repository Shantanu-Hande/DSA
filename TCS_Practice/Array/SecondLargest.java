import java.util.*;

public class SecondLargest {

    private int secondlargest(int arr[] , int n){
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > sLargest && arr[i] < largest){
                sLargest = arr[i];
            }
        }
        return sLargest;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
       SecondLargest obj = new SecondLargest();

       int sLargest = obj.secondlargest(arr,n);
       System.out.println(sLargest);
        sc.close();
    }
}
