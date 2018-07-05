package Test_Collection.Sort;

import java.util.Arrays;

/**
 * 冒泡排序最终版 考虑现有比较对象已存在的排序，减少比较趟数
 */
public class BubbleSort03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3, 4};
        sortFinal(arr);

    }

    public static void sortFinal(int[] arr) {
        boolean sorted;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) { //趟数
            sorted = true; //假定有序
            System.out.println("第" + (j + 1) + "趟");
            for (int i = 0; i < len - 1 - j; i++) { //次数
                System.out.print("第" + (i + 1) + "次");
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false; //若发生了交换则说明无序，假定失败
                }
                System.out.println(Arrays.toString(arr));
            }
            if (sorted) { //若该趟未发生交换说明已排好序，可以终止后续比较趟数
                break;
            }

        }
    }


}
