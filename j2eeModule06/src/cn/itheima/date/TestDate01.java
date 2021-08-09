package cn.itheima.date;

import java.util.Date;

public class TestDate01 {
    public static void main(String[] args) {
        //空参创建对象
        Date date01 = new Date();
        //当前时间
        System.out.println(date01);
        //1970年1月1日至现在的毫秒值
        System.out.println(date01.getTime());
        //1970年1月1日至现在的毫秒值
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        //1970年1月1日后的1小时后的时间
        date01.setTime(1000*60*60);
        System.out.println(date01);
        //1970年1月1日后的1小时后的时间
        Date date02 = new Date(1000 * 60 * 60);
        System.out.println(date02);
    }
}
