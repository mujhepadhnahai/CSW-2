
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BST {
    Node root;

    public BST() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            System.out.println("Inserted key: " + key);
            return new Node(key);
        }

        if (key < root.key) {
            System.out.println("Inserting key " + key + " to the left of " + root.key);
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            System.out.println("Inserting key " + key + " to the right of " + root.key);
            root.right = insertRec(root.right, key);
        } else {
            System.out.println("Key " + key + " already exists in the tree.");
        }

        return root;
    }

    // DFS 
    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void traversePreOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            traversePreOrder(root.left);
            traversePreOrder(root.right);
        }
    }

    public void traversePostOrder(Node root) {
        if (root != null) {
            traversePostOrder(root.left);
            traversePostOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

    void levelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the BST:");
        tree.inorderRec(tree.root);
        
        System.out.println("\nPreorder traversal of the BST:");
        tree.traversePreOrder(tree.root);
        
        System.out.println("\nPostorder traversal of the BST:");
        tree.traversePostOrder(tree.root);
        
        System.out.println("\nLevel order traversal of the BST:");
        tree.levelOrder();
    }
}
