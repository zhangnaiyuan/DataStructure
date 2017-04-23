package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,17:26.
 * Description: 希尔排序
 */
public class ShellSort {
    public static void sort(int[] arr) {
        int step = arr.length >>> 1;
        int i = 0, j = 0, temp = 0;
        while (step >= 1) {
            for (i = step; i < arr.length; i += step) {
                temp = arr[i];
                for (j = i - step; j >= 0 && arr[j] >= temp; j -= step) {
                    arr[j + step] = arr[j];
                }
                arr[j + step] = temp;
            }
            step >>>= 1;
        }
    }
}
