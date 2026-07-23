import java.util.Scanner;

public class lwhilwoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter<n+1){
            sum = sum+counter;
            counter++;
        }
        System.out.println(sum);
    }
    
}
