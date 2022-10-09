package deque;

public class ArrayDeque {

    int arr[];
    int cap, size;

    public ArrayDeque(int c) {
        cap = c;
        arr = new int[cap];
        size = 0;
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
        return arr[0];
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return arr[size-1];
    }

    public void insertRear(int x) {
        if(isFull()) {
            System.out.println("Deque is already full");
            return;
        }
        arr[size] = x;
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
        for(int i = size-1; i >= 0; i--) {
            arr[i+1] = arr[i];
        }
        arr[0] = x;
        size++;
    }
    
    public void deleteFront() {
        if(isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        for(int i = 0; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }






    public static void main(String[] args) {
        
    }

}
