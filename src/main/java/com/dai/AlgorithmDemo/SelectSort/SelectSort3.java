package com.dai.AlgorithmDemo.SelectSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/5 21:08
 * <p>
 * <p>
 * 选择排序
 */
public class SelectSort3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 3, 5, 7, 5, 2, 5, 7, 8, 3, 5, 7, 2, 9, 9, 9, 1, 2};
        priOut(arr);
        bubbleSort3(arr);
        priOut(arr);
    }

    private static void bubbleSort3(int[] arr) {
        //0 ~ N
        //1 ~ N
        //2 ~ N
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minNum = i;
            for (int j = i + 1; j < N; j++) {
                minNum = arr[j] < arr[minNum] ? j : minNum;
            }
            swap(arr, i, minNum);
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
