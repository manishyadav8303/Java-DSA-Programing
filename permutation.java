public class permutation {
    public static void permu(String str , String ans){
        //base(
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i<str.length() ;i++){
            char curr = str.charAt(i);

            String Newstr = str.substring(0, i)+str.substring(i+1 , str.length());
            permu(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permu(str, "");
    }
    
}
