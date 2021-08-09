package com.itheima.test02;

import com.itheima.domain.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("zhangsan", 18);
        System.out.println(s1);
        System.out.println(s1.getClass().getName());
        System.out.println(s2);
        System.out.println(s1.equals(s2));

    }
}
