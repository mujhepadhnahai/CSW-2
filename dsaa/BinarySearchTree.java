

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
        int[] arr ={18,33,45,67,86,84,98};
        int n = arr.length;
        
    }
}