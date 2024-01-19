
package StackQueue.StackConcept;

public class CustomStackMain {

    public static void main(String... args) throws Exception {

     CustomStack stack = new DynamicStack();
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     stack.push(5);
     stack.push(6);
     stack.push(7);
     stack.push(8);
     stack.push(9);
     stack.push(10);

     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());
     System.out.println(stack.pop());


    }


}