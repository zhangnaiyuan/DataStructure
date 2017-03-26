package com.yuan.stack;

/**
 * Created by Yuan on 2017/3/26,0:40.
 * Description:
 */
public class StackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("入栈: " + i);
            stack.push(i);
        }
        try {
            stack.push(11);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        while(!stack.isEmpty()){
            System.out.println("出栈: "+stack.pop());
        }
        try {
            stack.pop();
        }
        catch (StackEmptyException e) {
            e.printStackTrace();
        }
    }
}
