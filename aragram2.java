import java.util.Arrays;

public class aragram2 {
    public static boolean aragram(String str1 , String str2){

        // remove and convert to lower case

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String str1 = "Ramu";
        String str2 = "muar";
        System.out.println(aragram(str1, str2));
    }
    
}
