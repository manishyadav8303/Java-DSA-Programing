import java.util.Scanner;

public class continueloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

    do { 
        System.out.print("enter ur no.");
        int n = sc.nextInt();
        if (n %10 == 0){
            continue;
        }
        System.out.println("ur no. is" + n);
    }
    while(true);
}
    }

