package Trees;

public class BinarySearchTree {


    private Node root;

    BinarySearchTree() {

    }

    private class Node {
        private Node left;
        private Node right;
        private int value;

        private int height;

        Node(int value) {
            this.value = value;
        }

        public int getValue() {return value;}
        public int getHeight() {return height;}
    }

    public int height(Node node) {
        if(node == null)  return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }


    public void populate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void insert(int value) {
        root = insert(value, root);
    }

    public int getHeight(Node node) {
        return node.getHeight();
    }
    public Node insert(int value, Node node) {

        if(node == null) {
            node = new Node(value);
            return node;
        }

        if(value < node.value) {
            node.left = insert(value, node.left);
        }

        if(value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void display() {
        display(root, "The root node value is: ");
    }

    public void display(Node node, String details) {

        if(node == null) {
            return;
        }

        System.out.println(details + node.value);
        System.out.println("Height of this node " + node.value + " is: " + node.getHeight());
        display(node.left, "Left child of " + node.value + " is: ");
        display(node.right, "Right child of " + node.value + "is: ");
    }

    public static void main(String... args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };

        bst.populate(nums);
        bst.display();

    }
}
