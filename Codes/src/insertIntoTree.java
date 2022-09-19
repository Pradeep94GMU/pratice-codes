import java.util.*;

public class insertIntoTree {
    base root;

    void inorder(base root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    // for inseritng any item we traverse through level and then look for any left or right value as null.. If its null then add it else move to the next
    static void insert(base root,int data){
        if(root == null){
            root = new base(data);
            return;
        }
        Queue<base> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            base temp = q.poll();
            if(temp.left == null){
                temp.left = new base(data);
                break;
            }
            else{
                q.add(temp.left);
            }
            if(temp.right == null){
                temp.right = new base(data);
                break;
            }
            else{
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        insertIntoTree tree = new insertIntoTree();

        tree.root = new base(12);
        tree.root.left = new base(2);
        tree.root.right = new base(33);
        tree.root.left.left = new base(4);
        tree.root.left.right = new base(6);
        tree.root.right.left = new base(98);

        insert(tree.root,11);
        tree.inorder(tree.root);

        //tree.inorder(tree.root);


    }
}
