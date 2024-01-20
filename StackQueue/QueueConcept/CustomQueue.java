package StackQueue.QueueConcept;

class CustomQueue {


    protected int[] data;
    private static final int DEFAULT_SIZE = 5;
    protected int end = 0;


    CustomQueue() {
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size) {
        data = new int[size];
    }

    protected boolean insert(int item) {

        if(isFull()) {
            return false;
        }

        data[end++] =  item;
        return true;
    }

    protected boolean isFull() {
         return end == data.length;
    }

    protected boolean isEmpty() {
        return end == 0;
    }

    protected int remove() throws Exception {

        if(isEmpty()) {
           throw new CustomQueueException("Stack is empty");
        }


        int removed = data[0];

          for(int i=1; i<end; i++) {
            data[i-1] = data[i];
          }

          end--;

        return removed;
    }


    protected int front() {

        if(isEmpty()) {
            System.out.println("stack is empty...");
             return -1111111;
          }

        

        return data[0];
    }

    protected void display() {

        for(int i=0; i<end; i++) {
            System.out.print(data[i] + " <- ");
        }

        System.out.println();


    }




}