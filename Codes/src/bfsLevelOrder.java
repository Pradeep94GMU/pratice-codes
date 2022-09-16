import java.util.ArrayDeque;
import java.util.Queue;

class NNode{
    int data;
    NNode left, right;
    NNode(int data){
        this.data = data;
        left = right = null;
    }
}

public class bfsLevelOrder {
    NNode root;


    void levelOrder(NNode root){
        //we have a tree root.. Now i will use it to create level order.
        //for that we need two different data structure.. 1) we need to store all tree element in Queue
        Queue<NNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            NNode temp = q.poll();
            System.out.println(temp.data);
            //now we will push the deleted node lef and right index but when we add just check for empty node first
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }

        }
    }
    //this is object i have created for accessing all tree mehods and variables
    void inorder(NNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }


    public static void main(String[] args) {
        bfsLevelOrder tree = new bfsLevelOrder();
        tree.root = new NNode(12);
        tree.root.left = new NNode(22);
        tree.root.right = new NNode(33);
        tree.root.left.left = new NNode(444);

       // tree.inorder(tree.root);
        tree.levelOrder(tree.root);



    }
}
