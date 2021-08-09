package com.itcast.stringDemo01;

import java.util.Scanner;

public class BianLiTest02 {
    public static void main(String[] args) {
        int bigChar=0;
        int smallChar=0;
        int shuzuChar=0;
        //电脑输入一个字符串
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = s.nextLine();
        //使用String中的toCharArray()方法可以获得一个字符数组，然后遍历
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            if ('a'<=chars[i]&&chars[i]<='z'){
                smallChar++;
            }else if ('A'<=chars[i]&&chars[i]<='Z'){
                bigChar++;
            }else {
                shuzuChar++;
            }
        }
        System.out.println(bigChar);
        System.out.println(smallChar);
        System.out.println(shuzuChar);
    }
}
