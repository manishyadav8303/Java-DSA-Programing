public class palindromestring {
    public static void palindrome(String str){
         int n = str.length();
         for(int i = 0; i<str.length()/2 ; i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.print("it not is a palindome");
                return;
            }
               
            
         }
          System.out.print("it is palindrome");
    }
    public static void main(String[] args) {
        palindrome("noon");
    }
    
}
