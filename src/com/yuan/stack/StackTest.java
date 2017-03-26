package com.yuan.stack;

/**
 * Created by Yuan on 2017/3/26,0:40.
 * Description:
 */
public class StackTest {
    public static void main(String[] args) {
        LinkStack stack = new LinkStack();
        for (int i = 0; i < 10; i++) {
            System.out.println("入栈: " + i);
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println("出栈: "+stack.pop());
        }
    }
}
