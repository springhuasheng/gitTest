package com.dai.AlgorithmDemo.SelectSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/4 23:39
 * <p>
 * <p>
 * 选择排序
 */
public class SelectSort2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 6, 8, 3, 4, 5, 7, 9, 7, 1, 3, 4, 5, 7, 3, 4};
        priOut(arr);
        selectSort2(arr);
        priOut(arr);

    }

    private static void selectSort2(int[] arr) {
        //0 ~ N
        //1 ~ N
        for (int i = 0; i < arr.length; i++) {
            int minNum = i;
            for (int j = i + 1; j < arr.length; j++) {
                minNum = arr[j] < arr[minNum] ? j : minNum;
            }
            wsap(arr, i, minNum);
        }

    }

    private static void wsap(int[] arr, int i, int j) {
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