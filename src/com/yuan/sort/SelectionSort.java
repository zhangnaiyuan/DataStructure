package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,16:20.
 * Description: 选择排序
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        int i, j, min,n;
        for (i = 0; i < arr.length; i++) {
            // 假设起始元素是最小的,然后往后遍历,找到最小的,记录他的位置
            min = arr[i];
            n = i;
            for (j = i+1;j<arr.length;j++) {
                if (min > arr[j]) {
                    // 记录当前最小元素和他的下标
                    min = arr[j];
                    n = j;
                }
            }
            // 将其实元素放在最小的位置,在将最小的元素放在起始位置,相当于最小的元素和当前遍历的起始元素换了一下位置
            arr[n] = arr[i];
            arr[i] = min;
        }
    }
}
