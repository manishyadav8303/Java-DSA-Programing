public class friendspairing {
    public static int friendpair(int n ){
        // base condition

        if(n==1 || n==2){
            return n;
        }
        // single

        // int single = friendpair(n-1);
        // // pair

        // int pair = (n-1) * friendpair(n-2);
        // int total = single + pair;

        // return total;
        return friendpair(n-1) + (n-1)*friendpair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendpair(3));
    }
    
}  
