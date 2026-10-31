import java.util.ArrayList;

public class haspath{
    static class edge{
        int src ; int dest ; int weight;
        public edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    static void creategraph(ArrayList<edge> [] graph){
    for(int i = 0 ; i<graph.length ; i++){
        graph[i] = new ArrayList<>();
    }
    // Vertex 0
graph[0].add(new edge(0, 1, 5));
graph[0].add(new edge(0, 2, 3));

// Vertex 1
graph[1].add(new edge(1, 0, 5));
graph[1].add(new edge(1, 2, 1));
graph[1].add(new edge(1, 3, 3));

// Vertex 2
graph[2].add(new edge(2, 0, 3));
graph[2].add(new edge(2, 1, 1));
graph[2].add(new edge(2, 4, 6));

// Vertex 3
graph[3].add(new edge(3, 1, 3));
graph[3].add(new edge(3, 4, 2));
graph[3].add(new edge(3, 5, 4));

// Vertex 4
graph[4].add(new edge(4, 2, 6));
graph[4].add(new edge(4, 3, 2));
graph[4].add(new edge(4, 6, 7));

// Vertex 5
graph[5].add(new edge(5, 3, 4));
graph[5].add(new edge(5, 6, 8));

// Vertex 6
graph[6].add(new edge(6, 4, 7));
graph[6].add(new edge(6, 5, 8));


  }
  public static boolean haspat(ArrayList<edge> [] graph ,int src , int dest , boolean vis[]){
    if(src == dest){
        return  true;
    }
    vis[src] = true;
    for(int i= 0 ;  i<graph[src].size() ; i++){
        edge e = graph[src].get(i);
        // e.neighbour
        if(!vis[e.dest] && haspat(graph, e.dest, dest, vis)){
            return  true;
        }
    }
    return false;
  }
    public boolean validPath(int n, ArrayList<edge> [] edges, int source, int destination) {
        boolean[] vis = new boolean[n];
        if(source == destination){
            return true;
        }
        vis[source] = true;
        for(int i= 0 ;  i<edges[source].size() ; i++){
            edge e = edges[source].get(i);
            if(!vis[source] && validPath(n , edges , e.destination , destination ) ){
                return true;
            }
        }
        return false;
    }
  public static void main(String[] args) {
    int v = 7;
    ArrayList<edge> [] graph = new ArrayList[v];
    creategraph(graph);
    System.out.println(haspat(graph, 1, 5, new boolean[v]));
  }
}