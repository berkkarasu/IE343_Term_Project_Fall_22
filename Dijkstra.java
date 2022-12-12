import java.util.ArrayList;
public class Dijkstra {
    private int[][] graph;
    private ArrayList<Integer> Q;
    private int[] dist;
    private int[] prev;

    public Dijkstra(int[][] graph){
        this.graph = graph;
        this.Q = new ArrayList<Integer>();
        this.dist = new int[this.graph[0].length];
        this.prev = new int[this.graph[0].length];
        for (int i=0;i<dist.length;i++){
            dist[i] = Integer.MAX_VALUE;
        }
    }

    private int findMinNode(){
        int minNode = -1;
        int minDist = Integer.MAX_VALUE;

        for (int node : this.Q){
            if (this.dist[node] <= minDist){
                minNode = node;
                minDist = this.dist[node];
            
            }
        }
        return minNode;
    }

    public int solve(int src, int dest){
        for (int i=0;i<this.graph[0].length;i++){
            this.Q.add(i);
        }
        
        this.dist[src] = 0;
                
        while (!this.Q.isEmpty()){ //this.Q.isEmpty() != 0
            int u = findMinNode();
            this.Q.remove(Integer.valueOf(u));
            if (this.dist[u] == Integer.MAX_VALUE){
                break;
            }

            for (int v = 0; v<this.graph[0].length; v++){
                if (this.Q.contains(Integer.valueOf(v))){
                    if (this.graph[u][v] <= 0){
                        continue;
                    }
                    else{
                        int alt = this.dist[u] + this.graph[u][v];

                        if (alt < this.dist[v]){
                            this.dist[v] = alt;
                            this.prev[v] = u;
                        }
                    }
                }
            }
        }
        return this.dist[dest];
    }

    public void printPath(int src, int dest){
        if (this.dist[dest] == Integer.MAX_VALUE){
            System.out.println("No path exists!");
        }
        else{
            ArrayList<Integer> path = new ArrayList<Integer>();
            int u = dest;
            while (u != src){
                path.add(u);
                u = this.prev[u];
            }
            path.add(this.prev[u]);
            for (int i = path.size()-1;i>0;i--){
                System.out.print(path.get(i)+" -->");
            }

            System.out.println(path.get(0));
        }
    }

}
