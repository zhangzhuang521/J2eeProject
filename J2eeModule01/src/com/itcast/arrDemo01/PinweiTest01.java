package com.itcast.arrDemo01;

import java.util.Scanner;

public class PinweiTest01 {
    public static void main(String[] args) {
        /*1.先定义一个数组，数组长度为10;
          2.键盘输入
          */
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩");
            int sout = sc.nextInt();
            if (sout >= 0 && sout <= 100) {
                arr[i] = sout;
            } else {
                System.out.println("你输入的成绩有误，请重新输入");
                i--;
            }
        }
        System.out.println("--------");
        //3.求最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("--------");
        //4.求最小值
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println("--------");
        //5.数据求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println("--------");
        //6.求平均分
        int vag = (sum - max - min) / (arr.length - 2);
        System.out.println(vag);
    }

}
