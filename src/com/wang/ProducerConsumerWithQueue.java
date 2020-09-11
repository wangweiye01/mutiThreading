package com.wang;

import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerWithQueue {
    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
        ProducerConsumerWithQueue test = new ProducerConsumerWithQueue();
        Producer producer = test.new Producer();
        Consumer consumer = test.new Consumer();

        consumer.start();
		producer.start();
    }

    class Consumer extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    queue.take();
                    System.out.println("从队列取走一个元素，队列剩余：" + queue.size() + "个元素");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Producer extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    queue.put(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
