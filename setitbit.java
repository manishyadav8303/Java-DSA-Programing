public class setitbit {
    public static int setit_bit(int n , int i){
        int bitwise = 1<<i;
        return n|bitwise;
    }

    public static void main(String[] args) {
        System.out.println(setit_bit(10, 2));
    }
    
}
