package com.dai.AlgorithmDemo.InsertSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/7 22:07
 * <p>
 * <p>
 * 插入排序
 */
public class InsertSort4 {
    public static void main(String[] args) {
        int[] arr = {8, 2, 1, 4, 6, 2, 4, 6, 7, 4, 3, 6, 8};
        priOut(arr);
        bubbleSort5(arr);
        priOut(arr);
    }

    private static void bubbleSort5(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
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
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
