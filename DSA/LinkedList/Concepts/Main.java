package LinkedList.Concepts;

public class Main {

    public static void main(String... args) {

//        LL ll = new LL();
//
//       ll.insertLast(1);
//       ll.insertLast(2);
//       ll.insertLast(3);
//
//       ll.display();
//       ll.delete(1);
//       ll.display();

        DLL dll = new DLL();
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(1);
        dll.insertLast(4);
        dll.insert(2, 20);

        dll.display();



    }
    
}
