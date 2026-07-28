public class uodateit_bit {
     public static int clearit_bit(int n , int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int setit_bit(int n , int i){
        int bitwise = 1<<i;
        return n|bitwise;
    }

    public static int updatebit(int n , int i , int bitwis){
        // if(bitwis == 0 ){
        //     return clearit_bit(n, i);
        // }else{
        //     return setit_bit(n, i);
        // }
        int x = clearit_bit(n,i);
        int newbitwis = i<<bitwis;
        return x|newbitwis; 
    } 
    public static void main(String[] args) {
        System.out.print(updatebit(10, 2, 1));
    }   
    
}
