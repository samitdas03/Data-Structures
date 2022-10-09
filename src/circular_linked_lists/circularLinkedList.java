package circular_linked_lists;

public class circularLinkedList {

    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;



        head = Node.insertBegin1(head, 5);
        head = Node.insertBegin2(head, 0);

        head = Node.insertEnd1(head, 50);
        head = Node.insertEnd2(head, 60);

        // head = Node.delKthNode(head, 2);



        Node.printList1(head);
        Node.printList2(head);
    }
    
}
