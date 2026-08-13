public class gridway {
    public static int grid(int n , int m , int i , int j){
      // base
      if(i==n-1|| j== m-1){
        return 1;
      }else if(i == n || j==m){
        return 0;
      }
    // down
    int w1 =grid(n, m, i+1, j);
    int w2 =grid(n, m, i, j+1);

    return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3 , m= 3;
        System.out.println(grid(n, m, 0, 0));

    }
}
