import java.util.*;

public class ArrayByReference{

    public static void update(int marks[],int nonchangeable){
        nonchangeable = 10;
        for( int i=0 ; i<marks.length ; i++){
            marks[i] += 1;
        }
    }

    public static void main(String args[]){
        int nonchangeable = 5;
        int marks[] = { 95, 97, 96};
        update(marks,nonchangeable);

        System.out.println(nonchangeable);
        for( int i=0 ; i<marks.length ; i++){
            System.out.print(marks[i]);
            System.out.println();
        }
    }
}