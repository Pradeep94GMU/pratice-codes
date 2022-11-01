import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class DFSImplementation {

    static ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(5);

    static int V ;
    static LinkedList<Integer> adj[];

    DFSImplementation(int v){
        this.V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < V; i++){
            adj[i] = new LinkedList();
        }
    }

    static void addedge(int s, int d){
        adj[s].add(d);
        am.get(s).add(d);
    }


    static void dfsutil(int v, boolean visited[]){
        //logic: i have one arbitary vertex
        visited[v] = true;
        System.out.print(v+" ");

        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(visited[n] == false){
                dfsutil(n, visited);
            }
        }
    }

    static void dfs(int v){
        boolean visited[] = new boolean[V];
        dfsutil(v,visited);
    }


    public static void main(String[] args) {
        DFSImplementation graph = new DFSImplementation(4);

        for(int i = 0; i < V; i++){
            am.add(new ArrayList<Integer>());
        }


        addedge(0,1);
        addedge(0,2);
        addedge(0,3);
        addedge(1,2);
        addedge(1,3);
        addedge(2,3);


        printgraph(am);

        System.out.println("DFS Traversal of "+2+":");
        graph.dfs(2);
    }

    static void printgraph(ArrayList<ArrayList<Integer>> am){
        for(int i = 0; i < am.size(); i++){
            System.out.print("For vertex "+ i+" :");
            for(int j = 0; j < am.get(i).size(); j++){
                System.out.print(" -> "+am.get(i).get(j));
            }
            System.out.println();
        }
    }
}
