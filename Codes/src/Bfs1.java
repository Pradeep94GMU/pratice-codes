//Here i have created one node which will be a data type//// its kinda structure
class Node{
    int data;
    Node2 left, right;
    Node(int data){
        this.data =  data;
        left = null;
        right = null;
    }
}


public class Bfs1 {
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
//    int height(node root){
//
//        if(root == null){
//            return 0;
//        }
//        int lefth = height(node.left);
//        int righth = height(node.right);
//
//        return 1 + Math.max(lefth,righth);
//
//    }



    public static void main(String[] args) {
        //this object has been created to acces each variable and method of Bfs1 class
        Bfs1 tree = new Bfs1();
        tree.root = new Node2(12);
        tree.root.left = new Node2(21);
        tree.root.right = new Node2(22);
        //display is method of class Bfs1.. so accesing this meh=thod we need an obj
        tree.display(tree.root);



    }
}
