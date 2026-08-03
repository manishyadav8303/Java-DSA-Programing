public class naturalnosum {
    public static int sum(int n ){
        if(n==1){
            return 1;
        }

        int summ = n+sum(n-1);
        return summ;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    } 
}
