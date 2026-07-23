public class bimary_to_decimal {
    public static void binarytodecimal(int binNum){
        int decNum = 0;
        int pow = 0;
        int myno = binNum;
        while (binNum>0){
            int lastdigit = binNum%10;
            decNum = decNum +(lastdigit * (int) Math.pow(2, pow));
            pow ++;
            binNum = binNum  / 10;
        }
        System.out.print("decimal of "+ myno+" ="+decNum);

    }
    public static void main(String[] args) {
        binarytodecimal(101001);
    }
    
}
