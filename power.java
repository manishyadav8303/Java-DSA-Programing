public class power {
    public static int pow(int x , int n ){
        if(n==0){
            return 1;
        }

         return x * pow(x, n-1);
    }


    public static int optimizepowe(int n , int i){
        if(i==0){
            return 1;
        }
        int half = optimizepowe(n, i/2);
        int halfsq = half * half;
       // int halfsq = optimizepowe(n, i/2) * optimizepowe(n, i/2);

        if(i %2 != 0){
            halfsq = n * halfsq;
        }

        return halfsq;
    }
    public static void main(String[] args) {
        //System.out.println(pow(5, 5));
        System.out.println(optimizepowe(5, 2 ));
    }
    
}
