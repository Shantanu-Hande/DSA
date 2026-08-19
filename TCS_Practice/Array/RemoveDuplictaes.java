import java.util.*;
class RemoveDuplictaes {

    private int removeDuplicates(int arr[] , int n){
        int i = 0 ;
        for(int j = 1; j < arr.length ; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

       RemoveDuplictaes obj = new RemoveDuplictaes();

       int unique = obj.removeDuplicates(arr,n);

       for(int i = 0 ; i < unique ; i++){
          System.out.print(arr[i]+" ");
       }
        sc.close();
    }
    
}
