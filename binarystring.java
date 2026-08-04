public class binarystring {
    public static void stringpair(int n , int lastdsigit , String str){
        //base condition
        if(n==0){
            System.out.println(str);
            return;
        }
        
        //kaam
        // if (lastdsigit == 0) {

        //     stringpair(n-1, 0, str+"0");
        //     stringpair(n-1, 1, str+"1");
            
        // }else{

        //     stringpair(n-1, 0, str+"0");
        // }
        stringpair(n-1, 0, str+"0");
        if(lastdsigit == 0){
            stringpair(n-1, 1, str +"1");
        }
    }

    public static void main(String[] args) {
        stringpair(3, 0, "");
    }
}
