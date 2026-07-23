public class forloop {
    public static void main(String[] args) {
        int n = 756483;
        int rev = 0;
        while (n>0){
            int lastdigit = n%10;
           
            rev = (rev*10)+lastdigit;
            n /= 10;
        }
        System.out.println(rev);

//         int n = 677952;
//         int rev =0;

//         while(n>0){
//             int reverse = n%10;
//             rev = (rev*10)+reverse;
//             n = n/10;
//             System.out.println(rev);
            
//         }
//         // System.out.println();
        }
    }
    

// public class JavaBasics {

// public static void main(String args[]) {
// int n = 10899;
// int rev = 0;
// while(n > 0) {
// int lastDigit = n % 10;
// rev = (rev*10) + lastDigit;
// n = n/10;

// }
// System.out.println(rev);
// }
// }