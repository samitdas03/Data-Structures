package tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Node {

    int key;
    Node right;
    Node left;

    public Node(int k) {
        key = k;
        right = left = null;
    }

    public void inorderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.key + " ");
        inorderTraversal(root.right);
    }

    public void preorderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public void postorderTraversal(Node root) {
        if(root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.key + " ");
    }

    public int height(Node root) {
        if(root == null) {
            return 0;
        }
        int res = Math.max(height(root.left), height(root.right));
        return res+1;
    }

    public void printKDist(Node root, int k) {
        if(root == null) {
            return;
        }
        if(k == 0) {
            System.out.print(root.key + " ");
            return;
        } else {
            printKDist(root.left, k-1);
            printKDist(root.right, k-1);
        }
    }

    public void levelOrderTraversal1(Node root) {
        if(root == null) {
            return;
        }
        int height = height(root);
        for(int i = 0; i < height; i++) {
            printKDist(root, i);
        }
    }

    public void levelOrderTraversal2(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false) {
            Node curr = q.poll();
            System.out.print(curr.key);
            if(curr.left != null) {
                q.add(curr.left);
            }
            if(curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    public int getSize1(Node root) {
        if(root == null) {
            return 0;
        }
        int res = getSize1(root.left) + getSize1(root.right);
        return res + 1;
    }

    public int getSizeIterative(Node root) {
        if(root == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int count = 0;
        while(q.isEmpty() == false) {
            Node curr = q.poll();
            count++;
            if(curr.left != null) {
                q.add(curr.left);
            }
            if(curr.right != null) {
                q.add(curr.right);
            }
        }
        return count;
    }

    public int getMax1(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        int res = Math.max(getMax1(root.left), getMax1(root.right));
        res = Math.max(res, root.key);
        return res;
    }

    public int getMaxIterative(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int res = Integer.MIN_VALUE;
        while(q.isEmpty() == false) {
            Node curr = q.poll();
            res = Math.max(res, curr.key);
            if(curr.left != null) {
                q.add(curr.left);
            }
            if(curr.right != null) {
                q.add(curr.right);
            }
        }
        return res;
    }

    public void inorderIterativeTraversal(Node root) {
        if(root == null) {
            return;
        }
        Stack<Node> stk = new Stack<Node>();
        Node curr = root;
        while(curr != null || stk.isEmpty() == false) {
            while(curr != null) {
                stk.push(curr);
                curr = curr.left;
            }
            curr = stk.pop();
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
    }

    public void preorderIterativeTraversal1(Node root) {
        if(root == null) {
            return;
        }
        Stack<Node> stk = new Stack<Node>();
        Node curr = root;
        while(curr != null || stk.isEmpty() == false) {
            while(curr != null) {
                System.out.print(curr.key + " ");
                stk.push(curr);
                curr = curr.left;
            }
            curr = stk.pop();
            curr = curr.right;
        }
    }

    public void preorderIterativeTraversal2(Node root) {
        if(root == null) {
            return;
        }
        Stack<Node> stk = new Stack<Node>();
        stk.push(root);
        while(stk.isEmpty() == false) {
            Node curr = stk.pop();
            System.out.print(curr.key + " ");
            if(curr.right != null) {
                stk.push(curr.right);
            }
            if(curr.left != null) {
                stk.push(curr.left);
            }
        }
    }

    public void preorderIterativeTraversal3(Node root) {
        if(root == null) {
            return;
        }
        Stack<Node> stk = new Stack<Node>();
        Node curr = root;
        while(curr != null || stk.isEmpty() == false) {
            while(curr != null) {
                System.out.print(curr.key + " ");
                if(curr.right != null) {
                    stk.push(curr.right);
                }
                curr = curr.left;
            }
            if(stk.isEmpty() == false) {
                curr = stk.pop();
            }
        }
    }

    public int diameter(Node root) {
        if(root == null) {
            return 0;
        }
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        int lDiameter = diameter(root.left);
        int rDiameter = diameter(root.right);

        int res = Math.max(lHeight + rHeight + 1, Math.max(lDiameter, rDiameter));

        return res;
    }





    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
    }
    
}
