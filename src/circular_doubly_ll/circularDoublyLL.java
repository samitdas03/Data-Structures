package circular_doubly_ll;

public class circularDoublyLL {

    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        temp2.next = head;
        head.prev = temp2;


        head = Node.insertBegin1(head, 5);

        head = Node.inserBegin2(head, 0);

        Node.printList(head);

    }
    
}
