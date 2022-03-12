package com.dai.AlgorithmDemo.InsertSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/5 21:21
 * <p>
 * <p>
 * 插入排序
 */
public class InsertSort2 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 2, 2, 5, 7, 2, 4, 6, 8, 1, 3, 5, 7, 8, 4, 9};
        priOut(arr);
        insertSort2(arr);
        priOut(arr);
    }

    private static void insertSort2(int[] arr) {
        // 0~0
        // 0~1
        // 0~N
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
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