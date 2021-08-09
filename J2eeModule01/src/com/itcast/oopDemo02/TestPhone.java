package com.itcast.oopDemo02;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone);
        System.out.println(phone.name);
        System.out.println(phone.price);
        phone.name="苹果12";
        phone.price=3999;
        System.out.println(phone.name);
        System.out.println(phone.price);
        phone.call();
        phone.message("张三");
    }
}
