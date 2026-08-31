import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class chcoclate {
    public static void main(String[] args) {
        int n = 4 , m=6;//min cut like it tell size
        Integer vertcut[] = {2,1,3,1,4};
        Integer horizontalcut[] = {4,1,2};

        Arrays.sort(vertcut , Collections.reverseOrder());
        Arrays.sort(horizontalcut , Collections.reverseOrder());
        int h = 0 , v =0;
        int hp = 1 , Vp = 1 ; // peices 
        int cost = 0;
        while(v<vertcut.length && h<horizontalcut.length){
            if(vertcut[v] <= horizontalcut[h]){
                cost += horizontalcut[h]*Vp;
                hp++;
                h++;
            }else{
                cost += vertcut[v]*hp;
                Vp ++;
                v++;
            }
        }
        while (v<vertcut.length) {
            cost += vertcut[v]*hp;
            Vp++;
            v++;
        }
        while(h<horizontalcut.length){
            cost+= horizontalcut[h]*Vp;
            hp++;
            h++;
        }
        System.out.println(cost);
        
    }
}
