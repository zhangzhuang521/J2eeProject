package com.itcast.test01;

public class Employee {
    private int id;
    private String name;
    private double basePay;
    private double gwPay;
    private double jxPay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public double getGwPay() {
        return gwPay;
    }

    public void setGwPay(double gwPay) {
        this.gwPay = gwPay;
    }

    public double getJxPay() {
        return jxPay;
    }

    public void setJxPay(double jxPay) {
        this.jxPay = jxPay;
    }

    public double total() {
        double sum = basePay + gwPay + jxPay;
        if (sum < 3000) {
            return sum - sum * 0.03;
        } else {
            return sum - sum * 0.06;
        }
    }
}
