//Here i have created one node which will be a data type//// its kinda structure
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data =  data;
        left = null;
        right = null;
    }
}


public class Bfs1 {
    // Root of the Binary Tree .. this class bfs1 has variable root which has datatypr Node and method static void main
    Node root;
    //display all node in the inorder way
    void display(Node root)
     {
         if(root == null){
             return;
         }

             display(root.left);
             System.out.println(root.data);
             display(root.right);
     }
    public static void main(String[] args) {
        //this object has been created to acces each variable and method of Bfs1 class
        Bfs1 tree = new Bfs1();
        tree.root = new Node(12);
        tree.root.left = new Node(21);
        tree.root.right = new Node(22);
        //display is method of class Bfs1.. so accesing this meh=thod we need an obj
        tree.display(tree.root);

    }
}
