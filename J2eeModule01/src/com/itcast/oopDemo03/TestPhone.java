package com.itcast.oopDemo03;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setName("lisi");
        phone1.setPrice(6000);
        phone1.show();
        Phone phone2 = new Phone("wangwu", 18);
        phone2.show();
    }
}
