package Test_Collection.Sort.innerType;

import java.util.Arrays;
import java.util.Date;

/**
 * Date类数组比较
 */
public class Demo03 {
    public static void main(String[] args) {
        Date arr[] = new Date[3];
        arr[0] = new Date();// now time
        arr[1] = new Date(System.currentTimeMillis()-1000*60*60);//1 hour ago
        arr[2] = new Date(System.currentTimeMillis()+1000*60*60);//1 hour later
        //降序排列
        boolean sorted;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) { //趟数
            sorted = true; //假定有序
            for (int i = 0; i < len - 1 - j; i++) { //次数
                //若是自定义泛型数组强转为Comparable接口就可以使用compareTo了
                if (((Comparable) arr[i]).compareTo(arr[i + 1]) < 0) {
                    //若要降序排列只需把上面改为<0即可
                    Date temp = arr[i];
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
