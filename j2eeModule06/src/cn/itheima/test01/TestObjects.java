package cn.itheima.test01;

import cn.itheima.domain.Student;

import java.util.Objects;

public class TestObjects {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 18);
        String toString = Objects.toString(student);
        System.out.println(toString);
        String 你好啊 = Objects.toString(null, "你好啊");
        System.out.println(你好啊);
        boolean aNull = Objects.isNull(null);

    }
}
