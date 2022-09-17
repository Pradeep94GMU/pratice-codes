//Here i have created one node which will be a data type//// its kinda structure
class Node2 {
    int data;
     Node2 left, right;
     Node2(int data){
        this.data =  data;
        left = null;
        right = null;
    }
}


public class Height {
    // Root of the Binary Tree .. this class bfs1 has variable root which has datatypr Node and method static void main
    Node2 root;
    //display all node in the inorder way
    void display(Node2 root)
     {
         if(root == null){
             return;
         }

             display(root.left);
             System.out.println(root.data);
             display(root.right);
     }
  int height(Node2 root){

        if(root == null){
            return 0;
        }
        int lefth = height(root.left);
        int righth = height(root.right);
//we are juts calculating left height and right heigh and who ever is maximum it will give the number
        return 1 + Math.max(lefth,righth);

    }



    public static void main(String[] args) {
        //this object has been created to acces each variable and method of Bfs1 class
        Height tree = new Height();
        tree.root = new Node2(12);
        tree.root.left = new Node2(21);
        tree.root.right = new Node2(22);
        //display is method of class Bfs1.. so accesing this meh=thod we need an obj
        tree.display(tree.root);
         int hfinal = tree.height(tree.root);
        System.out.println(hfinal);




    }
}
