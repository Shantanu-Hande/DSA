import java.util.*;

class USDuplicates {

    private ArrayList<Integer> Duplicates(int arr[]){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int num : arr){
            if(seen.contains(num)){
                if(duplicate.add(num)){
                    al.add(num);
                }
            }
            else{
                seen.add(num);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
       USDuplicates obj = new USDuplicates();

       ArrayList<Integer> result = obj.Duplicates(arr);
       for(int i = 0 ; i < result.size() ; i++){
          System.out.print(result.get(i) + " ");
       }
        sc.close();
    }   
}
