import java.util.ArrayDeque;
import java.util.*;

class base{
    int data;
    base left, right;
    base(int data){
        this.data = data;
        left = right = null;
    }
}
public class ReverseLevel {
     base root;
    void levelorder(base root){
        Queue<base> q = new ArrayDeque<>();
        //i need to use an stack s it required to print in the reverse order so it will work on the basic of it
        Stack<Integer> s = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            base temp = q.poll();
            s.push(temp.data);
            if(temp.right != null){
                q.add(temp.right);
            }
            if(temp.left != null){
                q.add(temp.left);
            }
        }
        while(!s.isEmpty()){
            int res = s.pop();
            System.out.print(res+" ");
        }

    }


    public static void main(String[] args) {
        ReverseLevel tree = new ReverseLevel();
        tree.root = new base(12);
        tree.root.left = new base(22);
        tree.root.right = new base(33);

        tree.root.left.left = new base(16);
        tree.root.left.right = new base(66);

        tree.levelorder(tree.root);
    }
}
