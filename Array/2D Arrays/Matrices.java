import java.util.*;

public class Matrices{

    public static int largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<matrix.length ; i++){   //Rows
            for(int j=0 ; j<matrix[0].length ; j++){   //Columns
                if(largest < matrix[i][j]){
                    largest = matrix[i][j]; 
                }
            }
        }
        return largest;
    }

    public static boolean Search(int matrix[][],int key){
        for(int i=0 ; i<matrix.length ; i++){   //Rows
            for(int j=0 ; j<matrix[0].length ; j++){   //Columns
                if(matrix[i][j] == key){
                    System.out.print("Key found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        //Input
        for(int i=0 ; i<n ; i++){   //Rows
            for(int j=0 ; j<m ; j++){   //Columns
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i=0 ; i<n ; i++){   //Rows
            for(int j=0 ; j<m ; j++){   //Columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        Search(matrix,5);
        System.out.print(largest(matrix));
    }
}