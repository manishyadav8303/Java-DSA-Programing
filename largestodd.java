public class largestodd {
    public static int kthlargeodd(int l , int r , int k){
        if(r%2 == 0){
            r--;
        }
        int ans = r-2*(k-1);
        if(l>ans){
            return 0 ;
        }
        return ans;
    }
}
