package linked_lists;
// import linked_lists.Node;

public class LinkedList {

    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;
        temp1.next.next = new Node(40);

        head = Node.insertBegin(head, 5);
        head = Node.insertBegin(head, 1);

        head = Node.insertEnd(head, 50);

        // head = Node.deleteHead(head);
        // head = Node.deleteTail(head);

        head = Node.insertPos(head, 8, 60);
        head = Node.insertPos(head, 5, 25);
        head = Node.insertPos(head, 19, 100);

        head = Node.sortedInsert(head, 90);
        head = Node.sortedInsert(head, 45);
        head = Node.sortedInsert(head, 0);

        Node.printMiddle(head);
        Node.printMiddle2(head);

        // head = Node.revList1(head);
        // head = Node.revList2(head);
        // head = Node.recur_revList1(head);
        // head = Node.recur_revList2(head, null);

        Node.printList(head);

        System.out.println();

        int ind = Node.searchLL(head, 40);
        int ind1 = Node.searchLLRecursive(head, 40);
        System.out.println(ind + " " + ind1);

    }
    
}
