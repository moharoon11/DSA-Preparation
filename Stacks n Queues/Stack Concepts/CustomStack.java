class CustomStack {

   protected int[] data;
   private int ptr = -1;
   private static int DEFAULT_SIZE = 5;

   CustomStack() {
    this(DEFAULT_SIZE);
   }

   CustomStack(int size) {
        data = new int[size];
   }

   protected boolean push(int item) {

    if(isFull()) {
        System.out.println("Stack is full...");
        return false;
    }

    ptr++;
    data[ptr] = item;

    return true;
   }

   protected int pop() throws Exception  {

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

   protected boolean isFull() {
    return ptr == data.length-1;
   }

   protected boolean isEmpty() {
    return ptr == -1;
   }


}