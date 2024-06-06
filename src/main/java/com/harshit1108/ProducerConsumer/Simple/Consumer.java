package com.harshit1108.ProducerConsumer.Simple;

import java.util.logging.Logger;

public class Consumer implements Runnable {
    private static final Logger log = Logger.getLogger(Consumer.class.getCanonicalName());
    private boolean running = false;
    private final QueueBlock queueBlock;

    public Consumer(QueueBlock queueBlock) {
        this.queueBlock = queueBlock;
    }

    @Override
    public void run() {
        running = true;
        consume();
    }

    public void stop() {
        running = false;
    }

    public void consume() {
        while (running) {

            if (queueBlock.isEmpty()) {
                try {
                    queueBlock.waitConsumerAsQueueIsEmptyForConsumingMessage();
                } catch (InterruptedException e) {
                    log.severe("Error while waiting to Consume messages.");
                    break;
                }
            }

            // avoid spurious wake-up
            if (!running) {
                break;
            }

            Message message = queueBlock.poll();
            useMessage(message);

            //Sleeping on random time to make it realistic
            ThreadUtil.sleep((long) (Math.random() * 100));
        }
        log.info("Consumer Stopped");
    }

    private void useMessage(Message message) {
        if (message != null) {
            log.info(String.format("[%s] Consuming Message. Id: %d, Data: %f%n",
                    Thread.currentThread().getName(), message.getId(), message.getMsg()));
        }
    }

}