package linked_lists;

public class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

    public static void printList(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static int searchLL(Node head, int x) {
        Node curr = head;
        int index = 1;
        while(curr != null) {
            if(curr.data == x) {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    public static int searchLLRecursive(Node head, int x) {
        if(head == null) {
            return -1;
        }
        if(head.data == x) {
            return 1;
        }
        int res = searchLLRecursive(head.next, x);
        if(res == -1) {
            return -1;
        }
        return res + 1;
    }

    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) {
            return temp;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }

    public static Node deleteHead(Node head) {
        if(head == null) {
            return null;
        }
        return head.next;
    }

    public static Node deleteTail(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while(curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static Node insertPos(Node head, int pos, int data) {
        Node temp = new Node(data);
        if(pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for(int i = 1; i <= pos - 2; i++) {
            if(curr == null) {
                return head;
            }
            curr = curr.next;
        }
        if(curr == null) {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static Node sortedInsert(Node head, int x) {
        Node temp = new Node(x);
        if(head == null) {
            return temp;
        }
        if(head.data > x) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data < x) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void printMiddle(Node head) {
        if(head == null) {
            return;
        }
        int count = 0;
        Node curr = head;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        int index = count/2 + 1;
        curr = head;
        for(int i = 1; i < index; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void printMiddle2(Node head) {
        if(head == null) {
            return;
        }
        Node fast = head;
        Node slow = head;

        while(fast != null) {
            if(fast.next == null) {
                System.out.println(slow.data);
                return;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    public static void printNthFromEnd1(Node head, int n) {
        if(head == null) {
            return;
        }
        int count = 0;
        Node curr = head;

        while(curr != null) {
            count++;
            curr = curr.next;
        }
        if(count < n) {
            return;
        }

        int ind = count - n + 1;
        curr = head;
        for(int i = 1; i < ind; i++) {
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public static void printNthFromEnd2(Node head, int n) {
        if(head == null) {
            return;
        }
        Node first = head;
        Node second = head;

        for(int i = 1; i <= n; i++) {
            if(first == null) {
                return;
            }
            first = first.next;
        }
        while(first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }

    public static Node revList1(Node head) {
        Node curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        int arr[] = new int[count];
        curr = head;
        for(int i = 0; i < count; i++) {
            arr[i] = curr.data;
            curr = curr.next;
        }
        curr = head;
        for(int i = count-1; i >= 0; i--) {
            curr.data = arr[i];
            curr = curr.next;
        }
        return head;
    }

    public static Node revList2(Node head) {
        Node prev = null;
        Node curr = head;
        Node temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static Node recur_revList1(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node rest_head = recur_revList1(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }

    public static Node recur_revList2(Node curr, Node prev) {
        if(curr == null) {
            return prev;
        }
        Node temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        return recur_revList2(curr, prev);
    }

    public static void removeDups(Node head) {
        if(head == null) {
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            if(curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }





    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;
    }
    
}
