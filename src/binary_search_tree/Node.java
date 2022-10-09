package binary_search_tree;


public class Node {
    int key;
    Node right, left;

    public Node(int key) {
        this.key = key;
        right = left = null;
    }

    public boolean searchRecursive(Node root, int x) {
        if(root == null) {
            return false;
        }
        if(root.key == x) {
            return true;
        }
        if(x < root.key) {
            return searchRecursive(root.left, x);
        }
        return searchRecursive(root.right, x);
    }

    public boolean searchIterative(Node root, int x) {
        Node curr = root;
        while(curr != null) {
            if(curr.key == x) {
                return true;
            } else if(curr.key > x) {
                curr = curr.left;
                continue;
            } else {
                curr = curr.right;
            }
        }
        return false;
    }

    public Node insertRecursice(Node root, int x) {
        if(root == null) {
            return new Node(x);
        }
        if(x < root.key) {
            root.left = insertRecursice(root.left, x);
        } else if(x > root.key) {
            root.right = insertRecursice(root.right, x);
        }
        return root;
    }

    public Node insertIterative(Node root, int x) {
        Node node = new Node(x);
        Node curr = root;
        if(curr == null) {
            return node;
        }
        while(curr != null) {
            if(x < curr.key) {
                if(curr.left != null) {
                    curr = curr.left;
                } else {
                    curr.left = node;
                    break;
                }
            } else if(x == curr.key) {
                break;
            } else {
                if(curr.right != null) {
                    curr = curr.right;
                } else {
                    curr.right = node;
                    break;
                }
            }
        }
        return root;
    }

    public Node delNodeRecursive(Node root, int x) {
        if(root == null) {
            return null;
        }
        if(root.key > x) {
            root.left = delNodeRecursive(root.left, x);
        } else if(root.key < x) {
            root.right = delNodeRecursive(root.right, x);
        } else {
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            } else {
                Node succ = getSucc(root);
                root.key = succ.key;
                root.right = delNodeRecursive(root.right, succ.key);
            }
        }
        return root;
    }

    public Node getSucc(Node root) {
        Node curr = root.right;
        while(curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public Node floor(Node root, int x) {
        Node curr = root;
        Node floor = null;
        while(curr != null) {
            if(curr.key == x) {
                return curr;
            } else if(curr.key > x) {
                curr = curr.left;  
            } else {
                floor = curr;
                curr = curr.right;
            }
        }
        return floor;
    }

    public Node ceil(Node root, int x) {
        Node curr = root;
        Node res = null;
        while(curr != null) {
            if(curr.key == x) {
                return curr;
            } else if(curr.key > x) {
                res = curr;
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        return res;
    }







    public static void main(String[] args) {
        
    }
    
}
