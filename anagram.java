
import java.util.Arrays;

public class anagram {
    public static void main(String[] args){
        String str1 = "RAMU";
        String str2 = "MUAR";
        // CONVERT STRING TO AARAY 
        char[] st1 = str1.toCharArray();
        char[] st2 = str2.toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        if(Arrays.equals(st1, st2)){
            System.out.print("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
    
}
