import java.util.Scanner;

public class pattern2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of pattern line ");
        int n = sc.nextInt();
        // for(int i =n ; i>=1; i--){
        //     for(int star = 1 ; star<=i;star++){
        //         System.out.print("*");
        //     }
        for(int i =1 ; i<=n; i++){
            for(int star = 1 ; star<=n-i+1;star++){
                System.out.print("*");
        }
            System.out.println(); // it if for alfter complete every line move to next line 
        }
    }
    
}
    
