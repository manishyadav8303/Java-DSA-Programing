public class swapwitout3rdvariable {
    public static void main(String[] args){
        int a = 12 , b = 13;
 // swap

        a = a^b;
        b= a^b;
        a=a^b;

        System.out.println(a  +" ,"+ b );

    }
}
