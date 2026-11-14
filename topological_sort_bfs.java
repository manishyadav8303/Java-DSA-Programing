import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topological_sort_bfs {
     static class edge{
        int src ; int dest ; int wei;
        public edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wei = w;
        }
    }
    public static void creategraph(ArrayList<edge> [] graph){
        for(int i = 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
    //      graph[0].add(new edge(0, 1, 1));
    // graph[1].add(new edge(1, 2, 1));
    // graph[2].add(new edge(2, 3, 1));
    // graph[3].add(new edge(3, 0, 1)); // Cycle completes

    // graph[2].add(new edge(2, 4, 1));
    // graph[4].add(new edge(4, 5, 1));

     graph[0].add(new edge(0, 1, 1));
    graph[0].add(new edge(0, 3, 1));

    graph[1].add(new edge(1, 2, 1));
    graph[1].add(new edge(1, 4, 1));

    graph[3].add(new edge(3, 4, 1));

    graph[4].add(new edge(4, 5, 1));
    }
    public static void calculateddegree(ArrayList<edge> [] graph , int[] degree){
        for(int i = 0 ; i<graph.length ; i++){
            int v = i;
            for(int j = 0 ; j<graph[v].size() ; j++){
                edge e= graph[v].get(j);
                degree[e.dest]++;
            }
        }
    }
    public static void bfs(ArrayList<edge> [] graph){
        int [] degree = new int[graph.length];
        calculateddegree(graph, degree);
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i<degree.length ; i++){
            if(degree[i]==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i = 0 ; i<graph[curr].size() ;  i++){
                edge e = graph[curr].get(i);
                degree[e.dest]--;
                if(degree[e.dest]==0){
                    q.add(e.dest);
                }
                
            }
        }
        System.out.println();
    }
        public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> [] graph = new ArrayList[v];
        creategraph(graph);
        bfs(graph);
        }
}
