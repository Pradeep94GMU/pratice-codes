public class Primalgorithm {
    static final int V = 5;
    static int minindex(int key[], boolean mst[]){
        //this funtion return the minimun index value from the key[]
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for(int vertex = 0 ; vertex < V; vertex++){
            if(mst[vertex] == false && key[vertex] < min){
                 min = key[vertex];
                min_index = vertex;
            }
        }
        return min_index;
    }
    static void printPrim(int parent[], int graph[][]){
        int sum = 0;
        //last part is very simple...
        for(int i = 1; i < V; i++){
            System.out.print(parent[i]+" - "+i+" == " + graph[i][parent[i]]+" ");
            sum = sum + graph[i][parent[i]];
            System.out.println();
        }
        System.out.println("Total cost of MST: "+sum);
    }
    void primalgo(int graph[][]){
        //the algorithm uses 3 array data structure
        //1st one is for storing the key value(this include the weight of vertices also we need min value for index
        int key[] = new int[V];
        //2nd array is used for tracking the visited vertes
        boolean mst[] = new boolean[V];
        //3rd is use to store the parent linked vertex
        int parent[] = new int[V];
        //at begining i need to intialize the key and mst as some value
        for(int i = 0; i < V; i++){
            key[i] = Integer.MAX_VALUE;
            mst[i] = false;
        }
        //now one more last thing to left before doing the step
        //take a starting vertex
        key[0] = 0;
        parent[0] = -1;
        //now we can start the steps
        //we need to traverse till number of edges
        for(int edge = 0; edge < V - 1; edge++){
            int parentIndex = minindex(key, mst); //this step is still need to learn  //x store the index value of minimun element of key[]
            mst[parentIndex] = true;
            //now traverse all adjancy vertex of x
            for(int adjvert = 0; adjvert < V; adjvert++ ){
                if(mst[adjvert] == false && graph[parentIndex][adjvert] != 0 && graph[parentIndex][adjvert] < key[adjvert]){

                    key[adjvert] = graph[parentIndex][adjvert];
                    parent[adjvert] = parentIndex;
                }
            }
        }
        printPrim(parent, graph);
    }
    public static void main(String[] args) {

        //define the obj
        Primalgorithm p = new Primalgorithm();
    //take one matric
        int graph[][] = new int[][] {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        p.primalgo(graph);
    }
}
