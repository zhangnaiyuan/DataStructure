package com.yuan.stack;

/**
 * Created by Yuan on 2017/3/26,0:18.
 * Description: 栈常用算法的接口
 */
public interface IStack {
    /**
     * 放回栈中的元素数目
     * @return 元素数目
     */
    int getSize();

    /**
     * 返回栈是否是空的
     * @return 是否为空栈
     */
    boolean isEmpty();

    /**
     * 取出栈顶的元素
     * @return 栈顶元素
     * @throws StackEmptyException 栈为空的,不存在栈顶的元素
     */
    Object getTop() throws StackEmptyException;

    /**
     * 入栈
     * @param object 入栈的元素
     */
    void push(Object object);

    /**
     * 出栈
     * @return 出栈的元素
     * @throws StackEmptyException 栈是空的,不存在元素
     */
    Object pop() throws StackEmptyException;
}
