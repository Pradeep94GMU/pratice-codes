import java.util.*;

public class ListOfList {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(23);
        System.out.println(a);

        List<List<Integer>> al = new ArrayList<>();

        al.add(a);
        System.out.println(al);

        a.add(111);
        a.add(45);
        a.add(90);
        System.out.println(a);

        al.add(a);
        System.out.println(al);

    }
}
