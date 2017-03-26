package com.yuan.stack;

import java.util.EmptyStackException;

/**
 * Created by Yuan on 2017/3/26,0:16.
 * Description: 使用数组实现Stack
 */
public class ArrayStack implements IStack {
    //默认的容量
    public static final int MAXCAPACIRY = 100;
    //实际的容量
    private int capacity;
    //对象数组
    private Object[] objs;
    //栈顶指针
    private int top = -1;

    /**
     * 创建默认的栈
     */
    public ArrayStack() {
        this(MAXCAPACIRY);
    }

    /**
     * 创建指定大小的栈
     * @param capacity 栈的大小
     */
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.objs = new Object[capacity];
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public Object getTop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("栈为空");
        }
        return objs[top];
    }

    @Override
    public void push(Object object) {
        if (top == capacity - 1) {
            throw new StackFullException("栈溢出");
        }
        objs[++top] = object;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("栈为空");
        }
        return objs[top--];
    }
}
