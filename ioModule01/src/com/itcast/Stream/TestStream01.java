package com.itcast.Stream;

import com.itcast.domain.Person;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream01 {
    public static void main(String[] args) {
//        Person zhangsan = new Person("zhangsan");
//        Person lisi = new Person("lisi");
//        Person wangwu = new Person("wangwu");
//        Person zhangdi = new Person("zhangdi");
//        Person zhangli = new Person("zhangli");
//        Person zhangjie = new Person("zhangjie");
//        List<Person> personArrayList = new ArrayList<Person>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        //List.of("zhangsan","lisi","wangwu","zhangdi","zhangli","zhangjie")

        arrayList1.add("张三");
        arrayList1.add("李四");
        arrayList1.add("王五");
        arrayList1.add("张无忌");
        arrayList1.add("王二小");
        arrayList1.add("放牛娃");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("杨不悔");
        arrayList2.add("杨铁心");
        arrayList2.add("杨昭");
        arrayList2.add("赵敏");
        arrayList2.add("周芷若");
        arrayList2.add("杨开");
        Stream<String> stream1 = arrayList1.stream().filter(s -> s.length() == 3).limit(2);

        Stream<String> stream2 = arrayList2.stream().filter(s -> s.startsWith("杨")).skip(1);
        Stream<String> stream3 = Stream.concat(stream1, stream2);
        List<String> collect = stream3.collect(Collectors.toList());
        ArrayList<Person> personArrayList = new ArrayList<>();

        for (String s : collect) {
            Person person = new Person(s);
            personArrayList.add(person);
        }
        for (Person person : personArrayList) {
            System.out.println(person.getName());
        }




    }
}
