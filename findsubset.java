public class findsubset {
    public static void subsetfind(String str , String ans , int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        // add
        subsetfind(str, ans+str.charAt(i), i+1);
        // not add
        subsetfind(str, ans, i+1);
    }
//---------------------------------------------------------------------------

    // public static void subsetint(int num[], int i , int ans){
    //     if(i==num.length){
    //         System.out.println(ans);
    //         return;
    //     }
    //     // add
    //     subsetint(num, i+1, ans+num[i]);
    //     //not add
    //     subsetint(num, i+1, ans);
    //}
//---------------------------------------------------------------------------
    // Wrong approach
//---------------------------------------------------------------------------

    public static void main(String[] args) {
       String str = "abc";
       subsetfind(str, "", 0);
//---------------------------------------------------------------------------

    //    int num[] = {};
    //    subsetint(num, 0, 0);
//---------------------------------------------------------------------------

    }
}

