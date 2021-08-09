package com.itcast.stringBuilderDemo01;

public class TestDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb1 = sb.append("abc");
        StringBuilder sb2 = sb.append("ABC");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);

    }
}
