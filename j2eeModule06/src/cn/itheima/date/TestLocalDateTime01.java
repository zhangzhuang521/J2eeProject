package cn.itheima.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestLocalDateTime01 {
    public static void main(String[] args) {
        //从默认时区的系统时钟获取当前的日期时间。
        LocalDateTime nowlocalDateTime = LocalDateTime.now();
        System.out.println(nowlocalDateTime);
        //从年，月，日，小时和分钟获得 LocalDateTime的实例
        LocalDateTime oflocalDateTime = LocalDateTime.of(1992, 12, 22, 12, 22, 22);
        System.out.println(oflocalDateTime);
        //获得这个日期时间的 LocalDate部分。
        LocalDate localDate = nowlocalDateTime.toLocalDate();
        System.out.println(localDate);
        //获取此日期时间的 LocalTime部分。
        LocalTime localTime = nowlocalDateTime.toLocalTime();
        System.out.println(localTime);
        //获取年，月，日，时，分，秒
        System.out.println(nowlocalDateTime.getYear());
        System.out.println(nowlocalDateTime.getMonthValue());
        System.out.println(nowlocalDateTime.getDayOfMonth());
        System.out.println(nowlocalDateTime.getDayOfWeek());
        System.out.println(nowlocalDateTime.getDayOfYear());
        System.out.println(nowlocalDateTime.getHour());
        System.out.println(nowlocalDateTime.getMinute());
        System.out.println(nowlocalDateTime.getSecond());

    }
}
