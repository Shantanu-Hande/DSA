import java.util.*;

public class StringAss{

    public static int Q1(String str){
        int count = 0;
        for(int i=0 ; i<str.length() ; i++){
            ch = str.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(Q1(str));
    }
}