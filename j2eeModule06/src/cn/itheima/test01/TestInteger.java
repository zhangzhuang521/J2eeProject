package cn.itheima.test01;

public class TestInteger {
    public static void main(String[] args) {
        //方式一
        int a = 100;
        String b = "" + a;
        System.out.println(b);
        //方式二
        String s = String.valueOf(a);
        System.out.println(s);

        //方式一
        int i = Integer.valueOf(s).intValue();
        System.out.println(i);

        //方式三
        int i1 = Integer.parseInt(b);
        System.out.println(i1);
    }
}
