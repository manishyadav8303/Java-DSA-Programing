public class nqueen {
    public static void nqueenpr(char board[][] , int row){
        //base
        if(row== board.length){
            printqu(board);
            return;}
          

            for(int j=0 ; j<board.length ; j++){
                board[row][j] = 'q';

                nqueenpr(board, row+1);
                board[row][j] = 'X';
            }
        
    }
    public static void printqu(char board[][]){
          System.out.println("_________________");
        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board.length ; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 2;
        char board[][] = new char[n][n];
        for(int i = 0 ; i<board.length; i++){
           for (int j = 0 ; j<board.length ; j++){
            board[i][j] = 'X';
           }

        }
        nqueenpr(board, 0);
    }
}
