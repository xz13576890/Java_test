package Test_Collection.Sort;

import java.util.Arrays;

/**
 * 冒泡排序 初版 机械趟数和次数比较
 */
public class BubbleSort01 {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5};
//        sortFirst(arr);
//        sortSecond(arr);
        sort01(arr);
    }

    //第一版本
    public static void sort01(int[] arr) {
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) {
            System.out.println("第" + (j + 1) + "趟");
            for (int i = 0; i < len - 1; i++) {
                System.out.print("第" + (i + 1) + "次");
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }

    }

    public static void sortFirst(int[] arr) {
        System.out.println("第一趟");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("第" + (i + 1) + "次");
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        /*
        //第一趟 第一次
        System.out.println("第一趟 第一次");
        int i = 0;
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("第一趟 第二次");
        i++;
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("第一趟 第三次");
        i++;
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("第一趟 第四次");
        i++;
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        */
    }

    public static void sortSecond(int[] arr) {
        System.out.println("第一趟");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("第" + (i + 1) + "次");
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("第二趟");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("第" + (i + 1) + "次");
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

}
