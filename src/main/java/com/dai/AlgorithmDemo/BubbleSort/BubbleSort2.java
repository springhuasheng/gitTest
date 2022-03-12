package com.dai.AlgorithmDemo.BubbleSort;

/**
 * @Author: huasheng
 * @Date: 2022/3/4 23:21
 * <p>
 * <p>
 * 冒泡排序
 */
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 6, 8, 3, 4, 5, 7, 9, 7, 1, 3, 4, 5, 7, 3, 4};
        priOut(arr);
        bubbleSort2(arr);
        priOut(arr);
    }

    private static void bubbleSort2(int[] arr) {
        //0 ~ N-1
        //0 ~ N-2
        int maxNum = arr.length - 1;
        for (int j = maxNum; j >= 0; j--) {
            // 1~2 2~3 3~4 maxNum-1~maxNum
            for (int i = 1; i <= j; i++) {
                if (arr[i] < arr[i - 1]) {
                    wsap(arr, i, i - 1);
                }
            }
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
