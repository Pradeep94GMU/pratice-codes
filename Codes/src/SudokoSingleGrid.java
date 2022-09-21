import java.util.*;

public class SudokoSingleGrid {
    public static void main(String[] args) {

        int grid[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int flag = 0;
        //i will keep everything in list first
        //as it is just asking for true or false.. then keep in list
        List<Integer> al = new ArrayList<>();
        //always define the size of matrix = 3 * 3
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                al.add(grid[i][j]);
            }
        }
        System.out.println(al);

 // there is simple approch to check for all unique element in list..
        //Approch is : make a copy of list in set and as set it will remove all duplicates if any, then you
        //can compare the length of list and set.. it there are not equal then its duplciate
        Set<Integer> s = new HashSet<>(al);
        //now i am comparing both set and list size which boolean datatype which will return me true or false
        boolean res = (s.size() == al.size());
        System.out.println(res);

    }
}
