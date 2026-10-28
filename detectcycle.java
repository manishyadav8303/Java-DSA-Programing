import java.util.ArrayList;

public class detectcycle {
    static class edge{
        int src ; int dest ; int weight;
        public edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void creategraph(ArrayList<edge> [] graph){
        for(int i= 0 ;i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
    //     // Vertex 0
    // graph[0].add(new edge(0, 0, 0)); // Self-loop
    // graph[0].add(new edge(0, 1, 2));
    // graph[0].add(new edge(0, 2, 4));

    // // Vertex 1
    // graph[1].add(new edge(1, 0, 2));
    // graph[1].add(new edge(1, 3, 5));
    // graph[1].add(new edge(1, 4, 3));

    // // Vertex 2
    // graph[2].add(new edge(2, 0, 4));
    // graph[2].add(new edge(2, 4, 6));
    // graph[2].add(new edge(2, 5, 1));

    // // Vertex 3
    // graph[3].add(new edge(3, 1, 5));
    // graph[3].add(new edge(3, 4, 2));
    // graph[3].add(new edge(3, 6, 7));

    // // Vertex 4
    // graph[4].add(new edge(4, 1, 3));
    // graph[4].add(new edge(4, 2, 6));
    // graph[4].add(new edge(4, 3, 2));
    // graph[4].add(new edge(4, 5, 4));
    // graph[4].add(new edge(4, 6, 3));

    // // Vertex 5
    // graph[5].add(new edge(5, 2, 1));
    // graph[5].add(new edge(5, 4, 4));
    // graph[5].add(new edge(5, 6, 2));

    // // Vertex 6
    // graph[6].add(new edge(6, 3, 7));
    // graph[6].add(new edge(6, 4, 3));
    // graph[6].add(new edge(6, 5, 2));

     graph[0].add(new edge(0, 1, 1));
    graph[1].add(new edge(1, 0, 1));

    graph[0].add(new edge(0, 2, 1));
    graph[2].add(new edge(2, 0, 1));

    graph[1].add(new edge(1, 3, 1));
    graph[3].add(new edge(3, 1, 1));

    graph[1].add(new edge(1, 4, 1));
    graph[4].add(new edge(4, 1, 1));

    graph[2].add(new edge(2, 5, 1));
    graph[5].add(new edge(5, 2, 1));

    graph[5].add(new edge(5, 6, 1));
    graph[6].add(new edge(6, 5, 1));
    }

    public static boolean detectcycles(ArrayList<edge>[] graph ){
        boolean [] vis = new boolean[graph.length];
        for( int i = 0 ; i<graph.length ; i++){
            if(!vis[i]){
                if(detectcycleutil(graph, vis, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectcycleutil(ArrayList<edge>[]graph , boolean[] vis , int curr , int par){
        vis[curr] = true;
        for(int i = 0 ; i<graph[curr].size() ; i++){
            edge e = graph[curr].get(i);
            // case 3 nabour not visted
            // if(!vis[e.dest] && detectcycleutil(graph, vis, e.dest, curr)){
            //     return true;
            // }
            // //case 1 visted nabour but not parent
            // if(vis[e.dest] && e.dest != par){
            //     return true;
            // }
            //case1
            if(e.dest == par){
                continue;
            }
            if(vis[e.dest]){
                return true;
            }
            if(detectcycleutil(graph, vis, e.dest, curr)){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int v = 7;
        boolean[] vis = new boolean[v];
       ArrayList<edge> [] graph = new ArrayList[v];
       creategraph(graph);
       System.out.println(detectcycles(graph));
    }
}
