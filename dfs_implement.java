import java.util.ArrayList;

public class dfs_implement {
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
  public static void dfs(ArrayList<edge> [] graph , int curr , boolean[] visted){
    //visited
    System.out.print(curr+" ");
    visted[curr] = true;
    for( int i = 0 ; i<graph[curr].size() ; i++){
        edge e = graph[curr].get(i);
        if(!visted[e.dest]){
            dfs(graph, e.dest, visted);
        }
    }
  }
  public static void main(String[] args) {
    int v = 7;
    ArrayList<edge> [] graph = new ArrayList[v];
    creategraph(graph);
   dfs(graph, 0, new boolean[v]);
  }
}
