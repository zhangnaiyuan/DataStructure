package com.yuan.queue;

/**
 * Created by Yuan on 2017/3/26,16:01.
 * Description: 一群人围成一个圈圈,依次报数,查到k的时候,那个人出去,下一个人接着查
 */
public class Josephus {
    public static Object getJosephus(ArrayQueue queue, int k) {
        if (queue.isEmpty()) {
            return null;
        }
        while (queue.getSize() > 1) {
            queue.transverse();
            for (int i = 1;i<k;i++) {
                queue.enQueue(queue.deQueue());
            }
            System.out.println(queue.deQueue() + "退出");
        }
        return queue.deQueue();
    }

    public static ArrayQueue buildQueue(Object[] objects) {
        ArrayQueue queue = new ArrayQueue(objects.length + 1);
        for (int i = 0; i < objects.length; i++) {
            queue.enQueue(objects[i]);
        }
        return queue;
    }

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (char j = 'A';j<='Z';j++) {
            builder.append(j);
        }
        String[] people = builder.toString().split("");
        System.out.println("最终留下的人是: " + getJosephus(buildQueue(people), 5));
    }
}
