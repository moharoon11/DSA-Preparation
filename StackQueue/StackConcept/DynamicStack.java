package StackQueue.StackConcept;

class DynamicStack extends CustomStack {


   DynamicStack() {
    super();
   }

   DynamicStack(int size)  {
    super(size);
   }

   @Override
   protected boolean push(int item) {
    
    if(isFull()) {

         int[] temp = new int[data.length * 2];

         for(int i=0; i<data.length; i++) {
            temp[i] = data[i];
         }

         data = temp;
    }

    return super.push(item);
   }


}