public class BST {
    private static class BSTnode {
        int value;
        int freq; // duplicates
        BSTnode left;
        BSTnode right;

        public BSTnode(int value) {
            this.value = value;
            this.freq = 1;
            this.left = null;
            this.right = null;
        }

        @Override public String toString() {
            return value + "";
        }
    }

    BSTnode root;

    public BST() {
        root = null;
    }

    public void inorder() {
        inorderHelper(this.root);
        System.out.println();
    }

    private void inorderHelper(BSTnode root) {
        if ( root != null ) {
            inorderHelper(root.left);
            System.out.print(root + " ");
            inorderHelper(root.right);
        }
    }

    public boolean contains(int key) {
        return containsHelper(this.root, key);
    }

    private boolean containsHelper(BSTnode root, int key) {
        // this tree does not contain this key
        if ( root == null )
            return false;
        // found!
        if ( root.value = key )
            return true;
        // keep looking
        if ( root.value > key )
            return containsHelper(root.left, key);
        else
            return containsHelper(root.right, key);
    }

    public void add(int key) {
        addHelper(this.root, key);
    }

    private void addHelper(BSTnode root, int key) {
        if (root == null) {
            root = new BSTnode(key);
        } else if (root.value > key) {
            addHelper(root.left, key);
        } else if (root.value < key) {
            addHelper(root.right, key);
        } else {
            // deal with duplicates here
        }
    }


}
