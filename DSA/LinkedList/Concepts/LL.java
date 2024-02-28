package LinkedList.Concepts;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    LL() {
        this.size = 0;
    }



    private class Node {

        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String toString() {
            return "LL [ Node [ value = " + value + ", next = " + next + "]]";
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int value) {
        // if tail is not provided this is how we add in the last
    //    Node temp = head;


    //    if(head == null) {
    //      insertFirst(value);
    //    }

    //    while(temp != null) {

    //       if(temp.next == null) {
              
    //            Node node = new Node(value);
    //            temp.next = node;
    //            tail = node;
    //            break;
    //       }

    //       temp = temp.next;
        
       if(tail == null) {
        insertFirst(value);
        return;
       }

       Node node = new Node(value);
       tail.next = node;
       tail = node;
       size++;
    }
    public void insert(int value, int index) {

        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index ==  size) {
            insertLast(value);
            return;
        }

        Node temp = head;







        for(int i=1; i<index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;

        if(head == null) {
            tail = null;
        }

        size--;

        return value;
    }

    private Node get(int index) {
        Node temp = head;


        for(int i=0; i<index; i++) {

            temp = temp.next;
        }

        return temp;
    }


    public int deleteLast() {

        if(size <= 1) {
            deleteFirst();
        }


        int value = tail.value;

        Node node = get(size - 2);
        tail = node;
        tail.next = null;
        size--;
        return value;
    }

    public int delete(int index) {

        if(index == 0) {
            return deleteFirst();
        }

        if(index == size - 1) {
            return deleteLast();
        }

        Node node = get(index);
        int value = node.next.value;
        node.next = node.next.next;
        size--;
        return value;
    }

    public Node find(int value) {

        Node node = head;

        while(node != null) {
            if(node.value == value) return node;
            node = node.next;
        }

        return null;
    }




    public void display() {

        Node temp = head;
        while(temp != null) {

            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    
}
