package stack;

public class ArrayStack {
 
    int arr[];
    int cap;
    int top;

    public ArrayStack(int c) {
        this.cap = c;
        arr = new int[this.cap];
        top = -1;
    } 

    void push(int x) {
        if(top == cap-1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    int peek() {
        if(top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[top];
    }

    


    public static void main(String[] args) {
        
        ArrayStack as = new ArrayStack(5);
        as.push(10);
        as.push(20);
        System.out.println(as.peek());
        System.out.println(as.pop());
        as.push(30);
        System.out.println(as.pop());
    }

    
}
