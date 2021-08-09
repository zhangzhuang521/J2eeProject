package cn.itheima.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestLocalDateTime02 extends RuntimeException {
    public static void main(String[] args) {
        //获取当前时间
        LocalDateTime nowlocalDateTime = LocalDateTime.now();
        //格式化
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = nowlocalDateTime.format(Formatter);
        System.out.println(format);
        //解析
        try {
            String time = "2020年12月22日 01:22:12";
//        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(time,Formatter);
            System.out.println(localDateTime);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public TestLocalDateTime02() {
    }

    public TestLocalDateTime02(String message) {
        super(message);
    }
}
