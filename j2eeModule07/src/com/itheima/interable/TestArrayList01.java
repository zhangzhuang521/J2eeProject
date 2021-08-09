package com.itheima.interable;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        //增强for
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("========");
        //迭代器
        Iterator<String> iterator = arrayList.iterator();
       while(iterator.hasNext()){
           String s = iterator.next();
           System.out.println(s);
       }
        System.out.println("========");
       //for循环
        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println(arrayList.get(j));
        }
    }
}
