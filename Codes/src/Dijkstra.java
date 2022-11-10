import java.util.Arrays;

public class Dijkstra {
    static int V = 9;

    int minVertex(int disstance[], boolean visited[]){

        int minCostVertex = -1;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < V; i++){
            if(visited[i] == false && disstance[i] <= min){
                min = disstance[i];
                minCostVertex = i;
            }
        }
        return minCostVertex;
    }
    void dijCode(int graph[][], int src){
        //the main logic is Relaxation
        //we need some basic things
        //visited arr, res arr and start vertex as 0 value

        int dist[] = new int[V];

        boolean visited[] = new boolean[V];

        for(int i = 0; i < V; i++){
            //i need to set all vertex value as false and cost as infinity
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[src] = 0;


        //now traverse to all the vertex
        for(int av = 0; av < V - 1; av++ ){
            //this  value will store the minimum value
            int u = minVertex(dist, visited);
            //this is traversing after getting to know that i have a minimum value wala vertex
            //so before this relaxation i need to find the minumum value wala vertex u

            visited[u] = true;
            for(int AdjV = 0; AdjV < V; AdjV++){
                //this is where i need to use relaxation
                if(!visited[AdjV] && graph[u][AdjV] != 0 &&
//                    dist[u] != Integer.MAX_VALUE &&
                    dist[u] + graph[u][AdjV] < dist[AdjV]){
                    dist[AdjV] = dist[u] + graph[u][AdjV];
                }
            }
        }

       printGraph(dist);
    }

    static void printGraph(int dist[]){
        System.out.println("vertex \t\t cost of distance");
        for(int i = 0; i < V; i++){

            System.out.println(i +"\t\t"+ dist[i]);
        }
    }
    public static void main(String[] args) {

        int[][] graph
                = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
    Dijkstra g = new Dijkstra();

    g.dijCode(graph, 0);


    //time complexity = |V|^2   // as we are checking max vertex twice6
    //space complixty = |V|

    }
}
