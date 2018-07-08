package Test_Collection.Sort.innerType;


import java.util.Comparator;
import java.util.List;

/**
 * 用于排序的工具类
 */
public class Utils {
    /**
     * 数组的排序（降序）
     */
    public static void sort(Object arr[]) {
        //从大到小降序排列
        boolean sorted;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) { //趟数
            sorted = true; //假定有序
            for (int i = 0; i < len - 1 - j; i++) { //次数
                //若是自定义泛型数组强转为Comparable接口就可以使用compareTo了
                if (((Comparable) arr[i]).compareTo(arr[i + 1]) < 0) {
                    //若要降序排列只需把上面改为<0即可
                    Object temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false; //若发生了交换则说明无序，假定失败
                }
            }
            if (sorted) { //若该趟未发生交换说明已排好序，可以终止后续比较趟数
                break;
            }
        }
    }

    /**
     * 数组的排序（降序）+ Comparator接口
     */
    public static <T> void sort(Object[] arr, Comparator<T> comp) {
        //从大到小降序排列
        boolean sorted;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) { //趟数
            sorted = true; //假定有序
            for (int i = 0; i < len - 1 - j; i++) { //次数
                if (comp.compare((T) arr[i], (T) arr[i + 1]) < 0) {
                    //若要升序排列只需把上面改为 > 0 即可
                    Object temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false; //若发生了交换则说明无序，假定失败
                }
            }
            if (sorted) { //若该趟未发生交换说明已排好序，可以终止后续比较趟数
                break;
            }
        }

    }

    /**
     * 泛型排序(使用泛型方法)
     */

    public static <T extends Comparable<T>> void sort(T[] arr) {
        //从大到小降序排列
        boolean sorted;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) { //趟数
            sorted = true; //假定有序
            for (int i = 0; i < len - 1 - j; i++) { //次数
                //泛型方法已经继承了Comparable接口就可以使用compareTo了
                if (arr[i].compareTo(arr[i + 1]) < 0) {
                    //若要升序排列只需把上面改为 > 0 即可
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false; //若发生了交换则说明无序，假定失败
                }
            }
            if (sorted) { //若该趟未发生交换说明已排好序，可以终止后续比较趟数
                break;
            }
        }

    }

    /**
     * 容器的排序
     */
    public static <T extends Comparable<T>> void sort(List<T> list) {
        //第一步：转成数组
        Object[] arr = list.toArray();
        sort(arr);
        //第二部：改变容器中对应的值
        for (int i = 0; i < arr.length; i++) {
            list.set(i, (T) (arr[i]));
        }

    }

    /**
     * 容器的排序+Comparator接口
     */
    public static <T> void sort(List<T> list, Comparator<T> comp) {
        //第一步：转成数组
        Object[] arr = list.toArray();
        sort(arr, comp);
        //第二部：改变容器中对应的值
        for (int i = 0; i < arr.length; i++) {
            list.set(i, (T) (arr[i]));

        }
    }


}
