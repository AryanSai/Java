class BinaryTree {
    static class Node {
        int value;
        Node left, right;
    
        Node(int val) {
            this.value = val;
            this.right = null;
            this.left = null;
        }
    }

    Node root = new Node(0);

    public static void main(String[] args) {
        BinaryTree btree = new BinaryTree();
    }
}
