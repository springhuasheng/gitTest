package com.dai.AlgorithmDemo.Logarithm;

import java.util.regex.Matcher;

/**
 * @Author: huasheng
 * @Date: 2022/3/6 14:28
 * <p>
 * <p>
 * 对数器
 */
public class Logarithm1 {
    public static void main(String[] args) {

        int testCiShu = 100000;
        int ciShu = 0;
        for (int i = 0; i < testCiShu; i++) {
            if (Math.random() < 0.1) {
                ciShu++;
            }
        }
        System.out.println((double) ciShu / (double) testCiShu);

        System.out.println("=================");

        int K = 5;

        int[] counts = new int[5];
        for (int i = 0; i < testCiShu; i++) {
            int ans = (int)(Math.random() * K);
            counts[ans]++;
        }
        for (int j = 0; j < K; j++) {
            System.out.println(j + " 这个数, 出现了: " + counts[j] + " 次");
        }
        System.out.println("111111111111111");
        System.out.println("222222222222222");
        System.out.println("333333333333333");
        System.out.println("444444444444444");
        System.out.println("555555555555555");
    }
}
