package com.yuan.queue;

/**
 * Created by Yuan on 2017/3/26,15:12.
 * Description:
 */
public class ArrayQueue implements IQueue {
    public static final int MAX_CAPACITY = 100;
    private int capacity;
    //head 指向队头元素,rail指向队尾元素的下一个
    private int head = 0, tail = 0;
    private Object[] objs;

    public ArrayQueue() {
        this(MAX_CAPACITY);
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.objs = new Object[capacity];
    }

    /**
     *  capacity - (head - tail)
     * @return 容量
     */
    @Override
    public int getSize() {
        return (capacity - (head - tail)) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    @Override
    public Object front() {
        if (isEmpty()) {
            throw new QueueEmptyException("队列为空");
        }
        return this.objs[head];
    }
//  因为队列为空的时候front == tail,如果只剩下一个空闲的单元,插入后 tail = (tail + 1) % capacity会再次front == tail
//    解决的办法就是预留一个空闲的单元不保留任何元素
    @Override
    public void enQueue(Object object) {
        if (getSize() == capacity - 1) {
            throw new QueueFullException("队列已满");
        }
        objs[tail] = object;
        tail = (tail + 1) % capacity;
    }

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            throw new QueueEmptyException("队列为空");
        }
        Object elem = objs[head];
        head = (head + 1) % capacity;
        return elem;
    }

    @Override
    public void transverse() {
        for (int i = head; i < tail; i++) {
            System.out.print(objs[i]);
        }
        System.out.println();
    }
}
