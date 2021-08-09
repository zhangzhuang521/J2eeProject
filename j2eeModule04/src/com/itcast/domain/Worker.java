package com.itcast.domain;

public class Worker {
    private String name;
    private int age;
    private double jbSalary;
    private double gwSalary;
    private double jxsalary;

    public Worker() {
    }

    public Worker(String name, int age, double jbSalary, double gwSalary, double jxsalary) {
        this.name = name;
        this.age = age;
        this.jbSalary = jbSalary;
        this.gwSalary = gwSalary;
        this.jxsalary = jxsalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getJbSalary() {
        return jbSalary;
    }

    public void setJbSalary(double jbSalary) {
        this.jbSalary = jbSalary;
    }

    public double getGwSalary() {
        return gwSalary;
    }

    public void setGwSalary(double gwSalary) {
        this.gwSalary = gwSalary;
    }

    public double getJxsalary() {
        return jxsalary;
    }

    public void setJxsalary(double jxsalary) {
        this.jxsalary = jxsalary;
    }
}
