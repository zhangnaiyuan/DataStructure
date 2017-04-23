package com.yuan.sort;

import java.util.Arrays;

/**
 * Created by Yuan on 2017/4/23,16:29.
 * Description:
 */
public class SortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 8, 1, 3, 9, 5, 3, 0, 4, 6};
//        SelectionSort.sort(arr);
//        BubbleSort.sort(arr);
//        QuickSort.sort(arr);
        MergeSort.sort(arr);
//        InsertSort.sort(arr);
//        BinaryInsertSort.sort(arr);
//        ShellSort.sort(arr);
//        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
