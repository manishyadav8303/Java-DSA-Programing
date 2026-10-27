import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bipartitte_graph {
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
    //    graph[0].add(new edge(0, 3, 1));
    // graph[3].add(new edge(3, 0, 1));

    // graph[0].add(new edge(0, 4, 1));
    // graph[4].add(new edge(4, 0, 1));

    // graph[1].add(new edge(1, 3, 1));
    // graph[3].add(new edge(3, 1, 1));

    // graph[1].add(new edge(1, 5, 1));
    // graph[5].add(new edge(5, 1, 1));

    // graph[2].add(new edge(2, 4, 1));
    // graph[4].add(new edge(4, 2, 1));

    // graph[2].add(new edge(2, 5, 1));
    // graph[5].add(new edge(5, 2, 1));
    graph[0].add(new edge(0, 1, 1));
    graph[1].add(new edge(1, 0, 1));

    // Vertex 1
    graph[1].add(new edge(1, 2, 1));
    graph[2].add(new edge(2, 1, 1));

    // Vertex 2
    graph[2].add(new edge(2, 0, 1));
    graph[0].add(new edge(0, 2, 1));
    }

    public static boolean isbipartitte(ArrayList<edge> [] graph){
        Queue<Integer> q = new LinkedList<>();
        int clor[] = new int[graph.length];
        for(int i = 0 ; i<clor.length ; i++){
            clor[i] = -1;
        }
        for(int i = 0 ; i< graph.length ; i++){
            if(clor[i]== -1){ // no color 
                q.add(i);
                clor[i] = 0;
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j = 0 ; j < graph[curr].size() ; j++){
                        edge e = graph[curr].get(j);
                        if(clor[e.dest] == -1){
                            int nextcol = clor[curr] == 1 ? 0:1;
                            clor[e.dest] = nextcol;
                            q.add(e.dest);
                        }else if(clor[e.dest] == clor[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //int v = 6;
        int v = 3;
        ArrayList<edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(isbipartitte(graph));
    }
}
