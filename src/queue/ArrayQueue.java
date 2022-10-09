package queue;

public class ArrayQueue {

    int arr[];
    int cap;
    int size;

    public ArrayQueue(int x) {
        arr = new int[x];
        cap = x;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == cap);
    }

    public void enqueue(int e) {
        if(size == cap) {
            System.out.println("Queue is already full");
            return;
        }
        arr[size] = e;
        size++;
    }

    public int dequeue() {
        if(size == 0) {
            return -1;
        }
        int res = arr[0];
        if(size == 1) {
            size--;
            return res;
        }
        for(int i = 0; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        return res;
    }

    public int getFront() {
        if(size == 0) {
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        if(size == 0) {
            return -1;
        }
        return arr[size-1];
    }






    // TESTING

    public static void main(String[] args) {
        
        ArrayQueue aq = new ArrayQueue(3);

        System.out.println(aq.size);
        System.out.println(aq.getFront());
        System.out.println(aq.getRear());
        System.out.println(aq.isEmpty());

        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);

        System.out.println(aq.isFull());
        System.out.println(aq.getRear());

        System.out.println(aq.dequeue());
        System.out.println(aq.getFront());

    }
    
}
