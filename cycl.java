import java.util.ArrayList;

public class cycl {
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


    public static boolean circular(ArrayList<edge>[] graph ){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for(int i = 0 ; i<graph.length ; i++){
            if(!vis[i]){
                iscycl(graph , vis , stack , i);
                return  true;
            }
        } 
        return false;
    }
    public static boolean iscycl(ArrayList<edge>[] graph , boolean[] vis , boolean[] stack , int curr){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0 ; i<graph[curr].size() ; i++){
            edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }else if(!vis[e.dest] && iscycl(graph, vis, stack, e.dest)){
                return true;
            }
        }
        stack[curr] = false;
        return  false;
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> [] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(circular(graph));
    }
}
