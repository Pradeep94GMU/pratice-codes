//i ahve created simple struct/class for node
class Nooode{
    int data;
    Nooode next;
    Nooode(int data){
        this.data = data;
        this.next = null;
    }
}
//using this class to create a simple list first
public class ReverseLinkedList {
    Nooode head;
    //creating insert funtion to insert list
   public Nooode insert(Nooode head, int data){
       Nooode temp;
       //store the new incoming data into newnode
       if(head == null){
           head = new Nooode(data);
           return head;
       }
       else{
            temp = head;
           while(temp.next != null){
               temp = temp.next;
           }
           temp.next = new Nooode(data);
            return temp;
       }

    }
    static void printList(Nooode head){
       if(head == null){
           System.out.println("List is empty\n");
           return;
       }
        Nooode trav = head;
       while(trav != null){
           System.out.println(trav.data);
           trav = trav.next;
       }
    }
    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();
        obj.head = new Nooode(10);
        obj.head = obj.insert(obj.head,12);
        obj.head = obj.insert(obj.head,52);
        obj.head = obj.insert(obj.head,1);
//        insert(obj.head,14);
//        insert(obj.head,17);

        //print the list value
        printList(obj.head);


    }
}
