package com.itcast.stringDemo01;

public class StringTest01 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ab";
        String s3=s2+"c";
        String s4="a"+"b"+"c";
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//true
    }
}
