package Trees;

public class SegmentTree {

    public static void main(String... args) {

        int[] arr = {3, 8, 7, 6, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        tree.display();
    }

    private static class Node {

        private int data;
        private int startInterval;
        private int endInterval;
        private Node left;
        private Node right;

        Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }

    private Node root;

    public SegmentTree(int[] arr) {
        root = construct(arr, 0, arr.length - 1);
    }


    // revision is debugging the construct method
    public Node construct(int[] arr, int start, int end) {

        if(start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = start + (end - start) / 2;

        node.left = construct(arr, start, mid);
        node.right = construct(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(root);
    }

    public void display(Node node) {

        if (node != null) {
            System.out.println("[" + node.startInterval + ", " + node.endInterval + "] => " + node.data);

            display(node.left);
            display(node.right);
        }
    }

    public int query(Node node, int qsi, int qei) {

        if(node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        } else if(node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }

    public int update(Node node, int index, int value) {

        if(index >= node.startInterval && index <= node.endInterval) {

            if(index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }


        return node.data;
    }




}
