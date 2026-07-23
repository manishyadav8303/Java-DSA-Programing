import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur no.");
        int n = sc.nextInt();
        boolean prime = true;
        int i = 2;
        for (i = 2 ;  i<=n-1 ; i++){
            if (n%i == 0){
                prime = false;
            }
        }
        if (prime == true){
            System.out.println("prime no");
        }else{
            System.out.println("not prime no");
        }
        
    }
    
}
