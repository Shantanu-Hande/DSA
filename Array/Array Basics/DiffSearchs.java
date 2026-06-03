import java.util.*;

public class DiffSearchs{

    public static int linearSearch(int numbers[] , int key){
        for(int i=0 ; i<numbers.length ; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }

    public static int getLagrest(int num[]){
        int lagrest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0 ; i<num.length ; i++){
            if(num[i] > lagrest){
                lagrest = num[i];
            }
            if(num[i] < smallest){
                smallest = num[i];
            }
        }
        System.out.println("The smallest value in the given Array is " + smallest);
        return lagrest;
    }

    public static void main(String args[]){

        int num[] = {1,2,6,3,5};
        System.out.println("The lagrest value in the given Array is " + getLagrest(num));



        /*
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearSearch(numbers,key);
        if (index == -1){
            System.out.println("NOT Found");
        }
        else{
            System.out.println("Key is at Index " + index);
        }

       String menu[] = {"Dosa","Chole Bhature","Samosa","Vadapav"};
       String key = "Samosa";

       int index = linearSearch(menu,key);
        if (index == -1){
            System.out.println("NOT Found");
        }
        else{
            System.out.println("Item is at Index " + index);
        }
        */
       
    }
}