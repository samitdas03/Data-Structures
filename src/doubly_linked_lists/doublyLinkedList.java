package doubly_linked_lists;

public class doublyLinkedList {

    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = Node.insertBegin(head, 5);

        head = Node.insertEnd(head, 40);

        head = Node.revList(head);

        // head = Node.delHead(head);


        Node.printList(head);
    }
    
}
