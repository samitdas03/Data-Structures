package circular_doubly_ll;

public class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public static void printList(Node head) {
        if(head == null) {
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while(curr != head);
    }

    public static Node insertBegin1(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        head.next.prev = temp;
        temp.next = head.next;
        head.next = temp;
        temp.prev = head;

        temp.data = head.data;
        head.data = data;
        return head;
    }

    public static Node inserBegin2(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }
        temp.prev = head.prev;
        head.prev.next = temp;
        temp.next = head;
        head.prev = temp;
        return temp;
    }
    
}
