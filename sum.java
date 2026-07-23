import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        float sum = a+b+c;
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // int c= sc.nextInt();
        // int average = (a+b+c)/3;
        //float area = (3.17f * radius * radius );
        System.out.println(sum);
        float gst = (sum*18)/100;
        float total = gst+sum;
        System.out.print(total);


       
    }
    
}
