package queue;
import linked_lists.Node;

public class LinkedListQueue {

    int size;
    Node front, rear;

    public LinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int x) {
        if(isEmpty()) {
            front = new Node(x);
            rear = front;
        } else {
            Node temp = new Node(x);
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public void dequeue() {
        if(isEmpty()) {
            return;
        } else if(size == 1) {
            front = null;
            rear = null;
            size--;
            return;
        }
        front = front.next;
        size--;
    }

    public int size() {
        return size;
    }

    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return front.data;
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return rear.data;
    }
    
}
