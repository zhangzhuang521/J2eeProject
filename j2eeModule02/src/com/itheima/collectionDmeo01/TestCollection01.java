package com.itheima.collectionDmeo01;


import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCollection01 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
//        Student student1 = getStudent();
//        Student student2 = getStudent();
//        Student student3 = getStudent();
//        arrayList.add(student1);
//        arrayList.add(student2);
//        arrayList.add(student3);
        for (int i = 0; i < 3; i++) {
            Student student = getStudent();
            arrayList.add(student);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getName() + "..." + student.getAge());
        }
    }

    public static Student getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        return new Student(name, age);
    }
}
