package Trees;

// self balancing binary tree
public class AVLTree {

    private Node root;

    AVLTree() {

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
        return rotate(node);
    }

    public Node rotate(Node node) {

        // left heavy
        if(height(node.left) - height(node.right) > 0) {
            // left left case - right rotate
            if(height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            // left right case - left rotate right rotate
            if(height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }

        // right heavy
        if(height(node.left) - height(node.right) < -1) {

            // right right case - left rotate
            if(height(node.right.left) - height(node.right.right) < 0) {
                 return leftRotate(node);
            }

            // right left case - right and left rotate
            if(height(node.right.left) - height(node.right.right) > 0) {
               node.right = rightRotate(node.right);
               return leftRotate(node);
            }

        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t  =c.right;

        c.right = p;
        p.left = t;
        return p;
    }

    public Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        return p;
    }




    public boolean isBalanced(Node node) {

        if(node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    public void populateSorted(int[] nums, int start, int end) {

        if(start >= end) return;

        int mid = start + (end - start) / 2;

        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

    public void display() {
        display(root, "The root node value is: ");
    }

    public void display(Node node, String details) {

        if(node == null) {
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " is: ");
        display(node.right, "Right child of " + node.value + "is: ");
    }

    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node node) {
        if(node == null) return;

        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node node) {
        if(node == null) return;

        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(Node node) {
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }
}
