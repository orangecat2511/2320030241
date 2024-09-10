package generics;

interface Stack<P> {  //p is generic data type;
   void push(P item);
   P pop();
   P peek();
   boolean isEmpty();
}
