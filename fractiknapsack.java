import java.util.Arrays;
import java.util.Comparator;

public class fractiknapsack {
    public static void main(String[] args) {
        int val[ ] = {60,100,120};
        int wei[] = {10,20,30};
        int w = 50;
        double ratio[][] = new double[val.length][2];
        // 0-> index \\ 1-> ratio;
        for(int i = 0 ; i<val.length ; i++){
            ratio[i][0]= i;
            ratio[i][1] = val[i]/(double)wei[i];
        }
        // sort in asc
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));
        int capactity = w;
        int finalval = 0;
        for(int i = ratio.length-1 ; i>=0 ; i--){
            int indx = (int)ratio[i][0];
            if(capactity >= wei[indx]){
                finalval += val[indx];
                capactity -= wei[indx];
            }else{
                finalval += ratio[i][1] * capactity;
                capactity = 0;
                break;
            }
        }
        System.out.println(finalval);
    }
}
