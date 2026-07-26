public class substring {
    public static String subStr(String word , int str , int end){
        String subword = " ";
        for(int i = str ; i<end;  i++){
            subword += word.charAt(i);
        }
        return subword;
    }
public static void main(String[] args) {
    String word = "RAM is a good boy";
   // System.out.print(subStr(word, 0, 6));

   // inbuit in java
   
   System.out.print(word.substring( 0 , 6));
}
    
}
