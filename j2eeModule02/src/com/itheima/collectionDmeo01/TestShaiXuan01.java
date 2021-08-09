package com.itheima.collectionDmeo01;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class TestShaiXuan01 {
    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        Student student1 = new Student("zhangsan", 18);
        Student student2 = new Student("zhangsansan", 20);
        Student student3 = new Student("zhangsanli", 8);
        Student student4 = new Student("zhangsanwu", 28);
        Student student5 = new Student("zhangsanliu", 19);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        ArrayList<Student> newArrayList = getNewArrayList(list);
        for (int i = 0; i < newArrayList.size(); i++) {
            Student student = newArrayList.get(i);
            System.out.println(student.getName()+"...."+student.getAge());
        }
    }
    private static ArrayList<Student> getNewArrayList(ArrayList<Student> list){
        ArrayList<Student> newArrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            int age = student.getAge();
            if(age<=18){
                newArrayList.add(student);
            }
        }
        return newArrayList;
    }
}
