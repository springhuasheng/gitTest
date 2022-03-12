package com.dai.AlgorithmDemo.BubbleSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/5 20:52
 * <p>
 * <p>
 * 冒泡排序3
 */
public class BubbleSort3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 3, 5, 7, 5, 2, 5, 7, 8, 3, 5, 7, 2, 9, 9, 9, 1, 2};
        priOut(arr);
        bubbleSort3(arr);
        priOut(arr);

    }

    private static void bubbleSort3(int[] arr) {
        //0 ~ N-1
        //0 ~ N-2
        //0 ~ N-3
        int N = arr.length - 1;
        for (int i = N; i >= 0; i--) {
            //0-1 1-2 2-3 N-1 - N
            for (int j = 1; j <= i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    private static void priOut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}