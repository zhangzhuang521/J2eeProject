package com.itcast.stringDemo01;

import java.util.Scanner;

public class DengLuTest01 {
    public static void main(String[] args) {
        //定义账户和密码
        String userName = "admie";
        String passWord = "123456";
        //键盘输入
        Scanner s1 = new Scanner(System.in);
        //三次循环
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入账户名称");
            String usUserName = s1.nextLine();
            Scanner s2 = new Scanner(System.in);
            System.out.println("请输入账户密码");
            String usPassWord = s2.nextLine();
            if (userName.equalsIgnoreCase(usUserName) && passWord.equalsIgnoreCase(usPassWord)) {
                System.out.println("登录成功，欢迎使用");
                break;
            } else {
                if (i == 3) {
                    System.out.println("你已经连续输错三次密码，账户已被冻结，请联系管理员解冻");
                } else {
                    System.out.println("你的密码错误，还有" + (3 - i) + "次机会，请重新输入");
                }
            }
        }
    }
}
