import java.util.LinkedList;

public class checkAllConnectedNode {
    int vertex;
    LinkedList<Integer> adj[];

    checkAllConnectedNode(int v){
        this.vertex = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList();
        }
    }

    void addedge(int s, int d){
        adj[s].add(d);
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

    //check total number of nodes
    void checkNumber(int s){
        LinkedList<Integer> queue = new LinkedList<>();

        boolean visited[] = new boolean[vertex];


    }


    public static void main(String[] args) {

        checkAllConnectedNode graph = new checkAllConnectedNode(4);
        graph.addedge(0,1);
        graph.addedge(0,2);
        graph.addedge(0,3);
        graph.addedge(1,2);
        graph.addedge(2,3);
        graph.addedge(3,1);

        graph.printgraph();
    }
}
