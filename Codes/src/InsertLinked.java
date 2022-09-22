public class InsertLinked {
    Nooode head;
    public void insert(int data){
        if(head == null){
            head = new Nooode(data);
        }
        else{
            Nooode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Nooode(data);
        }
    }
    public void display(){
        if(head == null ){
            System.out.println("Empty");
            return;
        }
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
            InsertLinked LinkedList = new InsertLinked();
            LinkedList.insert(22);
            LinkedList.insert(2);
            LinkedList.insert(112);

            LinkedList.display();
    }
}
