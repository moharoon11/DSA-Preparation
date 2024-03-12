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



    public void insertUsingRecursion(int val, int index) {
        head = insertRecursion(val, index, head);
    }

    private Node insertRecursion(int val, int index, Node node) {

        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index - 1, node.next);
        return node;
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

    public void duplicates() {

        Node node = head;

        while(node.next != null) {

            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
    }

    public static LL merge(LL first, LL second) {
        LL ans = new LL();

        Node f = first.head;
        Node s = second.head;


        while(f != null && s != null) {
            if(f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public void display() {

        Node temp = head;
        while(temp != null) {

            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        LL first = new LL();
        first.insertLast(1);
        first.insertLast(4);
        first.insertLast(7);

        LL second = new LL();
        second.insertLast(0);
        second.insertLast(3);
        second.insertLast(9);
        second.insertLast(9);
        LL ans = LL.merge(first, second);
        ans.display();

    }

    
}


// Questions Leetcode
// Has Cycle

/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }

public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }

        return false;
    }
}
 */

/* Question
Cycle length
======================

public class Solution {
    public int hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                int length  = 0;
                do {
                ListNode temp = slow;
                temp = temp.next;
                length++;
                }
                while(temp != fast);

                return length;
            }
        }

        return 0;
    }
    }

 */
