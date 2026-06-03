import java.util.*;

public class BinarySearch{

    public static int binarySearch(int arr[] , int key){
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            //Comparison
            if(arr[mid] == key){ //Found
                return mid;
            }
            if(arr[mid] < key){ //Right condition(2nd Half)
                start = mid + 1;
            }
            else{ //Left condition(1st Half)(arr[mid] > key)
                end = mid - 1;
            }
        }

        return -1;
    } 

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 11; 
        System.out.println("Index for key is " + binarySearch(arr,key));
    }
}