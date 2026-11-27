import java.util.ArrayList;

public class leet1376 {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i= 0 ; i<n ; i++){
            if(manager[i] != -1){
                graph.get(manager[i]).add(i);
            }
        }
        return dfs(graph, headID, informTime);
    }
    public int dfs(ArrayList<ArrayList<Integer>> graph , int curr , int[] informTime){
        int maxtime = 0;
        for(int neig: graph.get(curr)){
            maxtime= Math.max(maxtime, dfs(graph, neig, informTime));
        }
        return maxtime+informTime[curr];
    }
}//end
