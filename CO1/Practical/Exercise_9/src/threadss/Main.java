package threadss;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<String> sharedBuffer = new LinkedBlockingQueue<>(10); // Buffer with capacity 10
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}