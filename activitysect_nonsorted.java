import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitysect_nonsorted {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        //sorting
        int activites[][] = new int[start.length][3];
        for(int i = 0 ; i<start.length ; i++){ 
            activites[i][0] = i;
            activites[i][1]= start[i];
            activites[i][2] = end[i];
        }
        //lambda function to sort
        Arrays.sort( activites ,  Comparator.comparingDouble(o -> o[2]));
        //
        ArrayList<Integer> ans = new ArrayList<>();
        int maxActi = 0;
        // 1st activity
        maxActi = 1;
        ans.add(activites[0][0]);
        int lastend = activites[0][2];
        for (int i = 0; i < end.length; i++) {
            if (activites[i][1] >= lastend) {
                // activity sele
                maxActi++;
                ans.add(activites[i][0]);
                lastend = activites[i][2];
            }
        }
        System.out.println("maxacttivity = " + maxActi);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
