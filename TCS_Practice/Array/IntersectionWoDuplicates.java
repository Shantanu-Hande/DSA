import java.util.*;

public class IntersectionWoDuplicates {

    private int[] intersection(int arr1[] , int arr2[]){
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0 , j = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                if(al.size() == 0 || al.get(al.size()-1) != arr1[i]){
                    al.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int [] ans = new int[al.size()];
        for(int k = 0 ; k < ans.length ; k++){
            ans[k] = al.get(k);
        }
        return ans;
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int [n];
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int j = 0 ; j < m ; j++){
            arr2[j] = sc.nextInt();
        }

        IntersectionWoDuplicates obj = new IntersectionWoDuplicates();

        int [] res = obj.intersection(arr1, arr2);

        for(int k = 0 ; k < res.length ; k++){
            System.out.print(res[k] + " ");
        }
        sc.close();
    }
}
