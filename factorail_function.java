public class factorail_function {
    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static int factorial(int n){
        int f =1 ;
        for (int i=1 ; i<=n ; i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int c = n-r;
        int fact_c = factorial(c);
        int bin = fact_n /(fact_c*fact_r);
        return bin;
    }
    public static void main(String[] args) {
        System.out.println(bincoff(5 , 2));
        
    }

    
}
