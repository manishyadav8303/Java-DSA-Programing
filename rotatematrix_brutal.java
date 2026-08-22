public class rotatematrix_brutal {
    public static int[][] rot(int [][] matrix , int row , int col){
        int ans[][] = new int[row][col];
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                ans[j][row-i-1]= matrix[i][j];
            }
        }
        return ans;
    }
      public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        int ans[][] = rot(matrix, row, col);

        // Print rotated matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

