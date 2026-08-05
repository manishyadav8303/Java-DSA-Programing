public class reversestring {
    public static void revstr(String str , int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        
        System.out.print(str.charAt(idx));
        revstr(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "aaabajaan";
        revstr(str, str.length()-1);
    }
}
