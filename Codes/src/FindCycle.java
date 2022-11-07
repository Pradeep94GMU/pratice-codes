import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Iterator;

public class FindCycle {
    static int V;
    static ArrayList<ArrayList<Integer>> adj;

    FindCycle(int v){
        this.V = v;
        adj = new ArrayList<>(v);
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
    }

    static void addedge(int s, int d){
        adj.get(s).add(d);
        //adj.get(d).add(s);
    }

    static void DFScycle(int v, boolean visited[]){
        visited[v] = true;

        Iterator<Integer> i = adj.get(v).iterator();
        while(i.hasNext()){
            int u = i.next();
            if(visited[u] == true){
                System.out.println("It has a cycle");
                return;
            }
            else{
                visited[u] = true;
                DFScycle(u, visited);
            }
        }

    }

    //now the logic part of finding cycle in graph
    static void cycle(){
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            visited[i] = false;
        }

        for(int i = 0; i < V; i++){
            if(visited[i] == true){
                System.out.println("It has a cycle");
                return;
            }
            else{
                DFScycle(i, visited);
            }
        }
        System.out.println("Graph Contain No cycle/....Yesss");
        return;
    }

    public static void main(String[] args) {
        FindCycle graph = new FindCycle(7);

        addedge(0,1);
        addedge(1,4);
        addedge(1,2);
        addedge(1,5);
        addedge(2,3);
        addedge(4,7);
        addedge(5,6);


        //System.out.println(graph.adj);

        for(int i = 0; i < adj.size(); i++){
            System.out.print("index :"+i+" ");
            for (int j = 0; j < adj.get(i).size(); j++){
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }

        cycle();

    }
}
