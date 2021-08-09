package cn.itheima.array;

public class Test01 {
    public static void main(String[] args) {
        int sum = sum(100);
        System.out.println(sum);
    }

    //递归，要知道出口，。要知道规则

    private static int sum(int i) {
        if (i == 1) {
            return 1;
        }
        return i + sum(i - 1);
    }
}
