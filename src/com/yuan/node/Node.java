package com.yuan.node;

/**
 * Created by Yuan on 2017/3/26,17:15.
 * Description: 链表的节点元素
 */
public class Node implements Position {
    private Object elem;
    //下一个元素
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(Object elem, Node next) {
        this.elem = elem;
        this.next = next;
    }

    @Override
    public Object getElem() {
        return elem;
    }

    @Override
    public Object setElem(Object obj) {
        Object old = elem;
        elem = obj;
        return old;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
