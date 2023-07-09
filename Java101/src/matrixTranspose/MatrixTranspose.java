package matrixTranspose;

// Program that finds the transpose of a matrix created with multidimensional arrays
public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] transposeM = new int[matrix[0].length][matrix.length];
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                transposeM[j][i] = matrix[i][j];
            }
        }
        for(int[] row : transposeM){
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
