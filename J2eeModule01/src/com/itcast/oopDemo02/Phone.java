package com.itcast.oopDemo02;

public class Phone {
    String name;
    int price;
    public void call(){
        System.out.println("打电话。。。。");
    }
    public void message(String name){
        System.out.println("给"+name+"发短信");
    }
}
