package com.itheima01.collectionDemo01;

import com.itheima01.main.Student;

import java.util.ArrayList;
import java.util.Scanner;

//学生管理系统
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        //用于输入序号
        Scanner sc = new Scanner(System.in);
        //位置循环次数，用while循环
        //不知道什么时候结束，用标号类结束

        Io:
        while (true) {
            //项目的标头
            System.out.println("-- 欢迎来到学生管理系统 --");
            System.out.println("1 添加学生");
            System.out.println("2 查看学生");
            System.out.println("3 删除学生");
            System.out.println("4 修改学生");
            System.out.println("5 退出");
            System.out.println("请输入编号：");
            String number = sc.nextLine();

            switch (number) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(students);
                    break;
                case "2":
//                    System.out.println("查看学生");
                    queryStudent(students);
                    break;
                case "3":
//                    System.out.println("删除学生");
                    deleteStudent(students);
                    break;
                case "4":
//                    System.out.println("修改学生");
                    updateStudent(students);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    break Io;
                default:
                    System.out.println("你输入的有误，请重新输入");
                    break;
            }
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String sid = sc.next();
        int index = getIndex(students, sid);
        if (index == -1) {
            System.out.println("你输入的信息有误，请重新输入");
        } else {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入生日：");
            String brithday = sc.next();
            Student student = new Student(sid, name, age, brithday);
            students.set(index, student);
            System.out.println("修改成功");
        }
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> students) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String sid = sc.next();
        int index = getIndex(students, sid);
        if (index == -1) {
            System.out.println("你输入的信息有误，请重新输入");
        } else {
            students.remove(index);
            System.out.println("删除成功");
        }

    }

    //获取该学号的索引
    public static int getIndex(ArrayList<Student> students, String sid) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            String id = student.getSid();
            if (id.equals(sid)) {
                index = i;
            }
        }
        return index;
    }

    //查看学生
    public static void queryStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("没有学生资料，请先添加学生资料");
            return;
        }
        System.out.println("学号\t\t姓名\t\t年龄\t生日");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getSid() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getBrithday());
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> students) {
        String sid;
        System.out.println("请添加学生");
        //录入学生资料
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的学号：");
            sid = sc.next();
            int index = getIndex(students, sid);
            if (index == -1) {
                break;
            }
        }
        System.out.println("请输入学生的姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的生日：");
        String brithday = sc.next();
        Student student = new Student(sid, name, age, brithday);
        students.add(student);
        System.out.println("添加成功");
    }

}
