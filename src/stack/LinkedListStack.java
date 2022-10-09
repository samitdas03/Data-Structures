package stack;
import linked_lists.Node;


public class LinkedListStack {

    Node head;
    int siz;

    public LinkedListStack() {
        head = null;
        siz = 0;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return siz;
    }

    public void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        siz++;
    }

    public int pop() {
        if(head == null) {
            return Integer.MAX_VALUE;
        }
        int result = head.data;
        head = head.next;
        siz--;
        return result;
    }

    public int peek() {
        if(head == null) {
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    
}
