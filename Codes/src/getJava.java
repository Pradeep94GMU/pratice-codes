import java.util.*;

public class getJava {
    public static void main(String[] args) {
        Set<Character> st = new HashSet<>();
        st.add('a');
        st.add('t');
        st.add('4');
        st.add('h');
        st.add('i');

        System.out.println(st);
        //System.out.println(!st.contains('s'));
        if(!st.contains('s')){
            System.out.println("HELLO");
        }



    }
}
