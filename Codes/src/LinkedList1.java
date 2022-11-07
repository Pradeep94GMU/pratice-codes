public class LinkedList1 {

    int data;
    LinkedList1 next;

    LinkedList1(int data){
        this.data = data;
        next = null;
    }

    static LinkedList1 head = null;

    static LinkedList1 insert(int data){
        LinkedList1 newNode = new LinkedList1(data);
        if(head == null){
            head = newNode;
            return head;
        }
        else{
            LinkedList1 temp = head;
            head = newNode;
            newNode.next = temp;

        }
        return newNode;
    }

    void display(LinkedList1 head){
        LinkedList1 temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    LinkedList1 reverse(LinkedList1 head){
        //for reverse the link.. visit each node and collect all the information(prev, curr and next node)
        //then move ahead while revrese the each node pointer

        LinkedList1 prev, cur, nextt;
        prev = null;
        cur = head;

        while(cur != null){
            nextt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextt;
        }
        return prev;

    }

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1(0);

        //head = insert(4);
//        head = insert(2);
//        head = insert(9);
//        head = insert(22);
//        head = insert(8);
        //Simple LinkedList
       ll.display(head);
        System.out.println();
        //reversed linked list
        head = ll.reverse(head);
        System.out.println("Hello");
        ll.display(head);

    }
}
