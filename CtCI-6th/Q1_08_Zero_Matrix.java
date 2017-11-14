public class Q1_08_Zero_Matrix {
    public static void main(String[] args){
        int[][] matrix = {{1,4,0},{2,5,6}};
        zeroMatrix(matrix);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

    static void zeroMatrix(int[][] matrix){
        boolean[] zeroRow = new boolean[matrix.length];
        boolean[] zeroCol = new boolean[matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col]==0){
                    zeroRow[row] = true;
                    zeroCol[col] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(zeroRow[i] || zeroCol[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
