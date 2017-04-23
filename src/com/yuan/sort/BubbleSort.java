package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,16:32.
 * Description: 冒泡排序
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        int i, j, temp;
        // 定义遍历的次数
        for (i = 0; i < arr.length; i++) {
            // 第0次,是遍历整个数组,将最大数放在最后
            // 第二次.是遍历到倒数第二个元素,将此时最大的元素放在倒数第二个位置
            // .....
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
