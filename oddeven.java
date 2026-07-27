public class oddeven {
    public static void bitmanuplating(int x) {
        int bitmask = 1;
        if((x & bitmask) == 0){
            System.out.println("even no");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        bitmanuplating(3);
        bitmanuplating(56);
    }
}
