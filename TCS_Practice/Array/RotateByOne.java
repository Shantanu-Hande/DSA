import java.util.*;

class RotateByOne{

    private void rotateArray(int arr[]){
        int temp = arr[0];
        for(int i = 0 ; i <= arr.length - 2 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        RotateByOne obj = new RotateByOne();

        obj.rotateArray(arr);

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}