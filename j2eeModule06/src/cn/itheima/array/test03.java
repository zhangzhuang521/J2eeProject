package cn.itheima.array;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class test03 {
    public static void main(String[] args) {
        int[] arr={10,60,50,30,45,55,20};
        String s = Arrays.toString(arr);
        System.out.println(s);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int i = Arrays.binarySearch(arr, 0, arr.length - 1, 45);
        System.out.println(i);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
//        LocalDateTime localDateTime = LocalDateTime.of(2021, 6, 21, 22, 07,56);
        int year = localDateTime.getYear();
        System.out.println(year);
        int monthValue = localDateTime.getMonthValue();
        System.out.println(monthValue);
        int dayOfMonth = localDateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        int dayOfYear = localDateTime.getDayOfYear();
        System.out.println(dayOfMonth+" "+dayOfWeek+" "+dayOfYear);
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println(hour+" "+minute+" "+second);
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);
    }
}
