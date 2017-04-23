package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,17:01.
 * Description: 是假设第I个元素,其前i-1个元素都已经排好序了,现在要做的是吧第i个元素插入到前边排好序的
 */
public class InsertSort {
    public static void sort(int[] arr) {
        int i, j, temp;
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            /**
             * 遍历以前的元素,没到首位或者咩有找到比他小的,就继续向前找,并且把元素都往后边移动一位,找到比他小的元素,应该是a[j]位置,
             * 此时应该把他插入到这个元素的后边,也就是a[j+1]的位置
             */
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}
