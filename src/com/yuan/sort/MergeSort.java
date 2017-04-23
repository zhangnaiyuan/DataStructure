package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,16:45.
 * Description: 归并排序
 */
public class MergeSort {
    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        int[] tempArr = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        int k = 0;
        // 比较两组元素,把最小的元素划分到临时数组中
        while (i <= middle && j <= end)
        {
            if (arr[i] < arr[j])
            {
                tempArr[k++] = arr[i++];
            }
            else
            {
                tempArr[k++] = arr[j++];
            }
        }
        // 把每组剩余的元素划分到临时数组中
        while (i <= middle)
        {
            tempArr[k++] = arr[i++];
        }
        while (j <= end)
        {
            tempArr[k++] = arr[j++];
        }
        // 把临时数组的元素拷贝至原数组的相应位置
        System.arraycopy(tempArr, 0, arr, start, tempArr.length);
    }
}
