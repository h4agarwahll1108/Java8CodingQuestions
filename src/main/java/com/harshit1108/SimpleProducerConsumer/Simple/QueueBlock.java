package com.harshit1108.SimpleProducerConsumer.Simple;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBlock {
    private final Queue<Message> queue = new LinkedList<>();
    private final int maxSize;
    private final Object IS_NOT_FULL = new Object();
    private final Object IS_NOT_EMPTY = new Object();

    QueueBlock(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return queue.size() == maxSize;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void waitProducerAsQueueIsNotEmptyForProducingMessage() throws InterruptedException {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.wait();
        }
    }

    public void waitConsumerAsQueueIsEmptyForConsumingMessage() throws InterruptedException {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.wait();
        }
    }

    public void add(Message message) {
        queue.add(message);
        notifyConsumerForConsumingTheProducedMessage();
    }

    public Message poll() {
        Message mess = queue.poll();
        notifyProducerForProducingTheMessage();
        return mess;
    }

    public Integer getSize() {
        return queue.size();
    }

    private void notifyProducerForProducingTheMessage() {
        synchronized (IS_NOT_FULL) {
            IS_NOT_FULL.notify();
        }
    }

    private void notifyConsumerForConsumingTheProducedMessage() {
        synchronized (IS_NOT_EMPTY) {
            IS_NOT_EMPTY.notify();
        }
    }
}