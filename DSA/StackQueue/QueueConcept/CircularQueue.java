package StackQueue.QueueConcept;

class CircularQueue {

    protected int[] data;
    protected static final int DEFAULT_SIZE = 5;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    CircularQueue() {
        this(DEFAULT_SIZE);
    }

    CircularQueue(int size) {
        data = new int[size];
    }



    protected boolean insert(int item) {

        if(isFull()) {
            return false;
        }

        data[end++] = item;
        end %= data.length;
        size++;

        return true;
    }



    protected int remove() throws Exception {

        if(isEmpty()) {
            throw new CustomQueueException("stack is empty...");
        }

        int removed = data[front++];

        front %= data.length;
        size--;

        return removed;
    }

    protected int front() throws Exception {

        if(isEmpty()) {
            throw new CustomQueueException("stack is empty...");
        }

        return data[front];
    }

    protected void display() throws Exception {
        if(isEmpty()) {
            throw new CustomQueueException("nothing to display...");
        }

        int i = front;

        do {
            System.out.print(data[i++] + " <- ");
            i %= data.length;


        } while(i!=end);

        System.out.println(" END ");


    }


    protected boolean isEmpty() {
      return size == 0;
    }

    protected boolean isFull() {
        return size == data.length;
    }





}