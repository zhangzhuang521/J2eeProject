package cn.itheima.array;

import java.util.Arrays;

public class TestArray01 {
    public static void main(String[] args) {

        int[] arr = {10, 30, 50, 12, 60, 5, 81, 86, 78};

        //userArray(arr);
        Arrays.sort(arr);
        String s = Arrays.toString(arr);
        System.out.println(s);

    }

    private static void userArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
