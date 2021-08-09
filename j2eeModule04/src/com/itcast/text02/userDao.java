package com.itcast.text02;

public interface userDao {
    //常量
    public  final  int a =0;
    //抽象方法
    public abstract String show();
    //默认方法
    public static void sum(){
        System.out.println("......");
    }
    //静态方法
    public default void avg(){
        System.out.println("......");
    }

}
