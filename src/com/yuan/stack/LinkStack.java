package com.yuan.stack;

import com.yuan.node.Node;

/**
 * Created by Yuan on 2017/3/26,17:18.
 * Description: 使用链表实现栈的结构,链表结构是top --> bottom
 */
public class LinkStack implements IStack {
    private int size;
    private Node top;

    public LinkStack() {
        top = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Object getTop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("栈为空");
        }
        return top.getElem();
    }

    @Override
    public void push(Object object) throws StackFullException {
        //新插入的节点的next指向前一个元素
        top = new Node(object, top);
        size++;

    }

    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("栈为空");
        }
        Object obj = top.getElem();
        //将指针移动到前一个元素身上
        top = top.getNext();
        size--;
        return obj;
    }
}
