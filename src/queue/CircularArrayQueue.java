package queue;

public class CircularArrayQueue {

    int cap;
    int front;
    int size;
    int arr[];

    public CircularArrayQueue(int x) {
        cap = x;
        arr = new int[cap];
        size = 0;
        front = 0;
    }

    public boolean isFull() {
        return (size == cap);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }
        int res = arr[front];
        if(front == cap-1) {
            front = 0;
            size--;
            return res;
        }
        front++;
        size--;
        return res;
    }

    public void enqueue(int e) {
        if(isFull()) {
            System.out.println("Queue is already full");
            return;
        }
        int inputSlot = (size + front) % cap;
        arr[inputSlot] = e;
        size++;
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
        int rearSlot = (front + size - 1) % cap;
        return arr[rearSlot];
    }

    public int size() {
        return size;
    }








    // TESTING

    public static void main(String[] args) {
        
        CircularArrayQueue cq = new CircularArrayQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);

        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        System.out.println(cq.getFront());
        System.out.println(cq.getRear());
        System.out.println(cq.size());

        cq.dequeue();
        System.out.println();

        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        System.out.println(cq.getFront());
        System.out.println(cq.getRear());
        System.out.println(cq.size());

        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        System.out.println();

        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        System.out.println(cq.getFront());
        System.out.println(cq.getRear());
        System.out.println(cq.size());

        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        System.out.println();

        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        System.out.println(cq.getFront());
        System.out.println(cq.getRear());
        System.out.println(cq.size());

        cq.dequeue();
        System.out.println();

        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        System.out.println(cq.getFront());
        System.out.println(cq.getRear());
        System.out.println(cq.size());

        cq.enqueue(70);
        cq.enqueue(80);
        System.out.println();

        System.out.println(cq.isEmpty());
        System.out.println(cq.isFull());
        System.out.println(cq.getFront());
        System.out.println(cq.getRear());
        System.out.println(cq.size());






    }



    
}
