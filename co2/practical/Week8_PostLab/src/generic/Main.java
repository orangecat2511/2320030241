package generic;

public class Main {
    public static void main(String[] args) {
        // Test with Integer type
        PriorityQ<Integer> intQueue = new PriorityQ<>();
        intQueue.enqueue(5);
        intQueue.enqueue(2);
        intQueue.enqueue(8);
        intQueue.enqueue(1);
        System.out.println("Priority Queue (Integer) - Peek: " + intQueue.peek());
        System.out.println("Dequeue elements (Integer):");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        // Test with Double type
        PriorityQ<Double> doubleQueue = new PriorityQ<>();
        doubleQueue.enqueue(3.5);
        doubleQueue.enqueue(0.8);
        doubleQueue.enqueue(2.3);
        System.out.println("\nPriority Queue (Double) - Peek: " + doubleQueue.peek());
        System.out.println("Dequeue elements (Double):");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.dequeue());
        }

        // Test with String type
        PriorityQ<String> stringQueue = new PriorityQ<>();
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Grape");
        stringQueue.enqueue("Mango");
        System.out.println("\nPriority Queue (String) - Peek: " + stringQueue.peek());
        System.out.println("Dequeue elements (String):");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
    }
}

