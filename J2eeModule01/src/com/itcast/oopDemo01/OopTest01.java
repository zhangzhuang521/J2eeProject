package com.itcast.oopDemo01;

public class OopTest01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name="张三";
        s.age=18;
        System.out.println(s.name);
        System.out.println(s.age);
        s.study();
        s.play("李四");
    }
}
