package com.itcast.test01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee em1 = new Employee();
        Employee em2 = new Employee();
        Employee em3 = new Employee();
        Employee[] employees = new Employee[]{em1, em2, em3};
        int xz = 0;
        double[] total = new double[employees.length];
        do {
            System.out.println("员工工资管理系统");
            System.out.println("----------------------");
            System.out.println("1.员工月工资输入");
            System.out.println("2.员工月工资总额计算");
            System.out.println("3.员工月平均工资计算");
            System.out.println("4.员工月工资排名");
            System.out.println("5 退出系统");
            System.out.println("----------------------");
            System.out.println("请选择1-5");
            xz = sc.nextInt();
            switch (xz) {
                case 1:
                    input(employees);
                    break;
                case 2:
                    total = sum(employees);
                    for (int i = 0; i < total.length; i++) {
                        System.out.println(total[i]);
                    }
                    break;
                case 3:
                    total = sum(employees);
                    System.out.println(ave(total));
                    break;
                case 4:
                    sort(employees, total);
                    print(employees,total);
                    break;
                case 5:
                    System.exit(0);//退出JVM虚拟机
                    break;
                default:
                    System.out.println("你输入的有误");
                    break;
            }
        } while (xz >= 1 && xz < 5);
    }

    public static void input(Employee[] employees) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("请输入" + (i + 1) + "个员工的姓名 ");
            employees[i].setName(sc.next());
            System.out.println("请输入" + (i + 1) + "个员工的工号 ");
            employees[i].setId(sc.nextInt());
            System.out.println("请输入" + (i + 1) + "个员工的基本工资 ");
            employees[i].setBasePay(sc.nextInt());
            System.out.println("请输入" + (i + 1) + "个员工的岗位工资 ");
            employees[i].setGwPay(sc.nextInt());
            System.out.println("请输入" + (i + 1) + "个员工的绩效工资 ");
            employees[i].setJxPay(sc.nextInt());
        }
    }

    public static double[] sum(Employee[] employees) {
        double[] total = new double[employees.length];
        for (int i = 0; i < employees.length; i++) {
            total[i] = employees[i].total();
        }
        return total;
    }

    public static double ave(double[] total) {
//        double[] ave = new double[total.length];
        double sum = 0;
        for (int i = 0; i < total.length; i++) {
            sum += total[i];
        }
        return sum / total.length;
    }

    public static void sort(Employee[] employees, double[] total) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (total[j] < total[j + 1]) {
                    double temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;
                    Employee tem = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tem;
                }
            }
        }
    }

    public static void print(Employee[] employees, double[] total) {
        System.out.println("姓名\t员工号\t基本工资\t岗位工资\t绩效工资\t总工资");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName() + "\t" + employees[i].getId() + "\t\t" + employees[i].getBasePay() + "\t\t" + employees[i].getGwPay() + "\t\t" + employees[i].getJxPay() + "\t\t" + total[i]);
        }
    }
}
