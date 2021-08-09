package com.itcast.stringDemo01;

import java.util.Scanner;

public class BianLiTest01 {
    public static void main(String[] args) {
        //电脑输入一个字符串
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s1 = s.nextLine();
        //字符串的长度用String 中的length()方法；获取字符用String 中的charAt(i),i表示是索引
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            System.out.println(c);
        }
    }
}
