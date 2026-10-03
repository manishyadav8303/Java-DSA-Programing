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
public static void tower(int n , String source , String help , String destina){
    if(n==1){
        System.out.println(n+"-->"+ source+"---->"+destina );
        return ;
    }
    tower(n-1, source,destina, help );
    System.out.println(n+"--->"+source+"---->"+destina);
    tower(n-1, source, help, destina);
}
    public static void main(String[] args) {
        int n = 3;
      // hanoooi(n, "S","H", "D");
       tower(n, "S", "H", "D");
    }
}
