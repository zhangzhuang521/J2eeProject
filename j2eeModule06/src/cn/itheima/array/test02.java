package cn.itheima.array;

public class test02 {
    public static void main(String[] args) {
        int a = cheng(5);

        System.out.println(a);
    }

    private static int cheng(int i) {
        if (i == 1) {
            return 1;
        }
        return i * cheng(i - 1);
    }
}
