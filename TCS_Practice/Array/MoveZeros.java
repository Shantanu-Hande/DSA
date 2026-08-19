import java.util.*;

public class MoveZeros {

    private void movezeros(int arr[] , int n){
        int i = 0 ;
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

       MoveZeros obj = new MoveZeros();

       obj.movezeros(arr,n);

        System.out.print((Arrays.toString(arr)));
        sc.close();
    }
}
