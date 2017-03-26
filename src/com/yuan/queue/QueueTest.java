package com.yuan.queue;

/**
 * Created by Yuan on 2017/3/26,15:32.
 * Description:
 */
public class QueueTest {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(11);
        for (int i = 0; i < 10; i++) {
            System.out.println("入队: " + i);
            queue.enQueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.println("出队: " + queue.deQueue());
        }
    }
}
