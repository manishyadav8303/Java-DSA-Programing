public class maxsum {
    public static void maxsum(int number[]){
        int currentsum =0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0]; 
                for (int i = 1; i<prefix.length ; i++){
                    prefix[i] = prefix[i-1]+number[i];
                    
                }
        for (int i = 0 ; i<number.length; i++){
            int start = i;
            for (int j = i ; j<number.length; j++){
                int end = j;
                currentsum = start == 0 ? prefix[end] : prefix[end]-prefix[start -1] ;
                // for (int k = start ; k<=end ; k++){
                //     currentsum = currentsum + number[k];
                // }
                // System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum = currentsum;
                }
            }
        }
        System.out.println(maxsum);
    }
    public static void kadanes(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 1 ; i<number.length; i++){
            cs = Math.max(number[i], cs+number[i]);
            // cs = cs+number[i];
            // if (cs<0){
            //     cs = 0;
            // }
            ms = Math.max(cs ,ms);

        }System.out.println(ms);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,5,-3};
        kadanes(number);
    }
    
}
