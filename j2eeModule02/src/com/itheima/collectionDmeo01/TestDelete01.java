package com.itheima.collectionDmeo01;

import java.util.ArrayList;

public class TestDelete01 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("wangwu");
        stringArrayList.add("wangwi");
        stringArrayList.add("wangli");
        stringArrayList.add("wangliu");
        stringArrayList.add("wangwu");
        stringArrayList.add("wangwu");
//        stringArrayList.remove("wangwu");
        for (int i = 0; i < stringArrayList.size(); i++) {
            String s = stringArrayList.get(i);
            if ("wangwu".equals(s)) {
                stringArrayList.remove(i);
                i--;
            }
        }
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }

    }
}
