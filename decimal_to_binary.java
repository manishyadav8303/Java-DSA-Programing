public class decimal_to_binary {
    public static void dectobin(int n){
        // int binNum = 0;  
        // int pow = 0;   
        // while(n>0){
        //     int rem = n%2;
        //     binNum = binNum +( rem * (int)Math.pow(10,pow));
        //     pow++;
        //     n= n/2;
        int binNum=0;
        int pow=0;
        int lastdigit=0;
        while(n>0){
            lastdigit = n%2;
            binNum = binNum+(lastdigit *(int)Math.pow(10, pow));
            pow++;
            n = n/2;
       

        }
        System.out.print(binNum);
    }
    public static void main(String[] args) {
        dectobin(7);
    }
    
}
