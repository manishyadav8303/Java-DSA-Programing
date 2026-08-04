public class tilingproblrm {
    public static int tilingproblem(int n ){
        if(n==0 || n==1 ){
            return 1;
        }

        // vertical

        int vertical = tilingproblem(n-1);

        // hor

        int hori = tilingproblem(n-2);

        int total = vertical+hori;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(tilingproblem(4 ));
    }
    
}
