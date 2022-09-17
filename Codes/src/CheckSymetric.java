
//using already created base node type from differnt class file

import java.util.*;

public class CheckSymetric {
    base root;
//    void inorder(base root){
//        if(root == null){
//            return;
//        }
//        inorder(root.left);
//        System.out.println(root.data);
//        inorder(root.right);
//    }
    void SymetricTree(base root){
        if(root == null){
            System.out.println("true");
            return;
        }//Earlier i have used ArrayDeque which is not suitable for this program as ArrayDeque will remove element from the top
        //so we used LinkedList which will remove element from the iterative approch
        Queue<base> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            base leftnode = q.poll();
            base rightnode = q.poll();
            //in tree operation the most important thing is to check where can we get the null value first
            //here, first we are cheking if both the node are leaf node means there should not be any node attach to that means both are null
            if(leftnode == null && rightnode == null){
                continue; // we use continue to skip the iteration for the next step
            }
            //again we check other null condition like where can we get null condition..
            //here, if any node having null then it will return false and also if nodes are not equal to each other then also it will false
            if(leftnode == null || rightnode == null || leftnode.data != rightnode.data){
                System.out.println("false");
                return;
            }
            //if both above condition are not valid then it will add remaing node attached to leftnode and rightnode
            //adding in order is also significant as it will check for symatric value else it will give some differnt value
            //first we will add left of left and match with right of right
            q.add(leftnode.left);
            q.add(rightnode.right);
            //now i will add left of right and match with right of left
            q.add(leftnode.right);
            q.add(rightnode.left);
            //this process will go on untill each element from stack will be poped
        }
        System.out.println("true");
        return;
    }
    public static void main(String[] args) {
        CheckSymetric tree = new CheckSymetric();
        tree.root = new base(1);
        tree.root.left = new base(2);
        tree.root.right = new base(2);
        tree.root.left.left = new base(3);
        tree.root.left.right = new base(4);
        tree.root.right.left = new base(4);
        tree.root.right.right = new base(3);

        //call inorder function as inorder will show how we can get symetric figure
        //tree.inorder(tree.root);
        tree.SymetricTree(tree.root);

    }
}
