import java.util.*;

public class FindingLevelNode {
    base root;

    void inorder(base root, int level){
        Queue<base> q = new LinkedList<>();
        List<Integer> al = new LinkedList<>();
        q.add(root);
        int count = 0;
        //base temp = root;
        while(!q.isEmpty()){
            count++;
            if(count == level){
                for(int i = q.size() - 1; i >=0 ; i--){
                    base temp = q.poll();
                   //basically what i am doing is... taking a stoppage at asked level and performing same operation here...
                    System.out.print(temp.data+" ");
                    //System.out.println("hello");
                    if(temp.left != null) q.add(temp.left);
                    if(temp.right != null) q.add(temp.right);

                }

            }
            else{
                base temp = q.poll();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }

        }


        //System.out.println(al);
    }

    public static void main(String[] args) {
        FindingLevelNode tree = new FindingLevelNode();

        tree.root = new base(12);
        tree.root.left = new base(2);
        tree.root.right = new base(33);
        tree.root.left.left = new base(4);
        tree.root.left.right = new base(6);
        tree.root.right.left = new base(98);
        int level  = 3;
        tree.inorder(tree.root,level);

    }
}
