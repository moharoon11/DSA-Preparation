package LinkedList.Concepts;

public class DLL {

    public static void main(String... args) {

    }

    private Node head;

    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null)
            head.prev = node;
        head = node;

    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node find(int value) {

        Node node = head;

        while(node != null) {
            if(node.value == value)
            {
                return node;
            }
            node  = node.next;
        }

        return null;
    }
    public void insert(int after, int value) {

        Node p = find(after);

        if(p == null) {
            System.out.println("Does not exist!!!");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if(node.next != null) {
            node.next.prev = node;
        }

    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }

        System.out.println("END");

        System.out.println();

        System.out.println("Printing in reverse");

        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

        System.out.println("START");
    }

    private class Node {

        private int value;
        private Node next;
        private Node prev;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
