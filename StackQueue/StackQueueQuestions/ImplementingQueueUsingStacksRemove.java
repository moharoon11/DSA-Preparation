package StackQueue.StackQueueQuestions;

import java.util.Stack;


// removal efficient O(1)
class ImplementingQueueUsingStacksRemove {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
   

    ImplementingQueueUsingStacksRemove() {
      stack1 = new Stack();
      stack2 = new Stack();
    }

    public void insert(int item) {

      while(!stack1.isEmpty()) {
         stack2.push(stack1.pop());
      }

      stack1.push(item);

      while(!stack2.isEmpty()) {
        stack1.push(stack2.pop());
      }

    }
    
    public int remove() {
      return stack1.pop();
    }

    public int peek() {
      return stack1.peek();
    }
 
}
