package StackQueue.QueueConcept;

public class DynamicQueue extends CircularQueue 
{

    DynamicQueue() {
      super();
    }

    DynamicQueue(int size) {
      super(size);
    }


    @Override
    protected boolean insert(int item) {

        if(isFull()) {


            int temp[] = new int[data.length * 2];

            for(int i=0; i<data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length;
            data = temp;

        }

        return super.insert(item);
    }
    
}
