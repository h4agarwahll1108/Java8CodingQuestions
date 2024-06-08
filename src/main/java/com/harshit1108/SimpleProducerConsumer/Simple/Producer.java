package com.harshit1108.SimpleProducerConsumer.Simple;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class Producer implements Runnable {
    private static final Logger log = Logger.getLogger(Producer.class.getCanonicalName());
    private static final AtomicInteger idSequence = new AtomicInteger(0);
    private boolean running = false;
    private final QueueBlock queueBlock;

    public Producer(QueueBlock queueBlock) {
        this.queueBlock = queueBlock;
    }

    @Override
    public void run() {
        running = true;
        produce();
    }

    public void stop() {
        running = false;
    }

    public void produce() {

        while (running) {

            if (queueBlock.isFull()) {
                try {
                    queueBlock.waitProducerAsQueueIsNotEmptyForProducingMessage();
                } catch (InterruptedException e) {
                    log.severe("Error while waiting to Produce messages.");
                    break;
                }
            }

            // avoid spurious wake-up
            if (!running) {
                break;
            }

            queueBlock.add(generateMessage());

            log.info("Size of the queue is: " + queueBlock.getSize());

            //Sleeping on random time to make it realistic
            ThreadUtil.sleep((long) (Math.random() * 100));
        }

        log.info("Producer Stopped");
    }

    private Message generateMessage() {
        Message message = new Message(idSequence.incrementAndGet(), Math.random());
        log.info(String.format("[%s] Generated Message. Id: %d, Data: %f%n",
                Thread.currentThread().getName(), message.getId(), message.getMsg()));

        return message;
    }

}