package com.yuan.sort;

/**
 * Created by Yuan on 2017/4/23,17:20.
 * Description: 二分插入
 */
public class BinaryInsertSort {
    public static void sort(int[] arr) {
        int i, j, temp, start, end, middle;
        for (i = 0; i < arr.length; i++) {
            temp = arr[i];
            start = 0;
            end = i - 1;
            // 如果左右指针不相等就去查找中间值,左右指针相等的时候表明一定是找到了中间值
            while (start <= end) {
                middle = (start + end) / 2;
                // 如果要插入的值比中间值大,那么应该吧他插在中间位置的右边,实现从小到大的排序,反之,插入到左边
                if (temp < arr[middle]) {
                    end = middle -1;
                }
                else{
                    start = middle+1;
                }
            }
            // 开始插入,从要插入的位置往右将元素向后移动一个,在吧当前要插入的元素插入到left的位置,因为跳出循环的时候,j=left-1,最后赋值的时候
            for (j = i - 1;j>=start;j--) {
                arr[j + 1] = arr[j];
            }
            if (i != start) {
                arr[start] = temp;
            }
        }
    }
}
