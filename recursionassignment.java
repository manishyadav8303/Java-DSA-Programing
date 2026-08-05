public class recursionassignment {
    public static  void findkey(int arr[] , int key , int i){
        if(i== arr.length){
            return ;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }

        findkey(arr, key, i+1);

    }

static String digits[] = {"zero", "one", "two", "three", "four", "five", "six",
"seven", "eight", "nine"};
public static void printDigits(int number) {
if(number == 0) {
return;
}
int lastDigit = number%10;
printDigits(number/10);
System.out.print(digits[lastDigit]+" ");
}
public static void main(String[] args) {
printDigits(1234);}
     
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,3,5,3};
    //     int key = 3;
       
    //    findkey(arr, key, 0);
    // }

}
