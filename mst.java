import java.util.ArrayList;
import java.util.PriorityQueue;

public class mst {
    static class edge{
        int src ; int dest ; int wt;
        public  edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static class  pair implements Comparable<pair> {
        int v , cost;
        public pair(int v , int c){
            this.v = v;
            this.cost=c;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost - p2.cost;
        }
        
    }
    public static void mst(ArrayList<edge> graph[] ){
        boolean [] vis = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0, 0));
        int finalcost = 0;
        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]= true;
                finalcost += curr.cost;
                for(int i = 0 ; i<graph[curr.v].size() ; i++){
                    edge e = graph[curr.v].get(i);
                    pq.add(new pair(e.dest, e.wt));
                }
            }
        }
        System.out.println(finalcost);
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i = 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 4));
    graph[0].add(new edge(0, 2, 3));

    graph[1].add(new edge(1, 0, 4));
    graph[1].add(new edge(1, 2, 1));
    graph[1].add(new edge(1, 3, 2));

    graph[2].add(new edge(2, 0, 3));
    graph[2].add(new edge(2, 1, 1));
    graph[2].add(new edge(2, 3, 4));
    graph[2].add(new edge(2, 4, 5));
        graph[3].add(new edge(3, 1, 2));
    graph[3].add(new edge(3, 2, 4));
    graph[3].add(new edge(3, 4, 2));
    graph[3].add(new edge(3, 5, 3));

    graph[4].add(new edge(4, 2, 5));
    graph[4].add(new edge(4, 3, 2));
    graph[4].add(new edge(4, 5, 6));

    graph[5].add(new edge(5, 3, 3));
    graph[5].add(new edge(5, 4, 6));
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        creategraph(graph);
        mst(graph);
    }
    
}
