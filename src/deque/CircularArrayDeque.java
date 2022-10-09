package deque;


public class CircularArrayDeque {

    int arr[];
    int front, size, cap;

    public CircularArrayDeque(int c) {
        cap = c;
        size = 0;
        front = 0;
        arr = new int[cap];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == cap);
    }

    public int size() {
        return size;
    }

    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return arr[(front+size-1)%cap];
    }

    public void insertRear(int x) {
        if(isFull()) {
            System.out.println("Deque is already full");
            return;
        }
        int inputSlot = (front + size) % cap;
        arr[inputSlot] = x;
        size++;
    }

    public void deleteRear() {
        if(isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        size--;
    }

    public void insertFront(int x) {
        if(isFull()) {
            System.out.println("Deque is already full");
            return;
        }
        front = (front + cap - 1) % cap;
        arr[front] = x;
        size++;
    }

    public void deleteFront() {
        if(isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        front = (front + 1) % cap;
        size--;
    }
    
}
