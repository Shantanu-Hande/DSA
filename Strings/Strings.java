import java.util.*;

public class Strings{

    public static void printLetters(String str){
        for(int i=0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    /*public static String substring(String str , int si , int ei){
        String substr = "";
        for(int i=si ; i<ei ; i++){
            substr += str.charAt(i);
        }
        return substr;
    }*/

    public static void main(String args[]){
        char arr[] = { 'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz"); 

        //Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        //String name = sc.next();  //for a single word as an input
       // String name = sc.nextLine(); //for the whole line as an input
       // System.out.print(name.length());  //name.length() is a function to find the length of the string 

    //Concatenation

        String firstname = "Shantanu";
        String lastname = "Hande";
        String fullname = firstname + " " + lastname;
        //System.out.println(fullname);
        //System.out.print(fullname.charAt(0));
        //printLetters(fullname);

    //String Function --> .equals() it is use to check the value of the string
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        /*if(s1==s2){ // by using "==" it checks whether the string id equal on object level not by value
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){  // These .equals() compares the value of the string
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }*/

    //String Function --> .substring(si,ei) is an inbuilt java function to get the substring from a string
        //String str = "HelloWorld";
        //System.out.println(str.substring(0,5)); // .substring(si,ei) is an inbuilt java function 

        //System.out.print(substring(str,3,5));

    //String Builder
        StringBuilder sb = new StringBuilder("");
        for(char ch='a' ; ch<='z' ; ch++){
            sb.append(ch);
        }
        System.out.print(sb.length());
    }
}