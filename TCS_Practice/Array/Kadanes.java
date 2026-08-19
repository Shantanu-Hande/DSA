import java.util.*;
class Kadanes {
    private int kadane(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            max = Math.max(sum,max);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
       Kadanes obj = new Kadanes();

       int max = obj.kadane(arr);
       System.out.println(max);
        sc.close();
    }
}
