package Queue;

import ArrayStack.Stack;

public class ArrayQueue {
	
	 		private static int capacity;
	 		private int top = 9;
	 		private int down = 9;
	 		private String[] storage;
	 		
	 		
	 public ArrayQueue(int size) {
		 
		    capacity = size; 
		    storage = new String [capacity];
		  }

	 public void show() {
		  // the top of the stack starts from array[0] then newer item gets added on top of another until it reaches its capacity limit
		    for (int i = capacity-1; i >= 0; i--) {
		     System.out.println(" Queue["+i+"]= "+ storage[i]);
		  
		      /* print like this: 
		      stack[9]   = 10th value
		      stack[8]   = 9th value
		      stack[7]   = 8rd value
		      ....  
		      stack[1]   = 2nd value
		      stack[0]   = 1st value
		      */
		    }
		    System.out.println();
		  } 

	 private boolean isEmpty() {
	
		 if (storage[top] == null) {
		      System.out.println("the stroge is empty");
		      // print error message
		      System.out.println();
		      return true;
		    } 
		    return false;
		  }

	 private boolean isFull() {

		 if (down == -1) {
		       System.out.println("The stroge is full");
		      // print error message
		      return true;
		    } 
		    return false;
		  }
	 public void push(String value) {
	
		 if (isFull()) { 
		     System.out.println("The stroge is full");

		      // print error message
		      System.out.println();
		    } else {
		      System.out.println("... trying to push on stack[" + down + "] ...");
		      storage[down] = value;
		      	down--;
		      System.out.println(value + " was successfully added.");
		      System.out.println();
		    }
		  }

	 public void pop() {
		    if (isEmpty()) {
		     
		     System.out.println("the stroge is empty");
		      // print error message
		      System.out.println();
		    } else {
		   
		      System.out.println("... trying to pop stack[" + (top) + "] ...");
		      storage[top] = null;
		      top--;
		    
		     
		      System.out.println(storage[top] + " was successfully removed.");
		      System.out.println();
		    }
		  }

	 public void peek() {
		    if (storage[top] == storage[0]) {
		      System.out.println("PEEK TOP = " + storage[top]);
		      System.out.println();
		    } else {
		      System.out.println("PEEK TOP = " + storage[top-1]);
		      System.out.println();
		    }
		  }
		  
		  public static void main(String[] args) {
		    // construct a new array queue and assign 10 as the integer value for the size limit of the stack
		    ArrayQueue queueobject = new ArrayQueue(10);
			  System.out.println("STORAGE CAPACITY = " + 10);
		    System.out.println();
		    // show empty stack
		    queueobject.show();
		    // try removing on an empty stack
		    queueobject.pop();
		    // peek top element of an empty stack
		    queueobject.push("one");
		   
		    // show the updated stack
		    queueobject.show();
		    // peek if top element is "one"
		    queueobject.peek();    
		    queueobject.push("two");
		    // show the updated stack
		    queueobject.show();
		    // peek if top element is "two"
		    queueobject.push("three");
		    // show the updated stack
		    queueobject.show();    
		    // peek if top element is "three"
		    queueobject.peek();    
		    queueobject.push("four");
		    // show the updated stack
		    queueobject.show();   
		    queueobject.push("five"); 
		    // show the updated stack
		    queueobject.show();
		    // try removing "five"
		   queueobject.pop();
		    queueobject.show();  
		    queueobject.push("six"); 
		    queueobject.push("seven"); 
		    queueobject.push("eight"); 
		    queueobject.push("nine");    
		    queueobject.push("ten"); 
		    // show the updated stack
		    queueobject.show();
		    // peek if top element is "ten"
		
		    // try adding "eleven"
		    queueobject.push("eleven"); 
		    // try adding "twelve"
		    queueobject.push("twelve");
		    // show the updated stack
		    queueobject.show();
		  }  

		}



