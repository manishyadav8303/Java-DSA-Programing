import java.util.ArrayList;
import java.util.Stack;

public class topology_sort {
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

    public static void toposort(ArrayList<edge> [] graph){
        boolean[] vis= new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ;  i<graph.length ; i++){
            if(!vis[i]){
                toposortutil(graph , s , vis , i);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() +" ");
        }
    }
    public static void toposortutil(ArrayList<edge> [] graph , Stack s , boolean[] vis  , int curr){
        vis[curr] = true;
        for(int i = 0 ; i<graph[curr].size() ; i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                toposortutil(graph, s, vis, e.dest);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> [] graph = new ArrayList[v];
        creategraph(graph);
        toposort(graph);
    }
}
