package com.yuan.queue;

import com.yuan.node.Node;

/**
 * Created by Yuan on 2017/3/26,17:32.
 * Description: 使用链表使用队列 链表结构是head --> tail
 */
public class LinkQueue implements IQueue {
    private Node head, tail;
    private int size;

    public LinkQueue() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("队列为空");
        }
        return head.getElem();
    }

    @Override
    public void enQueue(Object object) throws QueueFullException {
        Node node = new Node(object, null);
//        如果是第一个元素,令head和tail都指向这个元素
//        如果不是第一个元素,将这个元素插入到tail元素的后边,让tail的next指针指向这个新元素,再使tail指向这个元素
        if (size == 0) {
            head = node;
        }
        else {
            tail.setNext(node);
        }
        tail = node;
        size++;
    }

    @Override
    public Object deQueue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("队列为空");
        }
//        获取头结点的元素
        Object obj = head.getElem();
        //将head指针移动到下一个元素的身上
        head = head.getNext();
        size--;
        //如果到达0了,那么head指向head的next已经变为null了,但是tail还是指向原来队尾的元素,所以讲tail置为空
        if (size == 0) {
            tail = null;
        }
        return obj;
    }

    @Override
    public void transverse() {
//        从head往tail元素开始遍历,依次取出,知道为null
        Node node = head;
        while (node != null) {
            System.out.println(node.getElem());
            node = node.getNext();
        }
    }
}
