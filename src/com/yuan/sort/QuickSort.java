package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,16:35.
 * Description:
 */
public class QuickSort {
    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = getMiddle(arr, start, end);
            quickSort(arr, start, middle - 1);
            quickSort(arr, middle + 1, end);
        }
    }

    // 对数组元素进行划分,选中一个基数,使得他的左边的都比他小,他的右边都比他他大
    private static int getMiddle(int[] arr, int start, int end) {
        int temp = arr[start];
        while (start < end) {
            while (start < end && temp <= arr[end]) {
                end--;
            }
            arr[start] = arr[end];
            while (start < end && temp >= arr[start]) {
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = temp;
        return start;
    }
}
