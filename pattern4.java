import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of pattern line  ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i =1 ; i<=n; i++){
            for (int cha = 1 ; cha<=i; cha++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    
}
}