package Test_Collection.Sort.innerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections对容器的比较
 */
public class Demo05 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("abcd");
        list.add("abc");
        list.add("def");
        Collections.sort(list,new StringComp());
        System.out.println(list);
        System.out.println("########################");
        list = new ArrayList<>();
        list.add("a");
        list.add("abcd");
        list.add("abc");
        list.add("def");
        Collections.sort(list);
        System.out.println(list);

    }
}
