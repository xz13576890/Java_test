package Test_Collection.Sort.innerType;

import java.util.Arrays;

/**
 *把Comparable接口应用到冒泡排序中进行字符串数组
 */
public class Demo02 {

    public static void main(String[] args) {
        String arr[] = {"a", "abcd","abc", "def"};
        //实现从小到大排序
        boolean sorted;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) { //趟数
            sorted = true; //假定有序
            for (int i = 0; i < len - 1 - j; i++) { //次数
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    //若要降序排列只需把上面改为<0即可
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false; //若发生了交换则说明无序，假定失败
                }
            }
            if (sorted) { //若该趟未发生交换说明已排好序，可以终止后续比较趟数
                break;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
