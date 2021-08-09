package com.itcast.oopDemo03;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
JavaBean类
 */
public class Phone {
    private String name;
    private int price;

 /*   public Phone() {
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }*/

    public Phone() {
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void show(){
        System.out.println(name+"......"+price);
    }

}
