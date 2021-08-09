package cn.itheima.test01;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("3");
        BigDecimal bigDecimal2 = new BigDecimal("7.0");
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println(add);
        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        System.out.println(subtract);
        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);
        System.out.println(multiply);
//        BigDecimal divide = bigDecimal1.divide(bigDecimal2);
//        System.out.println(divide);
//        BigDecimal divide1 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP);
//        System.out.println(divide1);
        BigDecimal divide1 = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide1);
    }
}
