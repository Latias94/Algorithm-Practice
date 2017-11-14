public class Q1_07_Rotate_Matrix {
    /**
     * @param matrix N*N matrix, row & column
     * @param n      N
     */
    public static void rotate(int[][] matrix, int n) {
        // iterate i times, which is the count of matrix layers
        for (int layer = 1; layer < n / 2; layer++) {
            int first = layer;
            int last = n - layer - 1;
            // iterate each element in a row or column
            for (int i = 1; i < last; i++) {
                int offset = i - first;
                int temp = matrix[first][i];
                matrix[first][offset] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = temp;
            }
        }
    }
}
