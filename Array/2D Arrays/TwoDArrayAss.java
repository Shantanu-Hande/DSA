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

    public static int [][] transpose(int matrix[][]){
        int transposeMatrix[][] = new int[matrix[0].length][matrix.length];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ;j<matrix[0].length ;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void printMatrix(int matrix[][]){
        for(int i=0 ; i<matrix.length ; i++){   //Rows
            for(int j=0 ; j<matrix[0].length ; j++){   //Columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int array [][] = {{ 4, 7, 5 },
                          { 8, 8, 7}};
        //System.out.print(countOf7(array));

        int nums[][] = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        //System.out.print(sumOfSecRow(nums));

        int matrix[][] = {{11,12,13},
                          {21,22,23}};
        printMatrix(matrix);
        int transposeMatrix[][] = transpose(matrix);
        printMatrix(transposeMatrix);
    }
}