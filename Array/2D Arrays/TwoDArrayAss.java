import java.util.*;

public class TwoDArrayAss{

    public static int countOf7(int array[][]){
        int count = 0;
        for(int i=0 ; i<array.length ; i++){
            for(int j=0 ; j<array[0].length ; j++){
                if(array[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumOfSecRow(int nums[][]){
        int sum = 0;
        for(int j=0 ; j<nums[0].length ; j++){
            sum+= nums[1][j];
        }
        return sum;
    } 

    public static void transpose(int matrix[][]){
        

    }

    public static void main(String args[]){
        int array [][] = {{ 4, 7, 5 },
                          { 8, 8, 7}};
        //System.out.print(countOf7(array));

        int nums[][] = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        System.out.print(sumOfSecRow(nums));

        int matrix[][] = {{11,12,13},
                          {21,22,23}};
        transpose(matrix);
    }
}