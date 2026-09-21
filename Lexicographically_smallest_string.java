public class Lexicographically_smallest_string {

    public static String smallest(int n, int k) {

        char[] ans = new char[n];

        for (int i = 0; i < n; i++) {
            ans[i] = 'a';
        }

        int remain = k - n;

        for (int i = n - 1; i >= 0; i--) {

            int add = Math.min(remain, 25);

            ans[i] = (char) (ans[i] + add);

            remain -= add;
        }

        return new String(ans);
    }
    public static String smalle(int n , int k){
        char ans[] = new char[n];
        for(int i = 0 ; i<n ; i++){
            ans[i]='a';
        }
        int remain = k-n;
        for(int i = n-1 ; i>=0 ; i--){
            int add = Math.min(remain, 25);
            ans[i] = (char)(ans[i]+add);
            remain -= add;
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        System.out.println(smalle(5, 73));
    }
}