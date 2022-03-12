package com.dai.AlgorithmDemo.Random;

import java.io.FileOutputStream;

/**
 * @Author: huasheng
 * @Date: 2022/3/6 23:10
 * <p>
 * <p>
 * 1~5的随机数 转换为 1~7的随机数
 * 第一步: 构建 等概率返回 0或1
 * 第二步: 构建 000 ~ 111(构建二进制数) 也就是0~7 做到等概率
 * 第三步: 利用two() 构建 等概率返回1~7
 */
public class Ran1_5___Ran1_7 {
    public static void main(String[] args) {

        //校验 初始函数的准确性
        System.out.println("===校验 初始函数的准确性===");
        int maxTestMath = 100000;
        int[] count = new int[6];
        for (int i = 0; i < maxTestMath; i++) {
            int j = chuShiMath();
            count[j]++;
        }
        for (int a = 1; a < count.length; a++) {
            System.out.println(a + "出现了 ---- " + count[a] + "次");
        }

        //校验 第一步: 构建 等概率返回 0或1
        System.out.println("===校验 第一步: 构建 等概率返回 0或1===");
        count = new int[2];
        for (int i = 0; i < maxTestMath; i++) {
            int j = one();
            count[j]++;
        }
        for (int a = 0; a < count.length; a++) {
            System.out.println(a + "出现了 ---- " + count[a] + "次");
        }

        //第二步: 构建 000 ~ 111(构建二进制数) 也就是0~7 做到等概率
        System.out.println("===校验 第二步: 构建 000 ~ 111(构建二进制数) 也就是0~7 做到等概率===");
        count = new int[8];
        for (int i = 0; i < maxTestMath; i++) {
            int j = two();
            count[j]++;
        }
        for (int a = 0; a < count.length; a++) {
            System.out.println(a + "出现了 ---- " + count[a] + "次");
        }

        //校验 第三步: 利用two() 构建 等概率返回1~7
        System.out.println("===校验 第三步: 利用two() 构建 等概率返回1~7===");
        count = new int[8];
        for (int i = 0; i < maxTestMath; i++) {
            int j = three();
            count[j]++;
        }
        for (int a = 0; a < count.length; a++) {
            System.out.println(a + "出现了 ---- " + count[a] + "次");
        }
    }

    /**
     * 初始函数 等概率放回 1~5
     */
    private static int chuShiMath() {
        return (int) (Math.random() * 5) + 1;
    }

    /**
     * 第一步: 构建 等概率返回 0或1
     */
    private static int one() {
        int ans = 0;
        do {
            ans = chuShiMath();
        } while (ans == 3);
        return ans > 3 ? 0 : 1;
    }

    /**
     * 第二步: 构建 000 ~ 111(构建二进制数) 也就是0~7 做到等概率
     */
    private static int two() {
        return (one() << 2) + (one() << 1) + one();
    }

    /**
     * 第三步: 利用two() 构建 等概率返回1~7
     */
    private static int three() {
        int ans = 0;
        do {
            ans = two();
        } while (ans == 0);
        return ans;
    }

}