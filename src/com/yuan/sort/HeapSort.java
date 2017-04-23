package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,17:37.
 * Description: 堆排序
 */
public class HeapSort {
    public static void sort(int[] arr) {
        buildMaxHeap(arr);//建立最大堆
        for (int i = arr.length - 1; i >= 1; i--) {
            // 因为a【0】始终是最大的元素，因此将其放到后边，所以顺序是从小到大
            swap(arr, 0, i);
            // 因为换了之后，堆的结构发生了变化，因此需要再次构建
            maxHeap(arr, i, 0);
        }
    }

    /**
     * 交换元素
     * @param arr 数组
     * @param i 交换下标1
     * @param j 交换下标2
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 建立最大堆
     * @param arr 数组
     */
    private static void buildMaxHeap(int[] arr) {
        int half = arr.length >>> 1;
        int i;
        // 从一半的前一个开始，这是因为位于一半位置的元素第左孩子和右孩子的下标一定是越界的
        for (i = half - 1; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }
    }

    private static void maxHeap(int[] arr, int maxSize, int i) {
        // 定义左右孩子
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;
       // 最大元素等于两个孩子和他自己三者中最大的那个
        if (left < maxSize && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < maxSize && arr[right] > arr[largest]) {
            largest = right;
        }
        // 如果他自己不是最小的，就换一下位置，从其最大的地方再次建堆
        if (i != largest) {
            swap(arr, i, largest);
            // 不断递归，这样可以保证根节点的数字是最大的
            maxHeap(arr, maxSize, largest);
        }
    }
}
