package com.dai.AlgorithmDemo.InsertSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/5 0:00
 * <p>
 * <p>
 * 插入排序
 */
public class InsertSort1 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 2, 2, 5, 7, 2, 4, 6, 8, 1, 3, 5, 7, 8, 4, 9};
        priOut(arr);
        insertSort2(arr);
        priOut(arr);
    }

    private static void insertSort1(int[] arr) {
        //0~0 已完成
        //0~1
        //0~2
        //0~3
        //0~N
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            //假设当前插入的位置
            int newNumIndex = end;
            //左边有数 并且 左边的数大于当前位置的数
            while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
                //进行交换位置
                swap(arr, newNumIndex - 1, newNumIndex);
                //往左边移动一位
                newNumIndex--;
            }
        }
    }

    private static void insertSort2(int[] arr) {
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            for (int pir = end - 1; pir >= 0 && arr[pir] > arr[pir + 1]; pir--) {
                swap(arr, pir, pir + 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int a = arr[j];
        arr[j] = arr[i];
        arr[i] = a;
    }

    private static void priOut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}