package com.itheima01.main;


//Student的实体类
public class Student {
    //成员变量
    private String sid;
    private String name;
    private int age;
    private String brithday;

    public Student() {
    }

    public Student(String sid, String name, int age, String brithday) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.brithday = brithday;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
}
