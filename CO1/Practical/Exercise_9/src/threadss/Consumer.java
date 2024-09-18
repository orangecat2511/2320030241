package threadss;
import java.util.concurrent.*;

class Consumer implements Runnable {
    private final BlockingQueue<String> sharedBuffer;

    public Consumer(BlockingQueue<String> sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String message = sharedBuffer.take();
                System.out.println("Consumed: " + message);
                Thread.sleep((int) (Math.random() * 1000));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}