package Test_Collection.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试set常用方法
 */
public class TestSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("aaa");
        set.add("bbb");
//        set.add("bbb");
        System.out.println(set.size());
        System.out.println(set.contains("aaa"));
    }
}
