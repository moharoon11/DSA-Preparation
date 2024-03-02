package Trees;

import java.util.Scanner;
public class BinaryTree {
    private Node root;
    private static class Node {
        private final int value;
        private  Node left;
        private Node right;
        Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the value of root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node) {

        System.out.println("Do you want to insert at the left of this node " + node.value);
        boolean isLeft = scanner.nextBoolean();

        if(isLeft) {
            System.out.println("Enter the value to insert at the left of this node " + node.value);
            int value = scanner.nextInt();
            Node left = new Node(value);
            node.left  = left;
            populate(scanner, left);
        }

        System.out.println("Do you want to insert at the right of this node " + node.value);
        boolean isRight = scanner.nextBoolean();

        if(isRight) {
            System.out.println("Enter the value to insert at the right of this node " + node.value);
            int value = scanner.nextInt();
            Node right = new Node(value);
            node.right = right;
            populate(scanner, right);
        }
    }


    public void display() {
        display(root, "");
    }

    public void display(Node node, String intend) {
        if(node == null) return;
        System.out.println(intend + node.value);
        display(node.left, intend + "\t");
        display(node.right, intend + "\t");
    }

    public static void main(String... args) {
        BinaryTree tree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        tree.populate(scanner);
        tree.display();
    }






}
