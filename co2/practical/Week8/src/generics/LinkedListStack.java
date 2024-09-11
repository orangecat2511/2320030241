package generics;

import java.util.LinkedList;


public class LinkedListStack<P> implements Stack<P>  {
	private LinkedList<P> list = new LinkedList<>();
          public void push(P item) {
        	   list.addFirst(item);
           }
          public P pop() {
              return list.removeFirst();
          }
          public P peek() {
              return list.getFirst();
          }
          public boolean isEmpty() {
              return list.isEmpty();
          }
}
