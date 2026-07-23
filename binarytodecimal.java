public class binarytodecimal{
    public static void bintodec(int n ) {
       int pow = 0;
       int sum =0;
       while(n>0){
        int lastdigit = n%10;
        sum = sum+(lastdigit*(int)Math.pow(2, pow));
        pow++;
        n= n/10;
       
        }
        System.out.println(sum);

        }
         public static void main(String[] args) {
        bintodec(111);
      
    }
        
    }
   


