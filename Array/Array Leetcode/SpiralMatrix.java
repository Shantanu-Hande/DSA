// 54. Spiral Matrix
//Use Arraylist to return result
import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int startRow = 0 , endRow = matrix.length - 1 ;
        int startCol = 0 , endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //Top
            for(int j=startCol ; j<=endCol ; j++){
                result.add(matrix[startRow][j]);
            }

            //Right
            for(int i=startRow+1 ; i<=endRow ; i++){
                result.add(matrix[i][endCol]);
            }

            //Bottom
            for(int j=endCol-1 ; j>=startCol ; j--){
                if(startRow == endRow){
                    break;
                }
                result.add(matrix[endRow][j]);
            }

            //Left
            for(int i=endRow-1 ; i>=startRow+1 ; i--){
                if(startCol == endCol){
                    break;
                }
                result.add(matrix[i][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result; 
    }

    public static void main(String args[]){
        int matrix[][] = {{ 1, 2, 3, 4},
                         { 5, 6, 7, 8},
                         { 9, 10, 11, 12},
                         { 13, 14, 15, 16}};
        
        SpiralMatrix obj = new SpiralMatrix(); 
        System.out.print(obj.spiralOrder(matrix));
    }
}