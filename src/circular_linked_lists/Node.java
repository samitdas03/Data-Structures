package circular_linked_lists;


public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public static void printList1(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data + " ");
        Node curr = head.next;
        while(curr != head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void printList2(Node head) {
        if(head == null) {
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while(curr != head);
        System.out.println();
    }

    public static Node insertBegin1(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return temp;
    }

    public static Node insertBegin2(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int newHeadData  = x;
        temp.data = head.data;
        head.data = newHeadData;
        return head;
    }

    public static Node insertEnd1(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }

    public static Node insertEnd2(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        temp.data = head.data;
        head.data = x;
        return temp;
    }

    public static Node delHead1(Node head) {
        if(head == null || head.next == head) {
            return null;
        }
        Node curr = head;
        while(curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }

    public static Node delHead2(Node head) {
        if(head == null || head.next == head) {
            return null;
        }
        head.data = head.next.data;;
        head.next = head.next.next;
        return head;
    }

    public static Node delKthNode(Node head, int k) {
        if(head == null || k <= 0) {
            return head;
        }
        if(k == 1) {
            if(head.next == head) {
                return null;
            }
            head.data = head.next.data;;
            head.next = head.next.next;
            return head;
        }
        Node curr = head;
        for(int i = 1; i <= k-2; i++) {
            curr = curr.next;
            if(curr == head || curr.next == head) {
                return head;
            }
        }
        curr.next = curr.next.next;
        return head;
    }







    public static void main(String[] args) {
        
    }
    
}
