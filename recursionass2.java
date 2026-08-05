class recursionass2{
    static String count[] = { "zero", "one", "two", "three", "four",
    "five", "six", "seven", "eight", "nine"};

    public static void printname(int n){
        if(n==0){
            return;
        }

        int lastDigit = n%10;
        printname(n/10);
        System.out.print(count[lastDigit]+" ");
    }

    public static int lengthstring(String str){

        if(str.length()==0){
            return 0;
        }
        return lengthstring(str.substring(1)) + 1; // remove one by one word and increas the count 

    }

    public static void main(String[] args) {
      //  printname(123);
        String str = "abcde";
System.out.println(lengthstring(str));
    }
}