import java.util.Iterator;
import java.util.LinkedList;

public class BFSImplementation {
    int vertex;
    LinkedList<Integer> adj[];

    BFSImplementation(int v){
        this.vertex = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList();
        }
    }

    void addedge(int s, int d){
        adj[s].add(d);
    }

    void BFS(int s){
        //it uses queue data struct-> using linkedlist
        LinkedList<Integer> queue = new LinkedList<>();
        //to apply termination we need a visited array -- boolean datatype
        //by default it is set as false
        boolean visited[] = new boolean[vertex];

        //the basic setup
        //add starting vertex into queue
        //set the starting vertex as true
        visited[s] = true;
        queue.add(s);


        while(!queue.isEmpty()){
            int n = queue.poll();
            System.out.print(n+" ");
            Iterator<Integer> i = adj[n].listIterator();

            while(i.hasNext()){
                //we check each list element and confirm it visited or not then only insert to queue
                int x = i.next();
                if(!visited[x]) {

                    visited[x] = true;
                    queue.add(x);
                }

            }

        }

    }


    void printgraph(){
        for(int i = 0; i < adj.length; i++){
            System.out.print("For vertex "+i+" ");
            for(int j = 0; j < adj[i].size(); j++){
                System.out.print("-> "+adj[i].get(j));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        BFSImplementation graph = new BFSImplementation(4);
        graph.addedge(0,1);
        graph.addedge(0,2);
        graph.addedge(0,3);
        graph.addedge(1,2);
        graph.addedge(2,3);
        graph.addedge(3,1);

        graph.printgraph();

        graph.BFS(1);
    }
}
