package StackQueue.QueueConcept;

public class DynamicQueueMain {

    public static void main(String... args) throws Exception {

        CircularQueue dq = new DynamicQueue();

      dq.insert(1);
      dq.insert(2);
      dq.insert(3);
      dq.insert(4);
      dq.insert(5);
      dq.insert(6);

      dq.display();

      dq.remove();

      dq.display();


      dq.remove();

      dq.remove();

      dq.remove();

      dq.display();


      dq.remove();

      dq.display();


      dq.remove();

      dq.display();


      dq.remove();

      dq.display();


    


    }

    
}
