public class nqueenwithrule {

    public static boolean IsSafe(char board[][], int row, int col) {
        // vetical up
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // dig left 
        for(int i = row-1 , j = col-1 ; i>=0 && j>=0 ; i-- , j-- ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // dig rig
        for(int i = row-1 , j= col+1 ; i>=0 && j<board.length ; i-- , j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }

    public static void queenpr(char board[][], int row) {
        if (row == board.length) {
            printboard(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (IsSafe(board, row, j)) {
                board[row][j] = 'Q';
                queenpr(board, row + 1);
                board[row][j] = 'X';
            }
            

        }

    }

    public static void printboard(char board[][]) {
        System.out.println("----------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count =0;
    public static void main(String[] args) {
        int n = 5 ;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        queenpr(board, 0);
        System.out.println("total way to solve n queen problem " + count);

    }

}
