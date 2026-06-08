import java.util.*;

public class String_Q{

    public static boolean isPalindrome(String str){
        int n = str.length();

        for(int i=0 ; i<n/2 ; i++){
            if((str.charAt(i) != str.charAt(n-1-i))){
                return false; //not a palindrome
            }
        }
        return true; // it is a palindrome
    }

    public static float shortest_path(String str){
        int x = 0, y = 0;
        for(int i=0 ; i<str.length() ; i++){
            char dir = str.charAt(i);
            //SOUTH
            if(dir == 'S'){
                y--;
            }
            //NORTH
            else if (dir =='N'){
                y++;
            }
            //EAST
            else if(dir == 'E'){
                x++;
            }
            //WEST
            else{
                x--;
            }

        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
        
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1 ; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0 ; i<str.length() ; i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if( count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }



    public static void main(String args[]){
        //String str = "racecar";
        //System.out.print(isPalindrome(str));

        //String path = "WNEENESENNN";
        //System.out.print(shortest_path(path));

        /*String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=0 ; i<fruits.length ; i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.print(largest);*/

        //String str = "hi, i am shantanu";
        //System.out.print(toUpperCase(str));

        String str = "aaabbcccdd";
        System.out.print(compress(str));

    }
}