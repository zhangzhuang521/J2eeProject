package com.itheima.test01;



public class TestString {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s.toString());
        System.out.println(s);
        String s1 = new String();
        String s2 = new String();
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        int[] ints1 = new int[6];
        int[] ints2 = new int[6];
        System.out.println(ints1==ints2);
        System.out.println(ints1.equals(ints2));
        String lisi = new String("LISI");
        String wangwu = new String("LISI");
        System.out.println(lisi==wangwu);
        System.out.println(lisi.equals(wangwu));
        String S1="ABCDEF";
//        toCharArrayMehod(S1);
        for (int i = 0; i < S1.length(); i++) {
            System.out.println(S1.charAt(i));
        }

        String replace = S1.replace("C", "a");
        System.out.println(replace);
        String substring = S1.substring(2);
        System.out.println(substring);
        String[] cs = S1.split("C");
        System.out.println(cs[0]);
        System.out.println(cs[1]);


    }

    private static void toCharArrayMehod(String s1) {
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
