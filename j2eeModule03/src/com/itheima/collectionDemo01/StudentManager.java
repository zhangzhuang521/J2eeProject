package com.itheima.collectionDemo01;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //键盘录入

       Io: while (true){
           Scanner sc = new Scanner(System.in);
            System.out.println("-- 欢迎来到学生管理系统 --");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("添加学生");
                    break;
                case "2":
                    System.out.println("删除学生");
                    break;
                case "3":
                    System.out.println("修改学生");
                    break;
                case "4":
                    System.out.println("查看学生");
                    break;
                case "5":
                    System.out.println("感谢使用");
                    break Io;
                default:
                    System.out.println("你输入的有误。请重新输入");
            }
        }

    }

}
