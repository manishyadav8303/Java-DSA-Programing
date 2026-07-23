import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of pattern line ");
        int n = sc.nextInt();
        for(int i =1 ; i<=n; i++){
            for(int star = 1 ; star<=i;star++){
                System.out.print("*");
            }
            System.out.println(); // it if for alfter complete every line move to next line 
        }
    }
    
}
