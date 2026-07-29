public class countbit {
    public static int count(int n ){
        int counter = 0 ;
        while(n>0){
            if( ( n & 1) != 0){
                counter ++;
            }
            n =n>>1;
        }
        return counter; 
    }

    public static void main(String[] args) {
        System.out.println(count(15 ));
    }
    
}
