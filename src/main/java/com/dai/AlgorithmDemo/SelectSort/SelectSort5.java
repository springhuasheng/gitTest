package com.dai.AlgorithmDemo.SelectSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/7 22:17
 * <p>
 * <p>
 * 选择排序
 */
public class SelectSort5 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 2, 5, 7, 4, 2, 9, 6, 1};
        priOut(arr);
        selectSort4(arr);
        priOut(arr);
    }

    private static void selectSort4(int[] arr) {
        //0~N
        //1~N
        for (int i = 0; i < arr.length; i++) {
            int minNumIndex2 = i;
            for (int j = i + 1; j < arr.length; j++) {
                minNumIndex2 = arr[j] < arr[minNumIndex2] ? j : minNumIndex2;
            }
            swap(arr,i,minNumIndex2);
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
