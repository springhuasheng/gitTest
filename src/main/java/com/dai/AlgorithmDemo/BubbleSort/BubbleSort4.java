package com.dai.AlgorithmDemo.BubbleSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/6 22:54
 * <p>
 * <p>
 * 冒泡排序
 */
public class BubbleSort4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 4, 6, 8, 6, 5, 3, 5, 7, 2, 1};
        priOut(arr);
        bubbleSort5(arr);
        priOut(arr);
    }

    private static void bubbleSort5(int[] arr) {
        //0~N
        //0~N-1
        //0~N-2
        for (int i = arr.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
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
