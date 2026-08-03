public class recursionbasic {
    public static void decresing(int n ){
        
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decresing(n-1);
    }

    public static void incresing(int n ){
       if (n==1){
        System.out.print(1+" ");
        return;
       }

       incresing(n-1);
       System.out.print(n+" ");
    }

    public static void increasing2(int i, int n) {
    if (i == n) {
        System.out.print(i);
        return;
    }

    System.out.print(i + " ");
    increasing2(i + 1, n);
}


    public static void main(String[] args) {
        int n = 10;
        //decresing(n);
        // incresing(n);
        increasing2(1, n);
    }
    
}
