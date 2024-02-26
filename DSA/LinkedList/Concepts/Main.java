package LinkedList.Concepts;

public class Main {

    public static void main(String... args) {

        LL ll = new LL();

        ll.insertFirst(50);
        ll.insertFirst(40);
        ll.insertFirst(20);
        ll.insertFirst(10);
        ll.insertLast(60);
        ll.insertLast(70);
        ll.insertFirst(0);
        ll.insert(30, 3);
    

        ll.display();

    }
    
}
