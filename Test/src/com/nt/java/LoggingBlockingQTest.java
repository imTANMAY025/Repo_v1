package com.nt.java;

import java.util.concurrent.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggingBlockingQTest {
    
    private final BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private volatile boolean running = true;

    public LoggingBlockingQTest() {
        // Start background log writer
        executor.submit(() -> {
            while (running || !logQueue.isEmpty()) {
                try {
                    String message = logQueue.poll(1, TimeUnit.SECONDS);
                    if (message != null) {
                        writeLog(message);
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Logger thread interrupted");
                }
            }
            System.out.println("Logger stopped gracefully.");
        });
    }

    public void log(String level, String message) {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String formattedMessage = String.format("[%s] [%s] %s", timestamp, level, message);
        logQueue.offer(formattedMessage);  // Non-blocking enqueue
    }

    private void writeLog(String message) {
        // You can replace this with writing to file, DB, etc.
        System.out.println(message);
    }

    public void shutdown() {
        running = false;
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }

    // Demo usage
    public static void main(String[] args) throws InterruptedException {
        LoggingBlockingQTest logger = new LoggingBlockingQTest();

        for (int i = 1; i <= 5; i++) {
            logger.log("INFO", "Processing task " + i);
            Thread.sleep(200); // Simulate work
        }

        logger.log("ERROR", "Something went wrong!");
        logger.shutdown();
    }
}
