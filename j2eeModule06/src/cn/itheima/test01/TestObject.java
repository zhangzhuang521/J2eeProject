package cn.itheima.test01;

import cn.itheima.domain.Student;

public class TestObject {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 28);
        Student student2 = new Student("zhangsan", 28);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student2));
    }
}
