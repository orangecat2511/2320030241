package generics;

public class Main {
  public static void main(String[] args) {
	  Stack<Integer> linkedListStack = new LinkedListStack<>();
	  linkedListStack.push(10);
	  linkedListStack.push(20);
	  System.out.println("Top element"+linkedListStack.peek());
	  System.out.println("Popped Element"+linkedListStack.pop());
	  
	  Stack<Integer> arrayStack1 = new ArrayStack<>();
      arrayStack1.push(100);
      arrayStack1.push(200);
      System.out.println("Top element (peek): " + arrayStack1.peek()); 
      System.out.println("Popped element: " + arrayStack1.pop());
      
	  Stack<Float> linkedListStack1 = new LinkedListStack<>();
	  linkedListStack1.push(10.5f);
	  linkedListStack1.push(20.5f);
	  System.out.println("Top float element"+linkedListStack.peek());
	  
	  Stack<Float> arrayStack = new ArrayStack<>();
      arrayStack.push(100.5f);
      arrayStack.push(200.2f);
      System.out.println("Top element (peek): " + arrayStack.peek()); 
      System.out.println("Popped element: " + arrayStack.pop());
      
  }
}
