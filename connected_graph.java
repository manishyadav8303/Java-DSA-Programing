import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class connected_graph {
     static class edge{
        int src ; int dest ; int weight;
        public edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void dfs(ArrayList<edge> graph[] ){
        boolean[] visited =new  boolean[graph.length];
        for(int i = 0 ;  i<graph.length ; i++){
            dfsutil(graph, visited , i);
        }
    }
    public static void dfsutil(ArrayList<edge> graph[] , boolean[] visited , int curr){
        System.out.println( curr +" ");
        visited[curr] = true;

        for(int i= 0 ; i<graph[curr].size() ; i++){
            edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfsutil(graph, visited, e.dest);
            }
        }
    }

    public static void bfs(ArrayList<edge> graph[]){
        boolean[] visited = new boolean[graph.length];
        for(int i = 0 ;  i<graph.length ; i++){
            if(!visited[i]){
                bfs(graph);
            }
        }
    }
    public static void bfsutil(ArrayList<edge> graph[] , boolean[] visited){
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visited[curr]){
                System.out.println(curr+" ");
                visited[curr] = true;
                for(int i = 0 ; i<graph[curr].size() ; i++){
                    edge e =  graph[curr].get(i);
                    q.add(e.dest); 
                }
            }
        }
    }
}
