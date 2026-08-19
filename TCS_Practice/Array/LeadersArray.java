import java.util.*;
public class LeadersArray {

    private int[] leaders(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[arr.length-1]);
        int num = arr[arr.length-1];
        for(int i = arr.length-2 ; i >= 0 ; i--){
            if(arr[i] >= num){
                al.add(arr[i]);
                num = arr[i];
            }
        }
        int ans [] = new int [al.size()];
        for(int i = 0 ; i < al.size() ; i++){
            ans[i] = al.get(al.size()-1-i);
        }
        return ans;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        LeadersArray obj = new LeadersArray();

        int result[] = obj.leaders(arr);
        for(int i = 0 ; i < result.length ;i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }   
}
