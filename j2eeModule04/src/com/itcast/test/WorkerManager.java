package com.itcast.test;

import com.itcast.domain.Worker;

import java.util.Scanner;

public class WorkerManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker[] workerArr = new Worker[3];
        while (true) {
            System.out.println("员工工资管理系统");
            System.out.println("=================");
            System.out.println("1 员工月工资输入");
            System.out.println("2 员工月工资总额计算");
            System.out.println("3 员工月平均工资计算");
            System.out.println("4 员工月工资排名");
            System.out.println("5 退出系统");
            System.out.println("=================");
            System.out.println("请输入查询编号：");
            String order = sc.next();
            switch (order) {
                case "1":
//                    System.out.println("请输入员工的工资：");
                    inputSalary(workerArr);
                    break;
                case "2":
//                    System.out.println("员工月工资总额计算：");
                    double[] doubles = sumSalary(workerArr);
                    for (int i = 0; i < doubles.length; i++) {
                        System.out.println(doubles[i]);
                    }
                    break;
                case "3":
//                    System.out.println("员工月平均工资计算：");
                    double[] average = average(workerArr);
                    for (int i = 0; i < average.length; i++) {
                        System.out.println(average[i]);
                    }
                    break;
                case "4":
                    salaryRank(workerArr);
                    break;
                case "5":
                    System.out.println("感谢使用！");
                    System.exit(0);
//                    break;  是否还需要break？
                default:
                    System.out.println("你输入的有误，请重新输入");
                    break;
            }
        }

    }

    public static void salaryRank(Worker[] workerArr) {
        double[] doubles = new double[workerArr.length];
        for (int i = 0; i < workerArr.length; i++) {
            Worker worker = workerArr[i];
            double sum = worker.getJbSalary() + worker.getGwSalary() + worker.getJxsalary();
            doubles[i] = sum;
        }
        double temp;
        for (int i = 0; i < workerArr.length - 1; i++) {
            for (int j = 0; j < workerArr.length - 1 - i; j++) {
                if (doubles[j] < doubles[j + 1]) {
                    temp = doubles[j];
                    doubles[j] = doubles[j + 1];
                    doubles[j+1] = temp;

                }
            }
        }

        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
    }

    private static double[] average(Worker[] workerArr) {
        double[] doubles = new double[workerArr.length];
        for (int i = 0; i < workerArr.length; i++) {
            Worker worker = workerArr[i];
            double averageSalary = (worker.getJbSalary() + worker.getGwSalary() + worker.getJxsalary()) / 3;
            doubles[i] = averageSalary;
        }
        return doubles;
    }

    public static double[] sumSalary(Worker[] workerArr) {
        double[] doubles = new double[workerArr.length];
        for (int i = 0; i < workerArr.length; i++) {
            Worker worker = workerArr[i];
            double sum = worker.getJbSalary() + worker.getGwSalary() + worker.getJxsalary();
            doubles[i] = sum;
        }
        return doubles;
    }

    public static Worker[] inputSalary(Worker[] workerArr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < workerArr.length; i++) {
            System.out.println("请输入你的姓名：");
            String name = sc.next();
            System.out.println("请输入你的年龄：");
            int age = sc.nextInt();
            System.out.println("请输入你的基本工资：");
            double jbSalary = sc.nextDouble();
            System.out.println("请输入你的岗位工资：");
            double gwSalary = sc.nextDouble();
            System.out.println("请输入你的绩效工资：");
            double jxsalary = sc.nextDouble();
            System.out.println("第"+(i+1)+"员工工资存入成功！");
            Worker worker = new Worker(name, age, jbSalary, gwSalary, jxsalary);
            workerArr[i] = worker;
        }
        return workerArr;

    }
}

