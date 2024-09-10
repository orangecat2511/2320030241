package generics;

import java.util.Arrays;

public class ArrayStack<P> implements Stack<P> {
    private static final int INITIAL_CAPACITY = 10;
    private P[] array;
    private int top = -1;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (P[]) new Object[INITIAL_CAPACITY]; // Initialize the array
    }

    @Override
    public void push(P item) {
        if (top == array.length - 1) {
            array = Arrays.copyOf(array, array.length * 2); // Resize the array if full
        }
        array[++top] = item;
    }

    @Override
    public P pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top--];
    }

    @Override
    public P peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
