public class towerofhanoii {
    public static void hanoooi(int n , String source , String helper , String destination){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        hanoooi(n-1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        hanoooi(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoooi(n, "S","H", "D");
    }
}
