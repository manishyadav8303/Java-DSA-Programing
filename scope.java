public class scope {
    public static void main(String[] args) {
        int p = 22;
        {
            p = 77;
            
        }
        System.out.println(p);
    }
    
}
