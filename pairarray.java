public class pairarray {
    public static void pair(int number[]){
        int tp = 0;
        for (int i = 0 ; i<number.length ; i++){
            
            int current = number[i];
            for (int j = i+1 ; j<number.length ; j++){
                System.out.print("("+current+","+number[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+ tp);
    }
    // print subaaray
    
    public static void subaaray(int number[]){
        int ts = 0;
        for (int i = 0 ; i< number.length ; i++){
            int start =i;
            for (int j = i ; j<number.length ; j++){
                int end = j;
                for (int k = start ;  k<=end ; k++){
                    System.err.print(number[k]+" ");
                   

                }
                ts++;
                System.out.println();
            }  
            System.out.println();
        }
        System.out.println("total subarray = "+ts);
    }
    public static void main(String[] args) {
        int number[] ={32,54,76,89,76,65,44};
        // pair(number);
        subaaray(number);
    }
    
}
