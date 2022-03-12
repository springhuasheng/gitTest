package com.dai.AlgorithmDemo.SelectSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/3 22:45
 * <p>
 * <p>
 * 选择排序1
 */
public class SelectSort1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 1, 2, 3, 3, 5, 6, 9, 7, 5, 4};
        prinArr(arr1);
        selectSort1(arr1);
        prinArr(arr1);
    }

    private static void selectSort1(int[] arr) {
        if (null == arr || arr.length < 2) {
            return;
        }
        int N = arr.length;
        // 0 ~ n-1
        // 1 ~ n-1
        // 2 ~ n-1
        for (int i = 0; i < N; i++) {
            // 0 ~ n-1
            // 1 ~ n-1
            // 2 ~ n-1
            // i ~ n-1
            int minNum = i;
            for (int j = i + 1; j < N; j++) {
                minNum = arr[j] < arr[minNum] ? j : minNum;
            }
            swap(arr, i, minNum);
        }
    }

    public static void swap(int[] arr, int i, int j) {
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