import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of pattern line  ");
        int n = sc.nextInt();
        for (int i =1 ; i<=n; i++){
            for (int number = 1; number<=i; number++){
                System.out.print(number);
            }
            System.out.println();
        }


    
}
}