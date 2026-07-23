import java.util.Scanner;

public class tax_calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        // int Tax;

        if(Income<=500000){
            System.out.println(Income);
        }
        else if (Income>500000 && Income < 1000000){
            System.out.println(Income*.2);
        }
        else{
            System.out.print(Income*.3);
        }
    }
    
}
