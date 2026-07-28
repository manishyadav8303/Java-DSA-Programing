public class clearitbit {
    public static int clearit_bit(int n , int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int clearlast(int n , int i ){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }

    public static void main(String[] args) {
       // System.out.println(clearit_bit(10, 1));
       System.out.println(clearlast(15, 2));
    }
    
}
