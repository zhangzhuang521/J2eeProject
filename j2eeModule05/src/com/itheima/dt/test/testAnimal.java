package com.itheima.dt.test;

public class testAnimal {
    public static void main(String[] args) {
       Animal animal = new Cat();
       animal.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("动物吃东西");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        super.eat();

        System.out.println("猫吃鱼");
    }
}
