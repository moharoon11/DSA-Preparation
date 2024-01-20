package StackQueue.QueueConcept;

class CircularQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 5;
    private int front = 0;
    private int end = 0;
    private int size = 0;


    CircularQueue() {
       this(DEFAULT_SIZE);
    }

    CircularQueue(int size) {
        data = new int[size];
    }

    private boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }


    public boolean insert(int item) {

        if(isFull()) {
            return false;
        }

        data[end++] = item;
        end %= data.length;
        size++;

        return true;
    }

    public int remove() throws Exception {

        if(isEmpty()) {
            throw new CustomQueueException("Queue is empty....");
        }

        int removed = data[front++];

        front %= data.length;
        size--;
        return removed;
    }


    public int front() throws Exception {
        if(isEmpty()) {
            throw new CustomQueueException("Queue is empty....");
        }

        return data[front];
        
    }

    public void display() throws Exception {

        if(isEmpty()) {
            throw new CustomQueueException("Queue is empty....");
        }

        int i = front;

        do {
            System.out.print(data[i++] + " <- ");
            i %= data.length;
        } while(i != end);

        System.out.println("END");
    }


}