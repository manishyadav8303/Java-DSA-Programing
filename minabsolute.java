import java.lang.reflect.Array;
import java.util.Arrays;

public class minabsolute {
    public static void main(String[] args) {
        int a[] = {1,3,2};
        int b[]={3,2,1};
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff = 0;
        for(int i = 0 ; i<a.length ; i++){
            mindiff += Math.abs(a[i] - b[i]);
        }

        System.out.println(mindiff);

        
    }
}
