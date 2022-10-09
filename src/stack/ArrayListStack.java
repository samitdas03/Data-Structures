package stack;
// import java.io.*;
import java.util.*;

public class ArrayListStack {

    ArrayList<Integer> arrli = new ArrayList<Integer>();
    int top;

    void push(int x) {
        arrli.add(x);
    }

    int pop() {
        if(arrli.size() == 0) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int res = arrli.get(arrli.size()-1);
        arrli.remove(arrli.size()-1);
        return res;
    }

    int size() {
        return arrli.size();
    }

    boolean isEmpty() {
        return (arrli.size() == 0);
    }

    int peek() {
        if(arrli.size() == 0) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return (arrli.get(arrli.size()-1));
    }
    



    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // al.add(5);
        System.out.println(al.size());
    }
}
