public class Lexicographically_smallest_string {
    public static String smallst(int n , int k){// k = sum
        char ans[] = new char[n];
        for(int i = 0 ; i<n ; i++){
            ans[i] = "a";
        }
        int remain = k-n;
          for (int i = n- 1; i >= 0; i--) {

// ek character me hm max 25 add kr skhte hai
            int add = Math.min(remain, 25);
            // like a+22 = w
            ans[i] = (char) (ans[i] + add);

            remaining -= add;
    }
}
