public class getitbit {
    public static int getit_bit(int x , int i ){
        int bitmask = 1<<i;
        if((x & bitmask ) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getit_bit(10, 2));
    }
    
}
