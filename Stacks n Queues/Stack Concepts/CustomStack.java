
class CustomStack {

   private int[] data;
   private int ptr = -1;
   private static int DEFAULT_SIZE = 5;

   CustomStack() {
    this(DEFAULT_SIZE);
   }

   CustomStack(int size) {
        data = new int[size];
   }

   void add(int item) throws Exception {

    if(isFull()) {
        throw new CustomStackException("No more spaces....");
    }

    ptr++;
    data[ptr] = item;

   }

   int pop() throws Exception  {

    if(isEmpty()) {
        throw new CustomStackException("No data to be removed");
    }

    return data[ptr--];
   }

   int peek() throws Exception {

    if(isEmpty()) {
        throw new CustomStackException("No data present....");
    }

    return data[ptr];
   }

   private boolean isFull() {
    return ptr == data.length-1;
   }

   private boolean isEmpty() {
    return ptr == -1;
   }


}