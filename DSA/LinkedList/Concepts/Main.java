package LinkedList.Concepts;

public class Main {

    public static void main(String... args) {


        LL ll = new LL();


        ll.insertUsingRecursion(1,0);
        ll.insertUsingRecursion(1, 1);
        ll.insertUsingRecursion(2, 2);
        ll.insertUsingRecursion(3, 3);
        ll.insertUsingRecursion(3, 4);

       ll.display();
       ll.duplicates();
       ll.display();

//        DLL dll = new DLL();
//        dll.insertFirst(3);
//        dll.insertFirst(2);
//        dll.insertFirst(1);
//        dll.insertLast(4);
//        dll.insert(2, 20);
//
//        dll.display();
//
//        CLL list = new CLL();
//        list.insert(10);
//        list.insert(20);
//        list.insert(30);
//        list.delete(20);
//
//        list.display();

    }
    
}
