public class inverted_pemid {
    public static void pramid(int n){
        for ( int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=n+1-i ; j++ ){
                System.out.print(j);
            }
            System.out.println();

            
        }
    }
    public static void main(String[] args) {
        pramid(7);
    }
    
}
