package Test_Collection.Sort.innerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Demo04 {

    public static void main(String[] args) {
        //时间类
        Date arr[] = new Date[3];
        arr[0] = new Date();// now time
        arr[1] = new Date(System.currentTimeMillis() - 1000 * 60 * 60);//1 hour ago
        arr[2] = new Date(System.currentTimeMillis() + 1000 * 60 * 60);//1 hour later
        Utils.sort(arr);//降序
        System.out.println(Arrays.toString(arr));
        System.out.println("######################");

        //字符串
        String arr2[] = {"a", "abcd", "abc", "def"};
        Utils.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("######################");

        //存放容器中
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("abcd");
        list.add("abc");
        list.add("def");
        Utils.sort(list);
        System.out.println(list);

    }
}
