import java.util.Scanner;

public class odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how much no. you want to give input ");
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int num;
        int i;
        for (i=1; i <=n ; i++){
            System.out.println("Enter no "+i);
            num = sc.nextInt();

        if (num % 2== 0 ){
            evensum = evensum +num;
        }else{
            oddsum = oddsum +num;
        }
    }
        System.out.println("Sum of even no is " + evensum);
        System.out.println("Sum of odd no is "  +oddsum);
    }
    
}
