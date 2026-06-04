import java.util.*;

public class StaircaseSearch{

    public static boolean staircaseSearch2(int matrix[][],int key){

        //Staircase Search Considering BOTTOM-LEFT ==> O(n+m)
        int row = matrix.length-1 , col = 0;

        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == key){
                System.out.print("Key found at (" + row + "," + col + ")");
                return true;
            }

            //TOP
            else if(key < matrix[row][col]){
                row--;
            }
            
            //RIGHT
            else if(key > matrix[row][col]){
                col++;
            }
        }
        System.out.print("Key not found!");
        return false;
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        
        //Staircase Search Considering TOP-RIGHT ==> O(n+m)
        int row = 0 , col = matrix[0].length - 1;

        while(row < matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.print("Key found at (" + row + "," + col + ")");
                return true;
            }
            
            //LEFT
            else if(key < matrix[row][col]){
                col--;
            }
            
            //BOTTOM
            else if(key > matrix[row][col]){
                row++;
            }
        } 
        System.out.print("Key not found!");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{ 10, 20, 30, 40},
                         { 15, 25, 35, 45},
                         { 27, 29, 37, 48},
                         { 32, 33, 39, 50}};

        int key = 40;
        
        staircaseSearch2(matrix,key);
    }
}