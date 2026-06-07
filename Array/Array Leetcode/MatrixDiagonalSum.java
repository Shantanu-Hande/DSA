// 1572. Matrix Diagonal Sum

import java.util.*;

public class MatrixDiagonalSum{

    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        
        //Optimized Approach O(n)
        for(int i=0 ; i<matrix.length ; i++){
            //Primary Diagonal 
            sum += matrix[i][i];
            //Secondary Diagonal
            if(i != matrix.length-1-i){ //Cover the case such as odd x odd matrix
            sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][] = {{ 1, 2, 3, 4},
                         { 5, 6, 7, 8},
                         { 9, 10, 11, 12},
                         { 13, 14, 15, 16}};
        
        System.out.print(diagonalSum(matrix));
    }
}