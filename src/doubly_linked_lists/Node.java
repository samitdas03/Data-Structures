package doubly_linked_lists;

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
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    public static Node insertEnd(Node head, int data) {
        Node temp = new Node(data);
        if(head == null) {
            return temp;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static Node revList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node tempPrev = null;
        while(curr != null) {
            curr.prev = curr.next;
            curr.next = tempPrev;
            tempPrev = curr;
            curr = curr.prev;
        }
        return tempPrev;
    }

    public static Node delHead(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node temp = head.next;
        head.next = null;
        temp.prev = null;
        return temp;
    }

    public static Node delTail(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        curr.prev = null;
        return head;
    }





    public static void main(String[] args) {
        
    }
    
}
