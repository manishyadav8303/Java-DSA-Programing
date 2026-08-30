import java.util.ArrayList;

public class activityselection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9 };
        ArrayList<Integer> ans = new ArrayList<>();
        int maxActi = 0;
        // 1st activity
        maxActi = 1;
        ans.add(0);
        int lastend = end[0];
        for(int i = 0 ; i<end.length ; i++){
            if(start[i] >= lastend){
                //activity sele
                maxActi++;
                ans.add(i);
                lastend = end[i];
            }
        }
        System.out.println("maxacttivity = "+ maxActi);
        for(int i = 0 ; i<ans.size() ; i++){
            System.out.print("A"+ans.get(i) + " ");
        }
        System.out.println();
    }
}
