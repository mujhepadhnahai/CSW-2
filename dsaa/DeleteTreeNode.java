class BSTNode {
    int info;
    BSTNode left, right;

    public BSTNode(int info) {
        this.info = info;
        this.left = this.right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int info) {
        root = insertRec(root, info);
    }

    private BSTNode insertRec(BSTNode root, int info) {
        if (root == null) {
            root = new BSTNode(info);
            return root;
        }
        if (info < root.info)
            root.left = insertRec(root.left, info);
        else if (info > root.info)
            root.right = insertRec(root.right, info);
        
        return root;
    }

    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(BSTNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.info + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(BSTNode root) {
        if (root != null) {
            System.out.print(root.info + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    private void postOrderRec(BSTNode root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.info + " ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] elements = {50, 30, 70, 20, 40, 60, 80};
        for (int el : elements) {
            bst.insert(el);
        }
        
        System.out.println("In-order traversal:");
        bst.inOrder();
        
        System.out.println("Pre-order traversal:");
        bst.preOrder();
        
        System.out.println("Post-order traversal:");
        bst.postOrder();
    }
}