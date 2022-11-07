import java.util.Stack;

public class StackClassToArr {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.add(1);
        s.add(2);
        s.add(5);
        s.add(5);
        s.add(76);

        System.out.println(s);

        for(int i = 0; i < s.size() - 1; i++){
            if(s.get(i) == s.get(i + 1)){
                System.out.println(s.get(i));
            }
        }

    }
}
