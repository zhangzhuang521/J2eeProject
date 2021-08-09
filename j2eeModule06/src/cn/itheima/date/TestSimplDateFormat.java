package cn.itheima.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimplDateFormat {
    public static void main(String[] args) throws ParseException {
        //格式化
        // 对象-- String
        Date date01 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(date01);
        System.out.println(format);
        //解析
        //String -- 对象
        String time = "2021-06-22 03:09:00";
        SimpleDateFormat simpleDateFormat01 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat01.parse(time);
        System.out.println(parse);

    }
}
