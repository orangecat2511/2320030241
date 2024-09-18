package threadss;
import java.util.concurrent.*;

class Producer implements Runnable {
 private final BlockingQueue<String> sharedBuffer;

 public Producer(BlockingQueue<String> sharedBuffer) {
     this.sharedBuffer = sharedBuffer;
 }

 public void run() {
     try {
         while (true) {
             String message = "Message " + (int) (Math.random() * 100);
             sharedBuffer.put(message); // Add message to the buffer
             System.out.println("Produced: " + message);
             Thread.sleep((int) (Math.random() * 1000)); // Simulate delay
         }
     } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
     }
 }
}
