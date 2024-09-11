package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
class PriorityQ<T extends Comparable<T>> {
    private ArrayList<T> heap;
    public PriorityQ() {
        this.heap = new ArrayList<>();
    }
    public void enqueue(T element) {
        heap.add(element);
        heapifyUp(heap.size() - 1);
    }
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        Collections.swap(heap, 0, heap.size() - 1);
        T minElement = heap.remove(heap.size() - 1);
        heapifyDown(0);
        return minElement;
    }
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        return heap.get(0); 
    }
    public boolean isEmpty() {
        return heap.size() == 0;
    }
    public int size() {
        return heap.size();
    }
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) < 0) {
                Collections.swap(heap, index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }
    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallest = index;

            if (leftChild < size && heap.get(leftChild).compareTo(heap.get(smallest)) < 0) {
                smallest = leftChild;
            }
            if (rightChild < size && heap.get(rightChild).compareTo(heap.get(smallest)) < 0) {
                smallest = rightChild;
            }
            if (smallest != index) {
                Collections.swap(heap, index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }
}
