package com.dai.AlgorithmDemo.BubbleSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/3 23:35
 * <p>
 * <p>
 * 冒泡排序1
 */
public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 1, 2, 3, 3, 5, 6, 9, 7, 5, 4};
        prinArr(arr1);
        bubbleSort1(arr1);
        prinArr(arr1);
    }

    private static void bubbleSort1(int[] arr) {
        if (null == arr || arr.length < 2) {
            return;
        }
        //0 ~ N-1
        //0 ~ N-2
        //0 ~ N-3
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            //0~end
            //0~1 1~2 2~3 3~4 end-1~end
            for (int second = 1; second <+ end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int a = arr[j];
        arr[j] = arr[i];
        arr[i] = a;
    }

    private static void prinArr(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }

}