package com.yuan.queue;

/**
 * Created by Yuan on 2017/3/26,15:12.
 * Description:
 */
public class ArrayQueue implements IQueue {
    public static final int MAX_CAPACITY = 100;
    private int capacity;
    //front 指向队头元素,rail指向队尾元素的下一个
    private int front = 0, rail = 0;
    private Object[] objs;

    public ArrayQueue() {
        this(MAX_CAPACITY);
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.objs = new Object[capacity];
    }

    /**
     *  capacity - (front - rail)
     * @return 容量
     */
    @Override
    public int getSize() {
        return (capacity - (front - rail)) % capacity;
    }

    @Override
    public boolean isEmpty() {
        return rail == front;
    }

    @Override
    public Object front() {
        if (isEmpty()) {
            throw new QueueEmptyException("队列为空");
        }
        return this.objs[front];
    }
//  因为队列为空的时候front == rail,如果只剩下一个空闲的单元,插入后 rail = (rail + 1) % capacity会再次front == rail
//    解决的办法就是预留一个空闲的单元不保留任何元素
    @Override
    public void enQueue(Object object) {
        if (getSize() == capacity - 1) {
            throw new QueueFullException("队列已满");
        }
        objs[rail] = object;
        rail = (rail + 1) % capacity;
    }

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            throw new QueueEmptyException("队列为空");
        }
        Object elem = objs[front];
        front = (front + 1) % capacity;
        return elem;
    }

    @Override
    public void transverse() {
        for (int i = front; i < rail; i++) {
            System.out.print(objs[i]);
        }
        System.out.println();
    }
}
