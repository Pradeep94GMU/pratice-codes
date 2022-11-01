import java.util.ArrayList;

public class algraph {

    static void addedge(ArrayList<ArrayList<Integer>> am, int s, int d){
        am.get(s).add(d);
        am.get(d).add(s);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(5);

        for(int i = 0; i < V; i++){
            am.add(new ArrayList<Integer>());
        }

        addedge(am, 0, 1);
        addedge(am, 0, 2);
        addedge(am, 0, 3);
        addedge(am, 1, 2);

        printgraph(am);
        //System.out.println(am);

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
