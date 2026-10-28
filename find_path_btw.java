import java.util.ArrayList;

public class find_path_btw {
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
graph[0].add(new edge(0, 2, 1));

graph[1].add(new edge(1, 3, 1));
graph[1].add(new edge(1, 4, 1));

graph[2].add(new edge(2, 4, 1));
graph[2].add(new edge(2, 5, 1));

graph[3].add(new edge(3, 6, 1));
graph[4].add(new edge(4, 6, 1));
graph[4].add(new edge(4, 7, 1));

graph[5].add(new edge(5, 7, 1));
graph[6].add(new edge(6, 8, 1));
graph[7].add(new edge(7, 8, 1));

graph[8].add(new edge(8, 9, 1));
    graph[4].add(new edge(4, 5, 1));
      
    }

    public static void path(ArrayList<edge> [] graph , int src , int des , String path){
        if(src== des){
            System.out.println(path+des);
        }
        for(int i = 0 ; i<graph[src].size() ; i++){
            edge e = graph[src].get(i);
            path(graph, e.dest, des, path+src);
        }
    }
    public static void main(String[] args) {
        int v = 10;
        ArrayList<edge> [] graph = new ArrayList[v];
        creategraph(graph);
        path(graph, 0, 9, " ");
    }
}
