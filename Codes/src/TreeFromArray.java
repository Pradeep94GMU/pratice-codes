import java.util.*;

public class TreeFromArray {
    base root = null;
    void maketree(base root,int data){
        if(root == null){
            root= new base(data);
            return;
        }
        Queue<base> q = new LinkedList<>();
        List<Integer> al = new LinkedList<>();
        q.add(root);
        if(data < root.data){

        }
        while(!q.isEmpty()){
            base temp = q.poll();
            al.add(temp.data);


        }
    }
    public static void main(String[] args) {
        TreeFromArray tree = new TreeFromArray();
        int nums[] = {2,12,4,3,66,18};
        for(int i = 0; i < nums.length; i++){
            tree.maketree(tree.root,nums[i]);
        }

    }
}
