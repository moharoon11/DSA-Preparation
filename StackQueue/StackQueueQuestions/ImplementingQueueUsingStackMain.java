package StackQueue.StackQueueQuestions;

public class ImplementingQueueUsingStackMain {

    public static void main(String[] args) throws Exception {
        
        // insertion is effiecient, complexity for insertion o(1) for removal o(n)
        ImplementQueueUsingStacks qs = new ImplementQueueUsingStacks();
        qs.insert(1);
        qs.insert(2);
        qs.insert(3);
        qs.insert(4);
        qs.insert(5);

        System.out.println(qs.remove());
        System.out.println(qs.remove());

        qs.insert(6);
        qs.insert(7);
        qs.insert(8);

        System.out.println(qs.remove());
        System.out.println(qs.remove());
        System.out.println(qs.remove());

        System.out.println(qs.remove());
        System.out.println(qs.remove());
        System.out.println(qs.remove());

         // removal is efficient, comlexity is O(1) for removal for inserting O(n)
        ImplementingQueueUsingStacksRemove qsr = new ImplementingQueueUsingStacksRemove();
        qsr.insert(100);
        qsr.insert(200);
        qsr.insert(300);

        System.out.println(qsr.remove());
        System.out.println(qsr.remove());

        qsr.insert(400);
        qsr.insert(500);
        System.out.println(qsr.remove());
        System.out.println(qsr.remove());
        System.out.println(qsr.remove());

     
    }
    
}
