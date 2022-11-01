import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Topo {
    static int V;
    static ArrayList<ArrayList<Integer>> adj;

    Topo(int v){
        this.V = v;
        adj = new ArrayList<>(v);
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
    }

    static void addedge(int s, int d){
        adj.get(s).add(d);
    }

    void topoutil(int v, boolean visited[], Stack<Integer> s){
        visited[v] = true;

        //now visit the adjence veticex... using Iterator
        Iterator<Integer> i = adj.get(v).iterator();
        while(i.hasNext()){
            int u = i.next();
            if(visited[u] == false){
                topoutil(u, visited, s);
            }
        }
        s.push(v);
    }
    void topoo(){

        Stack<Integer> s = new Stack<>();

        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            visited[i] = false;
        }

        for(int i = 0; i < V; i++ ){
            if(visited[i] == false){
                topoutil(i, visited, s);
            }
        }
        //once all operation done... print stack data
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }


    public static void main(String[] args) {

        Topo graph = new Topo(6);

        addedge(2,3);
        addedge(3,1);
        addedge(4,0);
        addedge(4,1);
        addedge(5,0);
        addedge(5,2);

        for(int vertex = 0; vertex < adj.size(); vertex++){
            System.out.print("For vertex: "+vertex+" ");
            for(int ad = 0; ad < adj.get(vertex).size(); ad++ ){
                System.out.print(" -> "+adj.get(vertex).get(ad));
            }
            System.out.println();
        }

        //now perferming topo
        graph.topoo();

    }
}
