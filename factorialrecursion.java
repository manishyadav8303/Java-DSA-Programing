public class factorialrecursion {
    public static int fcat(int n ){

        if( n ==0){
            return 1;
        }
        int fom = fcat(n-1);
        int fc = n*fcat(n-1);
        return fc;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fcat(n));; 
    }
}
