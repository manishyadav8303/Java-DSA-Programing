public class hollow_pattern {
    public static void hollow_pattern( int row , int col){
        for( int i = 1 ; i<= row ; i++){
            for ( int j = 1; j <= col ; j++){
                if (i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
        
    }
    // //public static void main(String[] args) {
    //     hollow_pattern(5, 8);
    // }

    public static void hollowpatt(int row , int col){
        for(int i = 1 ; i<=  row ; i++){
            for(int j = 1 ; j<= col ; j++){
                if(i==1 || i== row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.err.println();
        }
    }
    public static void num(int n) {
        for(int i = n ; i>=1 ; i--){
            for(int j = 1 ; j<= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }        
    }
    public static void main(String[] args) {
        num(4);
    }
    
}
