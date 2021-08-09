package cn.itheima.array;

public class TestEr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = userArray(arr, 11);
        System.out.println(i);
    }

    private static int userArray(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            }else {
                return mid;
            }
        }
       return -1;
    }
}
