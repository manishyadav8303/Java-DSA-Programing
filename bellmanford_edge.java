import java.util.ArrayList;

public class bellmanford_edge {
     static class edge{
        int src ; int dest ; int wt;
        public  edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void creategraph(ArrayList<edge> graph){
        graph.add(new edge(0, 1, 4));
        graph.add(new edge(0, 2, 5));

       graph.add(new edge(1, 2, -2));
        graph.add(new edge(1, 3, 6));

        graph.add(new edge(2, 3, 3));

        graph.add(new edge(3, 4, 4));
    }
    public static void bellmanford(ArrayList<edge> graph, int src , int V){
        int dist[] = new int[V];
        for(int i = 0 ;  i<dist.length ; i++){
            if(i != src ){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int j = 0 ; j<V-1 ; j++){
            for(int k = 0 ; k<graph.size() ; k++){
                edge e = graph.get(k);
                int u = e.src;
                int v = e.dest;
                int w = e.wt; 
                // relaxation
                if(dist[u] != Integer.MAX_VALUE && dist[u]+w <dist[v]){
                    dist[v] = dist[u]+w;
                }
            }
        }
        for(int i = 0 ; i< dist.length; i++){
            System.out.print(dist[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph =new ArrayList<>();
        creategraph(graph);
        bellmanford(graph, 0 , v);
    }
}

