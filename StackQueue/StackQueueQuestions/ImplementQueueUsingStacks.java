package StackQueue.StackQueueQuestions;

import java.util.*;

// insertion efficient O(1)
public class ImplementQueueUsingStacks {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
   

    ImplementQueueUsingStacks() {
      stack1 = new Stack();
      stack2 = new Stack();
    }

    // insertion is efficient, complexity O(1)
    public void insert(int item) {
        stack1.push(item);
    }


    // removal, complexity O(n)
    public int remove() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int removed = stack2.pop();

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }


        return removed;

    }

    public int peek() {

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int peeked = stack2.peek();

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }


        return peeked;
    }

    
}
