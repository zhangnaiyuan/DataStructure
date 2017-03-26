package com.yuan.queue;

/**
 * Created by Yuan on 2017/3/26,15:13.
 * Description: 队列常用算法接口
 */
public interface IQueue {
    /**
     * 返回队列中的元素总的数目
     * @return 元素数目
     */
    int getSize();

    /**
     * 返回队列是否为空
     * @return 是否为空
     */
    boolean isEmpty();

    /**
     * 返回队列中的队头元素
     * @return 队头元素
     */
    Object front() throws QueueEmptyException;

    /**
     * 入队操作
     * @param object 入队的元素
     */
    void enQueue(Object object) throws QueueFullException;

    /**
     * 出队操作
     * @return 出队的元素
     */
    Object deQueue() throws QueueEmptyException;

    /**
     * 遍历队列
     */
    void transverse();
}
