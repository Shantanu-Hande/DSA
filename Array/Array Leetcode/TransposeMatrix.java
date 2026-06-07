// 867. Transpose Matrix //Not the Optimized version it uses In-Place Algorithms
public class TransposeMatrix{
     public int[][] transpose(int[][] matrix) {
        int transposeMatrix[][] = new int[matrix[0].length][matrix.length];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}
