public class funtionprime {
    // public static boolean isprime(int n ){
    //     boolean  isprime = true;
    //     if (n == 2){
    //         isprime = true;
    //     }
    //     for (int i = 2 ; i<=n-1 ; i++){
    //         if (n%i==0){
    //             isprime = false;
    //             break;
    //         }
           
    //     }
    //     return isprime;
    // }
    public static boolean isprime(int n ){
        for (int i =2 ; i<= Math.sqrt(n); i++){
            if(n%i == 0 ){
            return false;
        }
        }
        return true;
    }
    public static void primenorange(int n){
        for (int i = 2 ; i<=n; i++){
            if (isprime(i)){
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String[] args){
        // System.out.println(isprime(8));
        primenorange(100);

    }
}
